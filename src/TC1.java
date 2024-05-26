import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void Beforeclass(){
        System.out.println("This will execute Before class");

    }

    @BeforeMethod
    void BeforeMethod(){
        System.out.println("This will execute Before method");

    }
    @Test
    public void test1()
    {
        System.out.println("This will execute test1");
        }
    @Test
    public void test2()
    {
        System.out.println("This will execute test2");
    }
    @AfterMethod
    void Aftermethod(){
        System.out.println("This will execute After method");

    }
    @AfterClass
    void Afterclass(){
        System.out.println("This will execute after class");

    }

}
