package com.ityun.response;

/**
 * response
 */
public class Response {
    private int code;
    private String message;
    private Object data;

    public Response() {
    }

    public Response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Response success(int code, String message, Object data) {
        return new Response(code, message, data);
    }

    public static Response error(int code, String message, Object data) {
        return new Response(code, message, data);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
