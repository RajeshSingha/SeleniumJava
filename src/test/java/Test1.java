import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {

    public static String browser = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, ParseException {

        openBrowser("chrome");

//        String pageURL = "http://demo.guru99.com/test/web-table-element.php";
//        driver.get(pageURL);
//        driver.manage().window().maximize();

//        Select s = new Select(driver.findElement(By.name("country")));
//        s.selectByIndex(5);
//        WebElement element = driver.findElement(By.id("user-name"));
//        element.sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//
////        Relative locator
////        By cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
////        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[1]/span[1]/svg")).click();
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
//
//        List<WebElement> webElements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
//        for(WebElement webElement : webElements){
//            System.out.println(webElement);
//        }
//        System.out.println(webElements.size());
//
//
////        Select select = new Select();
//
//        String anotherURl = "https://github.com/MohamedDhiaJemai/Books-to-Prepare-Oracle-Java-Certification-Exams/find/master";
////        driver.navigate().to(anotherURl);
////
////        driver.close();
//
//        driver.findElement(By.id("dskjfds")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//
//        Actions moveTo = new Actions(driver);
//        moveTo.moveToElement(element);
//        moveTo.perform();
//        driver.switchTo().frame(0);
//        Actions actions = new Actions(driver);
//        WebElement sourceElement = driver.findElement(By.id("draggable"));
//        WebElement targetElement = driver.findElement(By.id("droppable"));
//
//        actions.clickAndHold(sourceElement).
//                moveToElement(targetElement).
//                release().build().perform();

//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")).click();
//        Thread.sleep(3000);

//        WebElement e = driver.findElement(By.id("uploadfile_0"));
//        e.sendKeys("C:\\Users\\singh\\Downloads\\JohanCruyff.txt");
//
//        driver.findElement(By.id("terms")).click();
//        driver.findElement(By.id("submitbutton")).click();

//        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
//        String sourceLocation = downloadButton.getAttribute("href");
//        System.out.println(sourceLocation);
//
//        String wget_command = "cmd /c C:\\Users\\singh\\Desktop\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//
//        try {
//            Process exec = Runtime.getRuntime().exec(wget_command);
//            int exitVal = exec.waitFor();
//            System.out.println("Exit value: " + exitVal);
//        } catch (InterruptedException | IOException ex) {
//            System.out.println(ex.toString());
//        }
//        driver.close();

//        driver.findElement(By.name("cusid")).sendKeys("1");
//        driver.findElement(By.name("submit")).click();
//
//        Alert a = driver.switchTo().alert();
//        String alertMessage= driver.switchTo().alert().getText();
//        System.out.println(alertMessage);
//        a.accept();
//        driver.switchTo().alert().accept();

//        driver.findElement(By.xpath("//a[@href = \"../articles_popup.php\"]")).click();
//
//
//        String mainWindow = driver.getWindowHandle();
//
//        //to handle all new open window
//        Set<String> s = driver.getWindowHandles();
//        Iterator<String> i = s.iterator();
//
//        while(i.hasNext()){
//            String childWindow = i.next();
//
//            if(!mainWindow.equalsIgnoreCase(childWindow)){
//                //switching to child window
//                driver.switchTo().window(childWindow);
//                driver.findElement(By.name("emailid")).sendKeys("rajeshreve@gmail.com");
//                driver.findElement(By.name("btnLogin")).click();
//
//                Thread.sleep(3000);
//                driver.close();
//            }
//        }
//
//        driver.switchTo().window(mainWindow);

//        List<WebElement> col = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr[1]/th"));
//        System.out.println("column count is : " + col.size());
//
//        List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
//        System.out.println("row count is : " + row.size());
//
//        List<WebElement> numbers = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[3]"));
//        String maxs;
//        double maxi=0;
//
//        for (int i=0;i<row.size(); i++) {
//            maxs  = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i+1) + "]/td[3]")).getText();
//            double val = Double.parseDouble(maxs);
//
//            if(val > maxi){
//                maxi = val;
//            }
//        }
//        System.out.println("max is : " + maxi);
//

        String homePage = "http://www.zlti.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(homePage);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href");
            System.out.println(url);

            if(url == null || url.isEmpty()){
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        System.out.println("Done...");
    }

    private static void openBrowser(String browser) {
        switch (browser) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
    }

    private static void anotherWayToOpenBrowser() {
//        Another way to setup webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }


}
