package com.bw.entity;

/**
 * Created by hasee on 2019/7/30.
 */
public class Result {
    private Boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Result [success=" + success + ", message=" + message + "]";
    }
}
