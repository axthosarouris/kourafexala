/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kourafexala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {

  @Test
  void shouldReturnExpectedMessage() {
    Hello hello = new Hello();
    assertEquals("Hello world", hello.greetings());
  }
}
