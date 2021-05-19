package com.wowapxah;

public class Main {
    /***
    ** путь к файлу с вопросами - изменить на свое
    ***/
    private static final String FILENAME = "D:\\java\\review\\module5.txt";

    public static void main(String[] args) {
        Logic logic = new Logic(FILENAME);
        logic.run();
    }
}
