package org.iptime.hoonyhoony.default_setting.exception;

public class CustomException extends RuntimeException {
    private ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
