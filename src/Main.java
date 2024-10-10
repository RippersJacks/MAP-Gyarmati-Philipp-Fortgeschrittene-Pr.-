import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        System.out.println("Aufgabe 1");

        //Aufgabe 1
        Aufgabe1 university = new Aufgabe1();
        int[] arrayNoten = new int[]{50, 47, 69, 30, 17, 81, 73};

        //Methode1
        System.out.println("Unausreichende Noten: " + Arrays.toString(university.Methode1(arrayNoten)));
        //Methode2
        System.out.println("Durchschnitt: " + university.Methode2(arrayNoten));
        //Methode3
        System.out.println("Aufgerundete Noten: " + Arrays.toString(university.Methode3(arrayNoten)));
        //Methode4
        System.out.println("Grosste aufgerundete Note: " + university.Methode4(arrayNoten));


        System.out.println("\nAufgabe 2");

        //Aufgabe 2
        int[] arrayParam = new int[]{4,8,3,10,17};
        Aufgabe2 arrayOfNumbers = new Aufgabe2(arrayParam);

        //Methode1
        System.out.println("Maximalzahl: " + arrayOfNumbers.findeMaxi());
        //Methode2
        System.out.println("Minimalzahl: " + arrayOfNumbers.findeMini());
        //Methode3
        System.out.println("Maximale Summe von n-1 Zahlen: " + arrayOfNumbers.maximaleSumme());
        //Methode4
        System.out.println("Minimale Summe von n-1 Zahlen: " + arrayOfNumbers.minimaleSumme());


        System.out.println("\nAufgabe 3");

        //Aufgabe 3
        int[] nummer1 = new int[]{6,5,7,0,2};
        int[] nummer2 = new int[]{3,6,5,8,3};
        Aufgabe3 arrayZahlen = new Aufgabe3(nummer1, nummer2);

        //Methode1
        System.out.println("Summe der Zahlen: " + Arrays.toString(arrayZahlen.summeBerechnen()));
        //Methode2
        System.out.println("Differenz der Zahlen: " + Arrays.toString(arrayZahlen.differenzBerechnen()));
        //Methode3
        System.out.println("Multiplikation der Zahlen: " + Arrays.toString(arrayZahlen.multiplikationBerechnen(2)));
        //Methode4
        System.out.println("Division der Zahlen: " + Arrays.toString(arrayZahlen.divisionBerechnen(2)));


        System.out.println("\nAufgabe 4");

        //Aufgabe 4
        int[] USBpreise = new int[]{40,35,70,15,45};
        int[] tastaturPreise = new int[]{15,20,10,35};
        Aufgabe4 elektronikShop = new Aufgabe4(USBpreise, tastaturPreise);

        //Methode1
        System.out.println("Billigste Tastatur: " + elektronikShop.billigsteTastatur());
        //Methode2
        System.out.println("Teuerster Preis: " + elektronikShop.teuersterGegenstand());
        //Methode3
        System.out.println("Teuerstes USB, das Mark kaufen kann: " + elektronikShop.teuersteKaufbareUSB(45));
        //Methode4
        System.out.println("Hochster Geldbetrag, den Mark spenden kann: " + elektronikShop.maximalerGeldbetrag(55));
    }
}