package com.liuxj.user.mvvm.net;

/**
 * Created by LiuXJ on 2017/9/29.
 */

public class Result<T> {
    private T Data;
    private int status;
    private String message;

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Data=" + Data +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
