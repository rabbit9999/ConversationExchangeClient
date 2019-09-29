package ru.bitrapid.conversationexchangeclient.api.rest;

public interface RestApiCallback<T> {
    void run(T res);
}
