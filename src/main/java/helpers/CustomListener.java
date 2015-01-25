package helpers;

import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;

import java.io.File;
import java.util.Date;

public class CustomListener extends ExitCodeListener {
    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
        System.out.println(result.getMethod().getTestClass().getName() + "-" +
                result.getMethod().getMethodName() + " started at " + new Date());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        System.out.println(result.getMethod().getTestClass().getName() + "-" +
                result.getMethod().getMethodName() + " failed at " + new Date());
        File file = new File ("./target/screenshots/" + result.getMethod().getTestClass().getName());
        file.mkdirs();
        Actions.takeScreenhot(file.getPath() + "/" + result.getMethod().getMethodName() + ".png");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        super.onTestSuccess(result);
        System.out.println(result.getMethod().getTestClass().getName() + "-" +
                result.getMethod().getMethodName() + " passed at " + new Date());
    }
}
