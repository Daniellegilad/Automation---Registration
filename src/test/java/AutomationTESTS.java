import org.junit.Assert;
import org.junit.Test;

public class AutomationTESTS {
        @Test
        public void getUrlTest() {//comparing if the link is correct
            AutomationPractice da = new AutomationPractice ("C:\\Users\\gilda\\Desktop\\chromedriver.exe");
            Assert.assertEquals (da.SignUpTest(),"http://automationpractice.com/index.php");
        }
        @Test
        public void sss() throws InterruptedException {// testing if the registry was successful.
            AutomationPractice da= new AutomationPractice
                    ("C:\\Users\\gilda\\Desktop\\chromedriver.exe");
            Assert.assertEquals
                    (da.foo(),"My account - My Store");
        }
    }


