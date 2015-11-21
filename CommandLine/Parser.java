import org.apache.commons.cli.*;

class Parser {
    private int left;
    private int right;
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

        Option inputOperation = new Option("o", "operation", true, "operation");
        inputOperation.setArgs(1);
        inputOperation.setArgName("operation ");

        clOptions.addOption(inputOperation);

        CommandLineParser cmdLinePosixParser = new DefaultParser();
        org.apache.commons.cli.CommandLine commandLine = cmdLinePosixParser.parse(clOptions, args);

        left = Integer.decode( commandLine.getOptionValue("l"));
        right = Integer.decode( commandLine.getOptionValue("r"));
        operation = commandLine.getOptionValue("o");
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public String getOperation() {
        return operation;
    }
}
