package day14;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class C04 {

        public static void main(String[] args) {

            ExtentReports extentReports;
            ExtentSparkReporter extentSparkReporter;
            ExtentTest extentTest;
            extentReports = new ExtentReports();
            extentTest=extentReports.createTest("test01");
            String path = System.getProperty("user.dir") + "/test-output" +"/reportsTest" + "/index.html";
            extentSparkReporter = new ExtentSparkReporter(path);
            extentReports.attachReporter(extentSparkReporter);
            extentReports.flush();
        }
    }
