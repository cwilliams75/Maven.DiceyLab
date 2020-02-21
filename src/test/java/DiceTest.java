import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


    @Test
    public void toss() {

        //Given
        Dice dice1 = new Dice (2, 7);
        dice1.setseed();

        //When
        int result = dice1.toss();
        System.out.println(result);

        result = dice1.toss();
        System.out.println(result);

        result = dice1.toss();
        System.out.println(result);

        result = dice1.toss();
        System.out.println(result);

        //Then
        Assert.assertEquals(result, 11);
    }
}
