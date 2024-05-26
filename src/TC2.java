import org.testng.annotations.*;

public class TC2 {
    @BeforeSuite
    void Beforesuite(){
        System.out.println("This will execute Before suite");

    }

    @BeforeTest
    void Beforetest(){
        System.out.println("This will execute Before test");

    }

    @BeforeClass
    void Beforeclass(){
        System.out.println("This will execute Before class");

    }

    @BeforeMethod
    void BeforeMethod(){
        System.out.println("This will execute Before method");

    }

    @Test
    void test3()
    {
        System.out.println("This will execute test3");
    }
    @Test
    void test4()
    {
        System.out.println("This will execute test4");
    }
    @AfterMethod
    void Aftermethod(){
        System.out.println("This will execute After method");

    }
    @AfterClass
    void Afterclass(){
        System.out.println("This will execute after class");

    }
    @AfterTest
    void Aftertest(){
        System.out.println("This will execute after test");

    }
    @AfterSuite
    void Aftersuite(){
        System.out.println("This will execute after suite");

    }
}
