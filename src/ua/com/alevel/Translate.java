package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Translate {

    public String inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Текст: ");
        String text = reader.readLine();
        return text;
    }

    public void translateText(String text) {

        char[] textArr = text.toCharArray();

        for (int i = 0; i < textArr.length; i++) {
            for (NATO el : NATO.values()) {
                if (textArr[i] == el.getC()) {
                    System.out.print(el.getTitle());
                }
            }
        }
    }
}


