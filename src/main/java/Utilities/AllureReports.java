package Utilities;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

//import static com.sun.activation.registries.LogSupport.log;
import static org.apache.commons.compress.harmony.pack200.PackingUtils.log;

public class AllureReports extends Setup {

    @Attachment(value = "Screenshot", type = "image/png")
    public static void screenShot(String value) {
        Allure.addAttachment(value, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Step("{0}")
    public static void logToReport(String message) {log(message);
    }

}