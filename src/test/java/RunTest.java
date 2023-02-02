import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
public class RunTest  {

    @Before
    public void beforeSecond(){
        System.out.println("Сначала привет!");
    }
    @After
    public void afterFirst(){
        System.out.println("Потом пока!");
    }
    @Test
    public void firstTest(){
        int a = 5;
        int b = 4;
        int answer = a*b;
        Assert.assertEquals(answer, 20);

    }
    @Test
    public void secondTest(){
        String string = "Целое число";
        System.out.println(string);
        Assert.assertSame("Ожидаемый и полученный объекты - разные", string, "123");
    }

}
