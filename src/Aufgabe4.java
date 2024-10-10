public class Aufgabe4 {
    int[] USBpreise, tastaturPreise;

    Aufgabe4(int[] usbPreiseParam, int[] tastaturPreiseParam){
        USBpreise = usbPreiseParam;
        tastaturPreise = tastaturPreiseParam;
    }

    int billigsteTastatur(){
        int mini = 99999;
        for (int preis: tastaturPreise){
            if (mini > preis)
                mini = preis;
        }
        return mini;
    }

    int teuersterGegenstand(){
        int maxi = 0;
        for (int preis: USBpreise){
            if (preis > maxi)
                maxi = preis;
        }
        for (int preis: tastaturPreise){
            if (preis > maxi)
                maxi = preis;
        }
        return maxi;
    }

    int teuersteKaufbareUSB(int budget){
        int maxi = 0;
        for (int preis: USBpreise){
            if (preis > maxi && preis <= budget)
                maxi = preis;
        }
        return maxi;
    }

    int maximalerGeldbetrag(int budget){
        int maxi = -1;

        for (int usbPreis: USBpreise){
            for (int tastaturPreis: tastaturPreise){
                if (usbPreis + tastaturPreis > maxi && usbPreis + tastaturPreis <= budget)
                {
                    maxi = usbPreis + tastaturPreis;
                }
            }
        }
        return maxi;
    }
}
