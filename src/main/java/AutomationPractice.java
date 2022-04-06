import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
    private String url;
    public AutomationPractice(String url) {
        this.url = url;
    }
    public String SignUpTest() {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        return driver.getTitle();
    }
    public String foo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
           driver.get("http://automationpractice.com/");
           System.out.println(driver.getCurrentUrl());
            WebElement searchTextBox = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
            searchTextBox.click();
            WebElement fillEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
            fillEmail.sendKeys("fipdanel20@gmail.com");
            WebElement clcit = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
            clcit.click();
            WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
            firstName.sendKeys("danielle");
            WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
            lastName.sendKeys("gilad");
            WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
            password.sendKeys("Daniellegilad13244");
            WebElement dayDate = driver.findElement(By.xpath("//*[@id=\"days\"]"));
            dayDate.sendKeys("8");
            dayDate.click();
            WebElement monthDate= driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
            monthDate.click();
            WebElement yearDate = driver.findElement(By.xpath("//*[@id=\"years\"]"));
            yearDate.sendKeys("2000");
            yearDate.click();
            WebElement addressName= driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
            addressName.sendKeys("danielle");
            WebElement addressLast = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
            addressLast.sendKeys("gilad");
            WebElement address= driver.findElement(By.xpath("//*[@id=\"address1\"]"));
            address.sendKeys("sumsum");
            WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
            city.sendKeys("sumsumcity");
            WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[11]"));
            state.click();
            WebElement zipcode= driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
            zipcode.sendKeys("41118");
            WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
            country.click();
            WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
            phone.sendKeys("+1917663453");
            WebElement address2 = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
            address2.sendKeys("JohnnyAve");
            WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
            register.click();
        return driver.getTitle();
    }
}
