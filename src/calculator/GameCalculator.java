package calculator;

public  abstract class GameCalculator  {
    public abstract double hesapla(double puan);

    public final void gameOver(){
        System.out.println("Oyun Bitti ");
    }
}
