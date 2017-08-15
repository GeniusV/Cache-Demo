/**
 * Copyright 2017 GeniusV
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.geniusv.util;

import org.apache.log4j.Logger;


public class LoggerUtil {

    public static void debug(Class<?> clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.debug(message);
    }

    public static void debug(Class<?> clazz, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.debug(message);
    }

    public static void debug(Class<?> clazz, Exception e, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.debug(message, e);
    }

    public static void debug(Class<?> clazz, Exception e, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.debug(message, e);
    }

    public static void warn(Class<?> clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.warn(message);
    }

    public static void warn(Class<?> clazz, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.warn(message);
    }

    public static void warn(Class<?> clazz, Exception e, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.warn(message, e);
    }

    public static void warn(Class<?> clazz, Exception e, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.warn(message, e);
    }

    public static void error(Class<?> clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.error(message);
    }

    public static void error(Class<?> clazz, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.error(message);
    }

    public static void error(Class<?> clazz, Exception e, String message) {
        Logger logger = Logger.getLogger(clazz);
        if (null == e) {
            logger.error(message);
            return;
        }
        logger.error(message, e);
    }

    public static void error(Class<?> clazz, Exception e, String message, Object... objects) {
        Logger logger = Logger.getLogger(clazz);
        if (objects.length != 0) {
            message = String.format(message, objects);
        }
        logger.error(message, e);
    }


    /**
     *
     * @param clazz
     * @param formatString
     * @param values
     *
     * @deprecated use debug() instead
     */
    @Deprecated
    public static void formatDebug(Class<?> clazz, String formatString, Object... values) {
        if (values.length != 0) {
            formatString = String.format(formatString, values);
        }
        debug(clazz, formatString);
    }

    /***
     *
     * @param clazz
     * @param e
     * @param formatString
     * @param value
     *
     * @deprecated use error() instead
     */
    @Deprecated
    public static void formatError(Class<?> clazz, Exception e, String formatString, Object... value) {

        if (null != value && value.length != 0) {
            formatString = String.format(formatString, value);
        }
        error(clazz, e, formatString);
    }

    /***
     *
     * @param clazz
     * @param formatString
     * @param value
     *
     * @deprecated use error() instead
     */
    @Deprecated
    public static void formatError(Class<?> clazz,
                                   String formatString, Object... value) {

        if (null != value && value.length != 0) {
            formatString = String.format(formatString, value);
        }
        error(clazz, formatString);
    }

}
