public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;

    }

    public LogLevel getLogLevel() {
        return switch (this.logLine.split(":")[0]) {
            case "[INF]" -> LogLevel.INFO;
            case "[DBG]" -> LogLevel.DEBUG;
            case "[TRC]" -> LogLevel.TRACE;
            case "[WRN]" -> LogLevel.WARNING;
            case "[ERR]" -> LogLevel.ERROR;
            case "[FTL]" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        for (LogLevel level : LogLevel.values())
            if (level == this.getLogLevel())
                return level.getEncodedLevel() + ":" + this.logLine.split(":")[1].trim();
        return null;
    }
}
