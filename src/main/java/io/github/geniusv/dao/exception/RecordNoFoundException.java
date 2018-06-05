package io.github.geniusv.dao.exception;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/12/17.
 */
public class RecordNoFoundException extends RuntimeException {

    public RecordNoFoundException() {
        super();
    }

    public RecordNoFoundException(String message) {
        super(message);
    }

    public RecordNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordNoFoundException(Throwable cause) {
        super(cause);
    }

    protected RecordNoFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
