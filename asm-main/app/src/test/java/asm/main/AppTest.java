/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package asm.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(1), "app should have a greeting");
    }
}
