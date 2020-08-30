package ru.geekbrains_java_2;

public class ArraySizeException extends RuntimeException { //наследование

    public ArraySizeException() { //создание исключения без какого-либо исключения
    }

    public ArraySizeException(String message) { // создание исключения с передачей сообщения
        super(message);
    }

    public ArraySizeException(String message, Throwable cause) { // создание исключения с передачей сообщения и другого исключения
        super(message, cause);
    }
}
