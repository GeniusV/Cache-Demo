package io.github.geniusv.util;

import org.apache.log4j.Logger;

/**
 * Created by GeniusV on 8/6/17.
 */
public class LoggerUtil {

    public static void debug(Class<?> clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.debug(message);
    }

    public static void formatDebug(Class<?> clazz, String formatString, Object... values) {
        if (values.length != 0) {
            formatString = String.format(formatString, values);
        }
        debug(clazz, formatString);
    }
    public static void error(Class<?> clazz, String message) {
        error(clazz, message, null);
    }

    public static void error(Class<?> clazz, String message, Exception e) {
        Logger logger = Logger.getLogger(clazz);
        if (null == e) {
            logger.error(message);
            return;
        }
        logger.error(message, e);
    }

    public static void formatError(Class<?> clazz, Exception e, String formatString, Object... value) {

        if (null != value && value.length != 0) {
            formatString = String.format(formatString, value);
        }
        error(clazz, formatString, e);
    }

    public static void formatError(Class<?> clazz,
                                   String formatString, Object... value) {

        if (null != value && value.length != 0) {
            formatString = String.format(formatString, value);
        }
        error(clazz, formatString);
    }

}
