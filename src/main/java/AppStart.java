import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AppStart {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://planner5d.com/e/");
    }

    @Test
    public void AppObjectDelete() throws InterruptedException {

        System.out.println("0. Accept Agreement");
        driver.findElement(By.xpath("//*[@id=\"termsAgree\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"termsAgreeBtn\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"modal-cookies-policy\"]/span[2]")).click();

        System.out.println("1. Start Web Application");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[19]/div/div[4]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        System.out.println("2. Close 'Hints' window");
        driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div[1]")).click();
        Thread.sleep(2000);
        System.out.println("3. Select the object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"uid7\"]")).click();
        Thread.sleep(2000);
        System.out.println("4. Delete object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[27]/div[12]")).click();
        Thread.sleep(2000);
         }
    @Test
    public void CreatingRoom()throws InterruptedException{
        System.out.println("0. Accept Agreement");
        driver.findElement(By.xpath("//*[@id=\"termsAgree\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsAgreeBtn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-cookies-policy\"]/span[2]")).click();

        System.out.println("1. Start Web Application");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[19]/div/div[4]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        System.out.println("2. Close 'Hints' window");
        driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div[1]")).click();
//        Thread.sleep(2000);
        System.out.println("3. Select the object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"uid7\"]")).click();
//        Thread.sleep(2000);
        System.out.println("4. Delete object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[27]/div[12]")).click();
//        Thread.sleep(2000);
        System.out.println("5. Creating object 'Room'");
        WebElement room = driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/div[2]"));
        WebElement viewport = driver.findElement(By.xpath("//*[@id=\"uid5\"]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(room).moveToElement(viewport).release().build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void Entering3D() throws InterruptedException{
        System.out.println("0. Accept Agreement");
        driver.findElement(By.xpath("//*[@id=\"termsAgree\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsAgreeBtn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-cookies-policy\"]/span[2]")).click();

        System.out.println("1. Start Web Application");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[19]/div/div[4]/div[1]/div[1]")).click();

        System.out.println("2. Close 'Hints' window");
        driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div[1]")).click();

        System.out.println("3. Select the object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"uid7\"]")).click();

        System.out.println("4. Delete object 'Room'");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[27]/div[12]")).click();

        System.out.println("5. Creating object 'Room'");
        WebElement room = driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/div[2]"));
        WebElement viewport = driver.findElement(By.xpath("//*[@id=\"uid5\"]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(room).moveToElement(viewport).release().build().perform();
        Thread.sleep(2000);
        System.out.println("6. Enter in 3D mode");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[2]/div[5]/div[1]")).click();
        Thread.sleep(2000);
    }

    @After
    public void ExitTest(){
    driver.quit();
    }
}