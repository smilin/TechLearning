import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textexpected="Sign in";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL="https://www.google.com";
		driver.get(URL);
		driver.findElement(By.xpath("//img[@alt='Google']"));
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		String text1=e1.getText();
		if(text1.equalsIgnoreCase(textexpected)) {
			System.out.println("The Expected output is obtained");
		}
    	driver.close();

	}

}
