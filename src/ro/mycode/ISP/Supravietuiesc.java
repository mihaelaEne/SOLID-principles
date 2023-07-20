package ro.mycode.ISP;

public class Supravietuiesc implements Mananc, Dorm{


    @Override
    public void manac3Mese() {
        System.out.println("Am 3 mese pe zi");
    }

    @Override
    public void dormCelPutin4Ore() {
        System.out.println("Dorm macar 4 ore");
    }
}
