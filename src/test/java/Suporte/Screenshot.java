package Suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

import static org.apache.commons.io.FileUtils.*;

public class Screenshot {
    public static void tirar (WebDriver navegador, String arquivo) {
        File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
        try {
            copyFile(screenshot, new File(arquivo));
        } catch (Exception e){
            System.out.println("Erro ao gravar arquivo" + e.getMessage());
        }

    }


}
