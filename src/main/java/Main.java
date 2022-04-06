import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gilda\\Desktop\\chromedriver.exe");//adding chromedriver to the project


        WebDriver driver = new ChromeDriver();// defining a webdriver sub method

        driver.get("http://automationpractice.com/");//opening the designated site
        System.out.println(driver.getCurrentUrl());//printing the url

        //driver.manage().window().maximize();
        // driver.manage().window().setSize(new Dimension());
        WebElement searchTextBox = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));//searching for the text box xpath
        searchTextBox.click();//clicking the button
        WebElement fillEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));//locating email box
        fillEmail.sendKeys("fipdanel20098@gmail.com");//filling email
        Thread.sleep(2500);//hold
        WebElement clcit = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));//locating submit box
        clcit.click();// clicking submit
        Thread.sleep(2500);//hold
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstName.sendKeys("daniel");//filling first name
        Thread.sleep(2500);//hold
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastName.sendKeys("gil");//filling last name;
        Thread.sleep(2500);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("Daniellegilad13244");//filling password
        Thread.sleep(2500);//hold
        WebElement dayDate = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        dayDate.sendKeys("8");
        dayDate.click();//filling and clicking birthday
        Thread.sleep(2500);
        WebElement monthDate= driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
        monthDate.click();//clicking birth month
        Thread.sleep(2500);
        WebElement yeardate = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        yeardate.sendKeys("2000");
        yeardate.click();//selecting birth year
        Thread.sleep(2500);
        WebElement address= driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        address.sendKeys("sumsum");// filling address
        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys("sumsumcity");//filling address city
        WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[11]"));
        state.click();//selecting state
        Thread.sleep(2500);
        WebElement zipcode= driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        zipcode.sendKeys("41118");// filling zip code
        Thread.sleep(2500);
        WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
        country.click();//selecting country
        Thread.sleep(2500);
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        phone.sendKeys("+1917663453");// filling phone number
        WebElement address2 = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        address2.sendKeys("JohnnyAve");// filling street address
        Thread.sleep(2500);
        WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        register.click();//completing registry
    }
}