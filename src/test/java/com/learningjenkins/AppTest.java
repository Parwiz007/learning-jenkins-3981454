package learningjenkins;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for App class.
 */
public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testMainMethod() {
        // Redirect System.out to capture the output
        System.setOut(new PrintStream(outContent));

        try {
            // Call the main method
            App.main(new String[]{});

            // Verify the output (use platform-specific newline)
            assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
        } finally {
            // Restore System.out
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMainMethodWithArguments() {
        // Redirect System.out to capture the output
        System.setOut(new PrintStream(outContent));

        try {
            // Call the main method with arguments
            App.main(new String[]{"arg1", "arg2"});

            // Verify the output (use platform-specific newline)
            assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
        } finally {
            // Restore System.out
            System.setOut(originalOut);
        }
    }
}
