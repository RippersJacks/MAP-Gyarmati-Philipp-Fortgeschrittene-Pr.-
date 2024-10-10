public class Aufgabe1 {

    int[] Methode1(int[] arrayNoten){
        int[] unausreichendeNoten = new int[20];
        int index = 0;

        for (int note: arrayNoten){
            if (note < 38) //unausreichend
            {
                unausreichendeNoten[index] = note;
                index++;
            }
        }
        //cut array down to amount of grades left in it
        int[] aux = new int[index];
        for (int i=0;i<index;i++)
            aux[i] = unausreichendeNoten[i];

        return aux;
    }

    int Methode2(int[] arrayNoten){
        int anzahl=0, summe=0;
        for (int note: arrayNoten){
            summe += note;
            anzahl++;
        }
        return summe/anzahl;
    }

    int[] Methode3(int[] arrayNoten){
        int[] abgerundeteNoten = new int[arrayNoten.length];
        int index = 0;

        for (int note: arrayNoten){
            if ((note + 1) % 5 == 0)    //z.B. 49
                abgerundeteNoten[index] = note + 1;
            else
               if ((note + 2) % 5 == 0)  //z.B. 48
                 abgerundeteNoten[index] = note + 2;
               else
                 abgerundeteNoten[index] = note;

               index++;
        }
        return abgerundeteNoten;
    }

    int Methode4(int[] arrayNoten){
        int[] abgerundeteNoten = new int[arrayNoten.length];
        int index = 0;

        int maxi=0, punktAufgerundet = 0;

        for (int note: arrayNoten){
            if ((note + 1) % 5 == 0)   // z.B. 49
                if (punktAufgerundet == 0)
                {
                    maxi = note;
                    punktAufgerundet = 1;
                }

            if ((note + 2) % 5 == 0)   //z.B. 48  --> grosste Aufrundung
                if (punktAufgerundet < 2)
                {
                    maxi = note;
                    punktAufgerundet = 2;
                }

            index++;
        }
        return maxi;
    }
}
