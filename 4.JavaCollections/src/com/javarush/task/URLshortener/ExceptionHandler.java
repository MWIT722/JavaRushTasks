package com.javarush.task.URLshortener;

public class ExceptionHandler {
    public static void log(Exception e) {
        Helper.printMessage(e.toString());
    }
}
