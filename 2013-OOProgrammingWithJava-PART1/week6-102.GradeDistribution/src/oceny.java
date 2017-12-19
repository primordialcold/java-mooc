import java.util.ArrayList;

public class oceny {

    private ArrayList<Integer> oceny;
    private int piatki = 0;
    private int czworki = 0;
    private int trojki = 0;
    private int dwojki = 0;
    private int jedynki = 0;
    private int zera = 0;
    private int[] iloscOcen = new int[6];

    public oceny() {
        this.oceny = new ArrayList<Integer>();
    }

    public void dodajOcene(int ocena) {
        this.oceny.add(ocena);
    }

    public void wyplujOceny() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for(int j = 0; j < iloscOcen[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void zliczOceny(){
        for (int ocena : oceny){
            if(ocena == 5){
                this.piatki++;
            } else if (ocena == 4) {
                this.czworki++;
            } else if (ocena == 3) {
                this.trojki++;
            } else if (ocena == 2) {
                this.dwojki++;
            } else if (ocena == 1) {
                this.jedynki++;
            } else {
                this.zera++;
            }
        }
    }

    public void podajOceny(){
        iloscOcen[5] = this.piatki;
        iloscOcen[4] = this.czworki;
        iloscOcen[3] = this.trojki;
        iloscOcen[2] = this.dwojki;
        iloscOcen[1] = this.jedynki;
        iloscOcen[0] = this.zera;
    }
}
