package com.centraleNantes.poei2.steven;


public class Exercice5 {
    public static String getDayOfweek(int language, int day) {
        String[][] tableauJourMultilingue = new String[2][7];
        tableauJourMultilingue[0] = new String[]{"Lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
        tableauJourMultilingue[1] = new String[]{"Monday", "tuesday", "wednesday", "thirsday", "fryday", "saturday", "sunday"};
        return tableauJourMultilingue[language][day - 1];
    }
    public static void needDay(int day) throws ArrayIndexOutOfBoundsException{
        if(day < 1 || day > 6) {
            throw new ArrayIndexOutOfBoundsException("Day out of range");
        } else {
            System.out.println(getDayOfweek(0, day));
        }
    }
    public static void alwaysReturnDay(int day) {
        if(day < 0 || day > 6) {
            System.out.println(getDayOfweek(0, 4));
        } else {
            System.out.println(getDayOfweek(0, day));
        }
    }

    public static void main(String[] args) {
        try {
            alwaysReturnDay(10);
            needDay(10);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
