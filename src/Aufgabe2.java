import java.util.Arrays;

public class Aufgabe2 {
    int n;
    int[] array = new int[n];

    Aufgabe2(int[] arrayParam){
        n = arrayParam.length;
        array = arrayParam;

        System.out.println(Arrays.toString(array));
    }

    int findeMaxi(){
        int maxi = 0;
        for (int i=0;i<n;i++)
            if (array[i] > maxi)
                maxi = array[i];
        return maxi;
    }

    int findeMini(){
        int mini = 50000;
        for (int i=0;i<n;i++)
            if (array[i] < mini)
                mini = array[i];
        return mini;
    }

    int maximaleSumme(){
        int mini = 50000, summe = 0;
        for (int i=0;i<n;i++){
            summe += array[i];
            if (array[i] < mini)
                mini = array[i];
        }
        summe -= mini;
        return summe;
    }

    int minimaleSumme(){
        int maxi = 0, summe = 0;
        for (int i=0;i<n;i++){
            summe += array[i];
            if (array[i] > maxi)
                maxi = array[i];
        }
        summe -= maxi;
        return summe;
    }
}
