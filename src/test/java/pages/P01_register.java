package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import Pages.PageBase;

public class P01_register extends PageBase {
    WebDriver driver;


    By Gender = By.id("gender-male");
    By fristname = By.id("FirstName");
    By lastname = By.id("LastName");
    By selectDay = By.xpath("//select[@name='DateOfBirthDay']");
    By selectMonth = By.name("DateOfBirthMonth");
    By selectyear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By companyname = By.id("Company");
    By newsletter = By.id("Newsletter");
    By password = By.id("Password");
    By ConfirmPassword =By.id("ConfirmPassword");
    By clickregisterbutton = By.id("register-button");

    public P01_register(WebDriver driver) {
        super(driver);
    }



    public void setGender() {
        clickOnelement(Gender);
    }

    public void setFristname() {setelementtext(fristname,"automation");}

    public void setLastname() {
        setelementtext(lastname, "tester");
    }

    public void selectDay(){
        Select Day=new Select(driver.findElement(selectDay));
        Day.selectByValue("3");
    }
    public void selectMonthh(){
        Select Month=new Select(driver.findElement(selectMonth));
        Month.selectByIndex(11);
    }
    public void selectYear(){
        Select Year=new Select(driver.findElement(selectyear));
        Year.selectByValue("1997");
    }


public void setEmail(){
        setelementtext(Email,"test@example.com1");
}
public void setCompanyname(){
        setelementtext(companyname,"Company");
}
public void setNewsletterc(){
        clickOnelement(newsletter);
}
public void setPassword(){
        setelementtext(password,"P@ssw0rd");
}
public void setConfirmPassword(){
        setelementtext(ConfirmPassword,"P@ssw0rd");
}
public void setClickregisterbutton(){
        clickOnelement(clickregisterbutton);
}
}
