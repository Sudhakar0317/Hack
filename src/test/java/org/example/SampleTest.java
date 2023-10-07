package org.example;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test(priority = 0)
    public void sample(){
        test= extent.createTest("Browser launch","This is sample test");
        // performe test
        test.log(Status.INFO,"Browser Launched");
        test.log(Status.PASS,"test is pass");
        test.log(Status.FAIL,"test 1 is fail");

        // end of test
        extent.flush();
    }

    @Test(priority = 1)
    public void second(){
        test=extent.createTest("Login the Application","User Login");

        // login fail or pass
        test.log(Status.INFO," Login Attempt");
        test.log(Status.PASS,"Login passed");


    }
}
