package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    ExtentTest test;
    ExtentReports extent;
    ExtentSparkReporter spark;

    @BeforeSuite
    public void setup(){
        spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

}
