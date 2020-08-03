package ua.com.alevel;

public enum NATO {
    ALFA("Alfa", 'A'),
    BRAVO("Bravo", 'B'),
    CHARLIE("Charlie", 'C'),
    DELTA("Delta", 'D'),
    ECHO("Echo", 'E'),
    FOXTROT("Foxtrot", 'F'),
    GOLF("Golf", 'G'),
    HOTEL("Hotel", 'H'),
    INDIA("India", 'I'),
    JULIET("Juliet", 'J'),
    KILO("Kilo", 'K'),
    LIMA("Lima", 'L'),
    MIKE("Mike", 'M'),
    NOVEMBER("November", 'N'),
    OSCAR("Oscar", 'O'),
    PAPA("Papa", 'P'),
    QUEBEC("Quebec", 'Q'),
    ROMEO("Romeo", 'R'),
    SIERRA("Sierra", 'S'),
    TANGO("Tango", 'T'),
    UNIFORM("Uniform", 'U'),
    VICTOR("Victor", 'V'),
    WHISKEY("Whiskey", 'W'),
    XRAY("Xray", 'X'),
    YANKEE("Yankee", 'Y'),
    ZULU("Zulu", 'Z'),
    ZERO("Zero", '0'),
    ONE("One", '1'),
    TWO("Two", '2'),
    TREE("Tree", '3'),
    FOUR("Four", '4'),
    FIVE("Five", '5'),
    SIX("Six", '6'),
    SEVEN("Seven", '7'),
    EIGHT("Eight", '8'),
    NINE("Nine", '9');

    private String title;
    private char c;

    NATO(String title, char c) {
        this.title = title;
        this.c = c;
    }

    public String getTitle() {
        return title;
    }

    public char getC() {
        return c;
    }
}
