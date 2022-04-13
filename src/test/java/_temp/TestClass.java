package _temp;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class TestClass {

    @Test
    public void test1(){
        MethodClass methodClass = new MethodClass();

        int expected = 55;
        int actual = methodClass.sum(10);

        Assert.assertEquals(actual, expected, "Method hatali");


    }

    @Test
    public void test2(){
        MethodClass methodClass = new MethodClass();

        int expected = 3;
        int actual = methodClass.sum(2);

        Assert.assertEquals(actual, expected, "Method hatali");


    }
}
