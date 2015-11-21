import org.jargp.*;
import org.apache.commons.cli.*;

public class CommandLine {

    public static int calculate(String[] args) throws ParseException {

        Parser parser = new Parser(args);
        Operation operation = parser.getOperation();

        return operation.apply(parser.getLeft(),parser.getRight());
    }

    public static void main(String[] args) throws ParseException {

        System.out.println(calculate(args));
    }
}
