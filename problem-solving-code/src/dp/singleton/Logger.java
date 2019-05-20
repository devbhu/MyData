package dp.singleton;

import java.util.Objects;

public class Logger {
    public static volatile Logger logger;

    public static Logger getInstance() {
        if (Objects.isNull(logger)) {
            synchronized (Logger.class) {
                if (Objects.isNull(logger)) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
