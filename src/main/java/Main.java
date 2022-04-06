import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gilda\\Desktop\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/");
        System.out.println(driver.getCurrentUrl());

        //driver.manage().window().maximize();
        // driver.manage().window().setSize(new Dimension());
        WebElement searchTextBox = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        searchTextBox.click();
        WebElement fillEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        fillEmail.sendKeys("fipdanel20@gmail.com");
        Thread.sleep(2500);
        WebElement clcit = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        clcit.click();
        Thread.sleep(2500);
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstName.sendKeys("danielle");
        Thread.sleep(2500);
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastName.sendKeys("gilad");
        Thread.sleep(2500);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("Daniellegilad13244");
        Thread.sleep(2500);
        WebElement dayDate = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        dayDate.sendKeys("8");
        dayDate.click();
        Thread.sleep(2500);
        WebElement monthDate= driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
        monthDate.click();
        Thread.sleep(2500);

        WebElement yeardate = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        yeardate.sendKeys("2000");
        yeardate.click();
        WebElement addressName= driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        addressName.sendKeys("danielle");
        Thread.sleep(2500);

        WebElement addresslast = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        addresslast.sendKeys("gilad");
        WebElement address= driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        address.sendKeys("sumsum");
        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys("sumsumcity");
        WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[11]"));
        state.click();
        Thread.sleep(2500);

        WebElement zipcode= driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        zipcode.sendKeys("41118");
        Thread.sleep(2500);

        WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
        country.click();
        Thread.sleep(2500);

        WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        phone.sendKeys("+1917663453");
        WebElement address2 = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        address2.sendKeys("JohnnyAve");
        Thread.sleep(2500);

        WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        register.click();
    }
}