package com.example.demo;

import java.awt.Robot;
import java.util.Random;

public class Test {

  public static void main(String[] args) throws Exception {
    test();
  }






  private static void  test() throws Exception {
    Robot robot = new Robot();
  Random random = new Random();
    while (true) {
      robot.delay(1000 * 60);
      int x = random.nextInt() % 640;
      int y = random.nextInt() % 480;
      robot.mouseMove(x, y);
    }
  }
}