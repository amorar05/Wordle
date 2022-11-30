package es.unileon.prg1.wordle;

import static es.unileon.prg1.wordle.Keyboard.readString;

public class WordleTextUI {


    public WordleTextUI(Wordle wordle) {
    }

    public void init() {
    }

    public String getUserTry() {
        System.out.println("Introduzca una palabra de 5 letras");
        String userTry = readString();
        return userTry;
    }



}
