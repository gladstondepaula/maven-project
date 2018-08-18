package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Return a Hello message.
   * @param someone a text to be returned com hello
   *
   * @return Return Hello message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
