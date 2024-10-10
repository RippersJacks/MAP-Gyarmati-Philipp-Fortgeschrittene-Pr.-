public class Aufgabe3 {
    int[] number1, number2;
    int n;

    Aufgabe3(int[] number1Param, int[] number2Param) {
        number1 = number1Param;
        number2 = number2Param;
        n = number1.length;
    }

    int[] summeBerechnen(){
        int[] summe = new int[n+1];
        for (int i = 0; i < n+1; i++) {summe[i] = 0;}

        for (int i=n-1; i>=0; i--){
            summe[i+1] += number1[i] + number2[i];  //i+1, damit wir [9,9] + [0,3] zu [1,0,2] fuhren konnen
            if (summe[i+1] > 9)
            {
                summe[i+1] %= 10;
                summe[i]++;
            }
        }
        return summe;
    }

    int[] differenzBerechnen(){
        int[] differenz = new int[n];
        for (int i=0; i<n; i++) differenz[i] = number1[i];  //kopieren von number1 uber differenz

        for (int i=n-1; i>=1; i--){
            if (differenz[i] < number2[i])
            {
                differenz[i] += 10;
                differenz[i] -= number2[i];    // 3-5  --> 13-5 --> 8

                // -1 auf die vorige Ziffer uberfuhren
                if (differenz[i-1] == 0)
                {
                    int index = i-1;
                    while (differenz[index] == 0)
                    {
                        differenz[index] = 9;
                        index--;
                    }
                    differenz[index]--;
                    //z.B. 40085 - 00090 = 39995
                }
                else
                    differenz[i-1]--;
            }
            else
                differenz[i] -= number2[i];
        }
        differenz[0] -= number2[0];
        return differenz;
    }

    int[] multiplikationBerechnen(int ziffer){
        int[] multiplikation = new int[n+1];
        for (int i=1;i<=n;i++) multiplikation[i] = number1[i-1];  //number1: [1,0,2,2] --> multiplikation: [0,1,0,2,2]
        multiplikation[0] = 0;

        int[] plusArray = new int[n+1];
        for (int i=0;i<=n;i++) plusArray[i] = 0;
        //Erklarung plusArray:
        //das Hinzufugen auf die nachste Position wird am Ende gemacht (also wenn [2,7] die 7 verdoppelt wird -> 14,
        //wird die Position 4, aber die 1 aus der 14 wird nur am Ende zu 2 hinzugefugt, damit diese nicht nochmal multipliziert wird

        //                 0 1 2 3 4 n=5
        //multiplikation: [0,0,0,0,0,0]
        //plusArray:      [0,0,0,0,0,0]

        for (int i=n;i>0;i--)
        {
            multiplikation[i] *= ziffer;    //[9] --> [81]
            plusArray[i-1] = multiplikation[i] / 10;
            multiplikation[i] %= 10;   //[81] --> [1]
        }


        //von summeBerechnen kopiert
        int[] summe = new int[n+1];
        for (int i = 0; i < n+1; i++) {summe[i] = 0;}

        for (int i=n; i>=0; i--){
            summe[i] += multiplikation[i] + plusArray[i];
            if (summe[i] > 9)
            {
                summe[i] %= 10;
                summe[i-1]++;
            }
        }
        return summe;
    }

    /*
    int[] divisionBerechnen(int ziffer){  //einfache Methode gewahlt, weil ich nicht wusste, wie die Regel fur die Division lautet
        int nr = 0;
        for (int i=0;i<n;i++)
            nr = nr * 10 + number1[i];
        nr = nr / ziffer;

        int[] division = new int[n];
        for (int i=n-1; i>=0; i--){
            division[i] = nr % 10;
            nr /= 10;
        }
        return division;
    }
    */

    int[] divisionBerechnen(int ziffer){  //nach Erklarung von chatGPT
        int[] division = new int[n];
        for (int i=0;i<n;i++)
            division[i] = number1[i];

        int remainder = 0;  //anfangs immer 0
        //fur jede Ziffer: (remainder * 10 + division[i]) / ziffer
        // remainder = rest der Teilung

        for (int i=0;i<n;i++)
        {
            int aux = division[i];
            division[i] = (remainder * 10 + division[i]) / ziffer;
            remainder = (remainder * 10 + aux) % ziffer;
        }

        return division;
    }
}
