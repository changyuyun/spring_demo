package com.ityun.response;

/**
 * response no data
 */
public class ResponseNoData {
    private int code;
    private String message;

    public ResponseNoData() {
    }

    public ResponseNoData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseNoData success(int code, String message) {
        return new ResponseNoData(code, message);
    }

    public static ResponseNoData error(int code, String message) {
        return new ResponseNoData(code, message);
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
