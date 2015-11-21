import org.jargp.*;
import org.apache.commons.cli.*;

public class CommandLine {

    public static int calculate(String[] args) {
        int res = 0;
        StringDef stringArgs = new StringDef(args);
        ArgumentProcessor argProc = new ArgumentProcessor(new ParameterDef[] (args)));

        return res;
    }

}
