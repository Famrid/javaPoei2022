package Steven;

import java.util.Scanner;

public class Exercice5 {
    public String getDayOfweek(int language, int day) {
        String[][] tableauJourMultilingue = new String[2][7];
        tableauJourMultilingue[0] = new String[]{"Lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
        tableauJourMultilingue[1] = new String[]{"Monday", "tuesday", "wednesday", "thirsday", "fryday", "saturday", "sunday"};

        return tableauJourMultilingue[language][day - 1];
    }

    public static void main(String[] args) {

    }
}
