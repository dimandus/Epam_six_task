import org.junit.Test;

import static org.junit.Assert.*;

public class CommandLineTest {

    @Test
    public void testCalculate() throws Exception {

        String input = "-l 2 -r 3 -o +";

        assertEquals(CommandLine.calculate(input.split(" ")), 5);
    }
}