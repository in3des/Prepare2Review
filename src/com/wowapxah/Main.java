package com.wowapxah;

import java.io.File;
import java.util.Collections;

public class Main {
    /***
    ** путь к файлу с вопросами - изменить на свое
    ***/

//    private static final String FILENAME = "./preproject-final.txt";
//    private static final String FILENAME = "./preproject-final.txt";
//    private static final String FILENAME = "./sobes_core1.txt";
//    private static final String FILENAME = "./sobes_core2.txt";
//    private static final String FILENAME = "./sobes_multi.txt";
//    private static final String FILENAME = "./sobes_sql.txt";
//    private static final String FILENAME = "./sobes_hiber.txt";
//    private static final String FILENAME = "./sobes_jdbc.txt";
//    private static final String FILENAME = "./sobes_spring.txt";
    private static final String FILENAME = "./sobes_spring.txt";
//    private static final String FILENAME = "./sobes_pattern.txt";
//    private static final String FILENAME = "./sobes_algo.txt";
//    private static final String FILENAME = "./sobes_dop.txt";

    public static void main(String[] args) {
        Logic logic = new Logic(FILENAME);
        logic.run();

    }



}
