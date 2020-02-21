public class Simulation {


    private int numberOfDice;
    private int numberOfThrows;
    Dice accessDiceClass;
    Bins accessBinsClass;

    public Simulation(int numberOfDice, int numberOfThrows){
        this.numberOfDice = numberOfDice;
        this.numberOfThrows = numberOfThrows;
        this.accessDiceClass = new Dice(numberOfThrows);
        this.accessBinsClass = new Bins(numberOfDice);

    }
    public void runSimulation(){
       Integer results = 0;
        Simulation sim = new Simulation(numberOfDice,numberOfThrows);
        for (int i = 1; i <numberOfThrows ; i++) {
            Integer randomNumOfResult = accessDiceClass.toss();
            for (int j = 0; j <accessBinsClass.BinCounter.size() ; j++) {
                if(j+ numberOfDice == randomNumOfResult){
                    accessBinsClass.BinCounter.set(j, accessBinsClass.BinCounter.get(j)+1);

                }
            }
        }


    }


}
