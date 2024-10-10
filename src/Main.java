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
    }
}