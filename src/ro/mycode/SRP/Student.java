package ro.mycode.SRP;

public class Student {

    private String nume;
    private int nota;
    private int bursa;



    public String numeleStudentului(){
        return nume;
    }

    public Float calculBaniDinBursa(float tva){
        tva=0.19f;
        if(nota>8){
            return bursa-(bursa*tva);
        }else{
            return null;
        }
    }
}
