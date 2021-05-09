package com.example.common.Message;

/**
 * 消息类
 */
public class MessageBase {

    private final String message;

    public String getMessage() {
        return message;
    }

    public MessageBase(String message) {
        this.message = message;
    }
}