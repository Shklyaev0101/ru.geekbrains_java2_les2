package ru.geekbrains_java_2;

public class ArrayDataException extends RuntimeException{
    public ArrayDataException() {
    }

    public ArrayDataException(String message) {
        super(message);
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
