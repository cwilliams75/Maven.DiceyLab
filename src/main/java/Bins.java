import java.util.ArrayList;

public class Bins {

   public ArrayList<Integer> BinCounter = new ArrayList<Integer>();

   public Bins (int numberOfDice){
       int minAmountOfRolls = numberOfDice;
       int maxAmountOfRolls = numberOfDice * 6;

       for (int i = minAmountOfRolls; i <= maxAmountOfRolls ; i++) {
           this.BinCounter.add(0);

       }

   }

}
