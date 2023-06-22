@Service
public class SequenceNumberService {
    private final SequenceNumberRepository sequenceNumberRepository;

    public SequenceNumberService(SequenceNumberRepository sequenceNumberRepository) {
        this.sequenceNumberRepository = sequenceNumberRepository;
    }

    public String getNextSequenceNumber() {
        // Find the sequence number document by ID
        SequenceNumber sequenceNumber = sequenceNumberRepository.findById("sequenceNumberId");

        // If the sequence number doesn't exist, create a new document
        if (sequenceNumber == null) {
            sequenceNumber = new SequenceNumber();
            sequenceNumber.setId("sequenceNumberId");
        }

        // Increment the current sequence value
        long nextValue = sequenceNumber.getValue() + 1;

        // Check if the numeric part has reached its maximum value (A999999999)
        if (nextValue > 999999999) {
            // Transition to the next alphabet sequence (e.g., from A to B)
            char currentAlphabet = sequenceNumber.getId().charAt(0);
            char nextAlphabet = (char) (currentAlphabet + 1);
            sequenceNumber.setId(nextAlphabet + "0000000000");
            nextValue = 1; // Reset the numeric part to 1
        }

        sequenceNumber.setValue(nextValue);

        // Save the updated sequence number document
        sequenceNumberRepository.save(sequenceNumber);

        // Generate the alphanumeric sequence number
        String alphanumericSequenceNumber = generateAlphanumericSequence(sequenceNumber.getId(), nextValue);

        return alphanumericSequenceNumber;
    }

    private String generateAlphanumericSequence(String alphabet, long value) {
        String paddedValue = String.format("%010d", value);
        return alphabet + paddedValue;
    }
}
