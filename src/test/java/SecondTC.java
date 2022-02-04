import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTC {

    @Test(priority = 1)
    public void setup(){
        System.out.println("setup");
    }

    @Test(priority = 3)
    public void searchCustomer(){
        System.out.println("search Customer");
    }

    @Test(priority = 2)
    public void addCustomer(){
        System.out.println("add Customer");
//        Assert.assertEquals(1,2);
    }

    @Test(priority = 4, enabled = false)
    public void closeBrowser(){
        System.out.println("close Browser");
    }
}
