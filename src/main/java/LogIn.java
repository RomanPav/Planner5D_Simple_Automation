import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://planner5d.com");
    }

    @Test
    public void loginWithEmptyLogAndPass()throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"termsAgree\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsAgreeBtn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-cookies-policy\"]/span[2]")).click();

        System.out.println("1. Click on 'Sign In'");
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        System.out.println("2. Empty 'Email' field");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[1]/div/input")).sendKeys("");
        Thread.sleep(2000);
        System.out.println("2. Empty 'Password' field");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[2]/div/input")).sendKeys("");
        Thread.sleep(2000);
        System.out.println("3. Click 'Log In'");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[4]/button")).click();
        Thread.sleep(2000);

    }

    @Test
    public void InvalidLogAndPass()throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"termsAgree\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsAgreeBtn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"modal-cookies-policy\"]/span[2]")).click();

        System.out.println("1. Click on 'Sign In'");
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        System.out.println("2. Type invalid 'Email'");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[1]/div/input")).sendKeys("Nickelback@gmail.com");
        Thread.sleep(2000);
        System.out.println("2. Type invalid 'Password'");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[2]/div/input")).sendKeys("qwerty1234");
        Thread.sleep(2000);
        System.out.println("3. Click 'Log In'");
        driver.findElement(By.xpath("//*[@id=\"modal-signin\"]/div[2]/section/form/div[4]/button")).click();
        Thread.sleep(2000);

    }




    @After
    public void Exit(){
        driver.quit();
    }
}
