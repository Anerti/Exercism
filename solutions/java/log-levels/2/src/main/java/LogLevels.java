public class LogLevels {
    
    public static String message(String logLine) {
        String[] output = logLine.split(":");
        return output[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] output = logLine.toLowerCase().split(":");
        output = output[0].split("");
        String message = "";
        for (int i = 1; i < output.length - 1; i++)
        {
            message += output[i];
        }
        return message;
    }

    public static String reformat(String logLine) {
        String output = message(logLine);
        String info = logLevel(logLine);
        String result = output + " " + "(" + info + ")";
        return result;
    }
}
