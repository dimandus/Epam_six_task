import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParser() throws Exception {

        String input = "-l 2 -r 3 -o +";

        Parser parser = new Parser(input.split(" "));

        assertEquals(2, parser.getLeft());
        assertEquals(3, parser.getRight());
        assertEquals("+", parser.getOperation().toString());
    }
}