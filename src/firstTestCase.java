import org.testng.annotations.Test;

public class firstTestCase {

    @Test(priority=1)
    public void setup(){
    System.out.println("Setup..");
}

    @Test(priority=2)
    public void login(){
        System.out.println("login..");
    }

    @Test(priority=3)
    public void testdown(){
        System.out.println("close..");
    }

}
