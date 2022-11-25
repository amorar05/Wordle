package es.unileon.prg1.wordle;


public class MainWordle {

    public static void main(String[] args){
        Wordle wordle;
        WordleTextUI ui;

        wordle = new Wordle(source, longWord, numTries);
        ui = new WordleTextUI(wordle);
        ui.init();
    }

}