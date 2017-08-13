package io.github.geniusv.util;

import org.junit.Test;

/**
 * LoggerUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 9, 2017</pre>
 */
public class LoggerUtilTest {

    private String message = "this is the message %s";

    @Test
    public void testDebug() {
        System.out.println("debug");
        LoggerUtil.debug(getClass(), message);
        LoggerUtil.debug(getClass(), message, message);
        try {
            LoggerUtil.debug(getClass(), new Exception("test"), message);
        } catch (Exception e) {
        }
        try {
            LoggerUtil.debug(getClass(), new Exception("test"), message, message);
        } catch (Exception e) {
        }
    }

    @Test
    public void testWarn() {
        System.out.println("warn");
        LoggerUtil.warn(getClass(), message);
        LoggerUtil.warn(getClass(), message, message);
        try {
            LoggerUtil.warn(getClass(), new Exception("test"), message);
        } catch (Exception e) {
        }
        try {
            LoggerUtil.warn(getClass(), new Exception("test"), message, message);
        } catch (Exception e) {
        }
    }

    @Test
    public void testError() {
        System.out.println("error");
        LoggerUtil.error(getClass(), message);
        LoggerUtil.error(getClass(), message, message);
        try {
            LoggerUtil.error(getClass(), new Exception("test"), message);
        } catch (Exception e) {
        }
        try {
            LoggerUtil.error(getClass(), new Exception("test"), message, message);
        } catch (Exception e) {
        }
    }

} 
