package calculator;

public class WomanGameCalculator  extends GameCalculator{

    public double hesapla(double puan){

        System.out.println("kadın puanı hesaplandı  :" + puan*0.95);


        return puan*0.95;
    }

}
