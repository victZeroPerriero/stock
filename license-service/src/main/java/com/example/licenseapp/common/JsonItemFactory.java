package com.example.licenseapp.common;

import org.springframework.http.HttpStatus;

import java.util.Map;

public class JsonItemFactory<T>{
    private JsonItemFactory() {
        //not called
    }

    /**
     * Успешный ответ.
     *
     * @param data - данные
     * @param <T>  - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> successResult(T data) {
        return new JsonItem<>(true, HttpStatus.OK.value(), data, null, null);
    }

    /**
     * Успе шный ответ.
     *
     * @param data     - данные
     * @param editable - редактируемый
     * @param <T>      - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> successResult(T data, boolean editable) {
        return new JsonItem<>(true, null, data, editable);
    }

    /**
     * Успешный ответ.
     *
     * @param <T> - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> successResult() {
        return new JsonItem<>(true, HttpStatus.OK.value(), null, null, null);
    }

    /**
     * Ответ с ошибкой.
     *
     * @param errors - ошибка
     * @param <T>    - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> failResult(Map<String, String> errors) {
        return new JsonItem<>(false, errors, null);
    }

    /**
     * Ответ с ошибкой.
     *
     * @param errors - ошибка
     * @param data - описание
     * @param <T>  - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> failResult(Map<String, String> errors, T data) {
        return new JsonItem<>(false, errors, data);
    }

    /**
     * Ответ с ошибкой.
     *
     * @param data - данные
     * @param <T>  - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> failResult(T data) {
        return new JsonItem<>(false, null, data);
    }

    /**
     * Ответ с ошибкой.
     *
     * @param <T> - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> failResult() {
        return new JsonItem<>(false, null, null);
    }

    /**
     * Ответ с HttpStatus-code.
     *
     * @param data       - данные
     * @param statusCode - статус код
     * @param <T>        - тип ответа
     * @return - объект json
     */
    public static <T> JsonItem<T> resultWithStatusCode(T data, Integer statusCode) {
        return new JsonItem<>(data, statusCode);
    }
}


