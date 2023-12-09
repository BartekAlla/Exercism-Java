import com.sun.source.tree.ReturnTree;

public class LogLevels {
    public static char getType(String logLine) {
        if (logLine.startsWith("[INFO]: ")) {
            return 'i';
        } else if (logLine.startsWith("[WARNING]: ")) {
            return 'w';
        } else if (logLine.startsWith("[ERROR]: ")) {
            return 'e';
        } else {
            return '0';
        }
    }

    public static String message(String logLine) {
        char type = getType(logLine);
        return switch (type) {
            case 'i' -> logLine.substring("[INFO]: ".length()).trim();
            case 'w' -> logLine.substring("[WARNING]: ".length()).trim();
            case 'e' -> logLine.substring("[ERROR]: ".length()).trim();
            default -> "";
        };
    }

    public static String logLevel(String logLine) {
        char type = getType(logLine);
        return switch (type) {
            case 'i' -> "info";
            case 'w' -> "warning";
            case 'e' -> "error";
            default -> "";
        };
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
