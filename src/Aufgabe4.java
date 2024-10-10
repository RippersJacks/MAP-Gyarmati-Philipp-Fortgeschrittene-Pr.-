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
}
