package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // by locators
    private By username= By.xpath("//input[@id='user-name']");
    private By password = By.xpath("//input[@id='password']");

    private By login_btn= By.xpath("//input[@id='login-button']");

    private By menu_btn= By.xpath("//button[@id='react-burger-menu-btn']");

    private By logout_link= By.xpath("//a[@id='logout_sidebar_link']");

    //Constructor
    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    // page methods
    public void enterUsername(String userName){
        WebElement userInput= driver.findElement(username);
        userInput.sendKeys(userName);
    }

    public void enterUserPwd(String pwd){
        WebElement userPwd= driver.findElement(password);
        userPwd.sendKeys(pwd);
    }

    public void clickLogin(){
        WebElement login= driver.findElement(login_btn);
        login.click();
    }

    public boolean checklogoutlink(){
        driver.findElement(menu_btn).click();
        return driver.findElement(logout_link).isDisplayed();
    }

    public void Login(String userName,String pwd){
        enterUsername(userName);
        enterUserPwd(pwd);
        clickLogin();
    }


}
