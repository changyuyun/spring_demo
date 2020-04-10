package com.ityun.response;

/**
 * response no data
 */
public class ResponseNoData {
    private int code;
    private String message;

    public ResponseNoData() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
