import org.junit.Assert;
import org.junit.Test;

public class BinsTest{

    @Test
    public void Test1(){
        // Given
        Bins bins = new Bins(2);

        // When
        Integer expectedSize = 11;
        Integer actualSize = bins.BinCounter.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

}