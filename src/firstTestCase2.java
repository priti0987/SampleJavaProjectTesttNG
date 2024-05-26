import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTestCase2 {

    @Test(priority=1)
    public void setup(){
    System.out.println("Setup2..");
}

    @Test(priority=2)
    public void login(){
        System.out.println("login2..");
    }

    @Test(priority=3)
    public void add(){
        System.out.println("loginadd2..");
        Assert.assertEquals(2,2);
    }

    @Test(priority=4)
    public void testdown(){
        System.out.println("close2..");
    }

}
