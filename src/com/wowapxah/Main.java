package com.wowapxah;

import java.io.IOException;

public class Main {
    /***
    ** путь к файлу с вопросами - изменить на свое
    ***/
    private static final String FILENAME = "D:\\java\\review\\module7.txt";

    public static void main(String[] args) {
        Logic logic = new Logic(FILENAME);
        logic.run();
    }
}