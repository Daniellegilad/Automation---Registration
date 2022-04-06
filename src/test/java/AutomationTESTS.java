import org.junit.Assert;
import org.junit.Test;

public class AutomationTESTS {
        @Test
        public void getUrlTest() {
            AutomationPractice da = new AutomationPractice ("C:\\Users\\gilda\\Desktop\\chromedriver.exe");
            Assert.assertEquals (da.SignUpTest(),"http://automationpractice.com/");
        }
        @Test
        public void sss() throws InterruptedException {
            AutomationPractice da= new AutomationPractice
                    ("C:\\Users\\gilda\\Desktop\\chromedriver.exe");
            Assert.assertEquals
                    (da.foo(),"http://automationpractice.com/");
        }
    }


