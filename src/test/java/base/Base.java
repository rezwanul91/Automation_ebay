package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
	protected static WebDriver driver;
	
	public static void navigateUrl(String url) {
		driver.get(url);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void sendkeys(By by , String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static String getElementText(By by) {
		WebElement element = driver.findElement(by);
		return element.getText();
	}
	
	public static void clear(By by) {
		driver.findElement(by).click();
	}
	
	public static void ccokies(By by) {
		driver.findElement(by);
	}
	
	public static void mouseHover(By by) {
		WebElement hovEle = driver.findElement(by);
		Actions act = new Actions(driver);
		act.moveToElement(hovEle).build().perform();
		act.contextClick();
		
	}
	
	public static void windowHandles(){ 
		Set<String> windowhandles = driver.getWindowHandles();
	    Iterator <String> iterator= windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(parentwindow);
		driver.switchTo().window(childwindow);
	
		}
	
	public static void backNev() {
		driver.navigate().back();
	}

}//class
