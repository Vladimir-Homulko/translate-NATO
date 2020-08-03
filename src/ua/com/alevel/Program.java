package ua.com.alevel;

import java.io.IOException;

public class Program {

    public void program() throws IOException {
        Translate translate = new Translate();
        translate.translateText(translate.inputText());
    }

}
