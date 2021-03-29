package Testes;

import Suporte.Generator;
import Suporte.Screenshot;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.security.PublicKey;

public class CadUserTest {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();

    @Before

    public void setup(){
        System.setProperty("webdriver.chromedriver", "C:\\Users\\Fran\\Drivers\\chromedrivere.exe");
        navegador = new ChromeDriver();
        navegador.get("https://www.catclub.com.br/");
        Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() +".png");

        //Acessar o menu de Acessar/Cadastrar
        navegador.findElement(By.cssSelector("#dropdownMenuButton")).click();

        //Clicar no submenu Acessar/Cadastrar
        navegador.findElement(By.linkText("Entrar / Cadastrar")).click();
        Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() +".png");
    }
       @Test

       public void test1CadastrarUsuario() {

            //Clicar em criar conta
            navegador.findElement(By.linkText("Criar conta")).click();

            //Preencher o formulario
            navegador.findElement(By.id("firstname")).click();
            Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() + ".png");
            navegador.findElement(By.id("firstname")).clear();
            navegador.findElement(By.id("firstname")).sendKeys("Teste");
            navegador.findElement(By.id("lastname")).click();
            navegador.findElement(By.id("lastname")).clear();
            navegador.findElement(By.id("lastname")).sendKeys("Automacao");
            navegador.findElement(By.id("email_address")).click();
            navegador.findElement(By.id("email_address")).clear();
            navegador.findElement(By.id("email_address")).sendKeys("automacao2@yahoo.com");
            navegador.findElement(By.id("day")).click();
            navegador.findElement(By.id("day")).clear();
            navegador.findElement(By.id("day")).sendKeys("10");
            navegador.findElement(By.id("month")).click();
            navegador.findElement(By.id("month")).clear();
            navegador.findElement(By.id("month")).sendKeys("10");
            navegador.findElement(By.id("year")).click();
            navegador.findElement(By.id("year")).clear();
            navegador.findElement(By.id("year")).sendKeys("1985");
            navegador.findElement(By.id("taxvat")).click();
            navegador.findElement(By.id("taxvat")).clear();
            navegador.findElement(By.id("taxvat")).sendKeys("188.457.990-69");
            navegador.findElement(By.id("password")).click();
            navegador.findElement(By.id("password")).clear();
            navegador.findElement(By.id("password")).sendKeys("teste123");
            Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() + ".png");
            navegador.findElement(By.id("confirmation")).click();
            navegador.findElement(By.id("confirmation")).clear();
            navegador.findElement(By.id("confirmation")).sendKeys("teste123");
            navegador.findElement(By.xpath("//button[@type='submit']")).click();
            Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() + ".png");
            navegador.findElement(By.id("dropdownMenuButton")).click();
            navegador.findElement(By.linkText("Sair")).click();
            Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() + ".png");
        }

        @Test
        public void test2Login() {
            //Realizar Login com o usuário criado
            navegador.findElement(By.id("email")).click();
            navegador.findElement(By.id("email")).sendKeys("automacao2@yahoo.com");
            navegador.findElement(By.id("pass")).click();
            navegador.findElement(By.id("pass")).sendKeys("teste123");
            navegador.findElement(By.xpath("//button[@type='submit']")).click();
            Screenshot.tirar(navegador, "C:\\Users\\Fran\\Pictures\\Testes\\" + Generator.datahoraParaArquivo() + test.getMethodName() + ".png");
        }

        @After
        public void teardown() {
            //fechar navegador
            navegador.quit();
        }
     }





