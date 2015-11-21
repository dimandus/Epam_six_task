import org.apache.commons.cli.*;

class Parser {
    private int leftOperand;
    private int rightOperand;
    private String operation;

    public Parser(String[] args) throws ParseException {
        Options clOptions = new Options();

        Option leftOperand = new Option("l", "leftOperand", true, "Left operand");
        leftOperand.setArgs(1);
        leftOperand.setArgName("LeftOperand ");
        clOptions.addOption(leftOperand);

        Option rightOperand = new Option("r", "rightOperand", true, "Right operand");
        rightOperand.setArgs(1);
        rightOperand.setArgName("RightOperand ");

        clOptions.addOption(rightOperand);

        Option operation = new Option("o", "operation", true, "operation");
        operation.setArgs(1);
        operation.setArgName("operation ");

        clOptions.addOption(operation);

        CommandLineParser cmdLinePosixParser = new DefaultParser();
        org.apache.commons.cli.CommandLine commandLine = cmdLinePosixParser.parse(clOptions, args);

        
    }
}
