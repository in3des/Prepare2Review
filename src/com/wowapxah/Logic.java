package com.wowapxah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Logic {
    private final String FILENAME;

    public Logic(String FILENAME) {
        this.FILENAME = FILENAME;
    }

    public void run() {
        process(mapFilling());
    }

    private Map<String, String> mapFilling() {
        Map<String, String> result = new HashMap<>();
        String temp = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            while (reader.ready()) {
                temp = reader.readLine();
                result.put(temp.split("\\|")[0], temp.split("\\|")[1]);
            }
        } catch (IOException e) {
            System.out.println("Файл с вопросами недоступен");
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Файл имеет недопустимый формат. Строка с ошибкой:");
            System.out.println(temp);
            System.exit(0);
        }

        return result;
    }

    private void process(Map<String, String> questions) {
        List<String> dontRight = new ArrayList<>();
        int count = 0;
        int right = 0;
        int random;
        String input;

        List<String> tempList = new ArrayList<>(questions.keySet());

        while (tempList.size() > 0) {
            input = "";
            random = (int) (Math.random() * (tempList.size() - 1));

            String question = tempList.get(random);

            System.out.print(count + 1 + ": ");
            System.out.println(question);

            while (!input.equals("+") && !input.equals("-") && !input.equals("exit")) {
                try {
                    input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                } catch (IOException e) {
                    //doNothing
                }
            }

            switch (input) {
                case "+": {
                    right++;
//                    System.out.println("самопроверка...-");
//                    System.out.println(questions.get(question).replace("\\n", "\n"));
//                    System.out.println("Enter для продолжения...");
//                    try {
//                        new BufferedReader(new InputStreamReader(System.in)).readLine();
//                    } catch (IOException e) {
//                        //doNothing
//                    }
                    break;
                }
                case "-": {
                    dontRight.add(question);
                    System.out.println(questions.get(question).replace("\\n", "\n"));
                    System.out.println("Enter для продолжения...");
                    try {
                        new BufferedReader(new InputStreamReader(System.in)).readLine();
                    } catch (IOException e) {
                        //doNothing
                    }
                    break;
                }
                default: {
                    break;
                }
            }

            tempList.remove(random);

            if (input.equals("exit")) break;
            count++;
        }

        System.out.println("Всего вопросов: " + count);
        System.out.println("Верных ответов: " + right);
        System.out.println("Неверных ответов: " + dontRight.size());
        System.out.println("Вероятность успешного прохождения: " + (100 - ((dontRight.size() * 100) / count)) + "%\n");

        System.out.println("Отвечено неверно:");
        for (String s : dontRight) {
            System.out.println(s);
        }
    }
}
