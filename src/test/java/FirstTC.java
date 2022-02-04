import org.testng.annotations.Test;

public class FirstTC {

    @Test(priority = 1)
    public void setup(){
        System.out.println("setup");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("login");
    }

    @Test(priority = 3)
    public void doSomething(){
        System.out.println("do something");
    }

    @Test(priority = 4)
    public void closeBroswer(){
        System.out.println("close Browser");
    }
}
