/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package annotation.processor.gradle.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
