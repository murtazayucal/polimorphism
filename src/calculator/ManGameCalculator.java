package calculator;

public class ManGameCalculator extends GameCalculator{
     public double hesapla(double puan){
         System.out.println("erkek puanı hesaplandı :" + puan*0.90);
         return puan*0.90;

     }
}
