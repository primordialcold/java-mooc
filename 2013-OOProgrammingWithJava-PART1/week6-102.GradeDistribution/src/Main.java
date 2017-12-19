import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner zbieracz = new Scanner(System.in);
        oceny oceny = new oceny();
        double accepted = 0.0;
        double allScores = 0.0;

        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int wynik = Integer.parseInt(zbieracz.nextLine());
            if (wynik == -1) {
                break;
            } else if (wynik >= 50 && wynik < 61) {
                oceny.dodajOcene(5);
                accepted++;
                allScores++;
            } else if (wynik >= 45 && wynik < 61) {
                oceny.dodajOcene(4);
                accepted++;
                allScores++;
            } else if (wynik >= 40 && wynik < 61) {
                oceny.dodajOcene(3);
                accepted++;
                allScores++;
            } else if (wynik >= 35 && wynik < 61) {
                oceny.dodajOcene(2);
                accepted++;
                allScores++;
            } else if (wynik >= 30 && wynik < 61) {
                oceny.dodajOcene(1);
                accepted++;
                allScores++;
            } else if (wynik <30 && wynik > 0){
                oceny.dodajOcene(0);
                allScores++;
            } else if (wynik < 0 || wynik > 60){

            }
        }
        System.out.println("Grade distribution:");
        oceny.zliczOceny();
        oceny.podajOceny();
        oceny.wyplujOceny();
        double percentage = 100*accepted/allScores;
        System.out.println("Acceptance percentage: " + percentage);
    }
}
