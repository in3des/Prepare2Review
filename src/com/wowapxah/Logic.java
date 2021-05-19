package com.wowapxah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    private final String FILENAME;

    public Logic(String FILENAME) {
        this.FILENAME = FILENAME;
    }

    public void run() {
        process(listFilling());
    }

    private List<String> listFilling() {
        List<String> result = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            while (reader.ready()) {
                result.add(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Файл с вопросами недоступен");
            System.exit(0);
        }

        return result;
    }

    private void process(List<String> questions) {
        List<String> drlist = new ArrayList<>();
        int random;
        int count = 0;
        int right = 0;
        int dRight = 0;
        String input;

        while (questions.size() > 0) {
            input = "";
            random = (int) (Math.random() * (questions.size() - 1));
            System.out.print(count + 1 + ": ");
            System.out.println(questions.get(random));

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
                    break;
                }
                case "-": {
                    dRight++;
                    drlist.add(questions.get(random));
                    break;
                }
                default: {
                    break;
                }
            }
            questions.remove(random);

            if (input.equals("exit")) break;
            count++;
        }
        System.out.println("Всего вопросов: " + count);
        System.out.println("Верных ответов: " + right);
        System.out.println("Неверных ответов: " + dRight);
        System.out.println("Шанс успешной сдачи: " + (100 - ((dRight * 100) / count)) + "%\n");

        System.out.println("Отвечено неверно:");
        for (String s : drlist) {
            System.out.println(drlist.indexOf(s) + 1 + ": " + s);
        }
    }
}
