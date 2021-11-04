package com.wowapxah;

public class Main {
    /***
    ** путь к файлу с вопросами - изменить на свое
    ***/
//    private static final String FILENAME = "/home/user/java/review/preproject-final.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\preproject-final.txt";
    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_core1.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_core2.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_multi.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_sql.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_hiber.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_jdbc.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_spring.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_pattern.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_algo.txt";
//    private static final String FILENAME = "E:\\#WORK\\JM_Projects\\Prepare2Review\\sobes_dop.txt";

    public static void main(String[] args) {
        Logic logic = new Logic(FILENAME);
        logic.run();
    }
}
