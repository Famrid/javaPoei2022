package Steven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        int langue = 0;
        int indexJour = 0;
        String[][] tableauJourMultilingue = new String[2][7];
        tableauJourMultilingue[0] = new String[]{"Lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
        tableauJourMultilingue[1] = new String[]{"Monday", "tuesday", "wednesday", "thirsday", "fryday", "saturday", "sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez selectionner une langue 0 fr, 1 anglais, ainsi que l'index du jour de la semaine");

        if (scanner.hasNextInt()) {
            langue = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            indexJour = scanner.nextInt();
        }
        System.out.println(tableauJourMultilingue[langue][indexJour - 1]);
    }
}
