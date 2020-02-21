import java.util.Random;

public class Dice {

    private int die1;
    private int die2;
    private Random random;
    private int numberOfTosses;


    public Dice(int numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        random = new Random();
    }

    public Integer toss(){
        int counterForTosses = 0;
        for (int i = 0; i < numberOfTosses; i++) {

            counterForTosses +=(random.nextInt(6) +1);
        }
        return counterForTosses;
    }

    public Dice(int numberOfTosses, long seed) {
        this.numberOfTosses = numberOfTosses;
        random = new Random(seed);
    }

    public void setseed(){
        this.random.setSeed(15L);

    }
}
