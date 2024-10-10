import java.util.Arrays;

public class Main {
    public static void main(String[] args){

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
        System.out.println("Grosste Aufrundung: " + university.Methode4(arrayNoten));


    }
}