package koisk.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class kioskstepdef {
	public static WebDriver driver;
	@Given("User should launch the browser.")
	public void user_should_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa.chups.com/kiosk/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    
	}
	@Then("Enter the valid user name {string}.")
	public void enter_the_valid_user_name(String s) {
		WebElement username = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput1']"));
		username.sendKeys(s);
	    
	}
	@Then("Enter the valid password {string}.")
	public void enter_the_valid_password(String s1) {
		WebElement pass = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput2']"));
		pass.sendKeys(s1);
	    
	}
	@Then("User should click on the login button.")
	public void user_should_click_on_the_login_button() {
		WebElement but = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		but.click();
	}
	@Then("User should land on the brand listing page.")
	public void user_should_land_on_the_brand_listing_page() {
		
		String title = driver.getTitle();
		System.out.println(title);
	    
	}
	@When("Enter the Ivalid user name {string}.")
	public void enter_the_ivalid_user_name(String s2) {
		WebElement username = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput1']"));
		username.sendKeys(s2);
	    
	}
	@When("Enter the Ivalid password {string}.")
	public void enter_the_ivalid_password(String s3) {
		WebElement pass = driver.findElement(By.xpath("//input[@id ='exampleFormControlInput2']"));
		pass.sendKeys(s3);
	    
	}
	@Then("User should see the error message.")
	public void user_should_see_the_error_message() {
		String tit = driver.getTitle();
		System.out.println(tit);
	    
	}
	@Given("User should click on the brands.")
	public void user_should_click_on_the_brands() {
	//	WebDriverWait w = new WebDriverWait(driver, 10);
	   WebElement bf = driver.findElement(By.xpath("//h4[text() ='Briyani Factory']"));
	   bf.click();
	}
	@Given("User will be on the menu listing page.")
	public void user_will_be_on_the_menu_listing_page() {
	   String ii = driver.getTitle();
	   System.out.println(ii);
	}
	@When("User should select the food using the add button.")
	public void user_should_select_the_food_using_the_add_button() {
	    WebElement bri = driver.findElement(By.xpath("(//button[text() ='add'])[1]"));
	    bri.click();
	}
	@When("User should select the size.")
	public void user_should_select_the_size() {
	    WebElement in = driver.findElement(By.xpath("(//span[@class ='checkmark'])[2]"));
	    in.click();
	}
	@When("user should enter the special instruction.")
	public void user_should_enter_the_special_instruction() {
	   WebElement spl = driver.findElement(By.xpath("//input[@name ='specialInstrucion']"));
	   spl.sendKeys("extra chees");
	}
	@When("user should increase the quantity.")
	public void user_should_increase_the_quantity() {
//	   WebElement qty = driver.findElement(By.xpath("//span[text() ='+']"));
//	   qty.click();
	}
	@When("User should click on add to cart button.")
	public void user_should_click_on_add_to_cart_button() {
	   WebElement drii = driver.findElement(By.xpath("//button[text() ='ADD TO CART - $']"));
	   drii.click();
	}
	@When("User should click on the place order button.")
	public void user_should_click_on_the_place_order_button() {
	    WebElement pl = driver.findElement(By.xpath("//button[text() ='Place Order'] "));
	    pl.click();
	}
	@Then("User should navigate to the chechout page.")
	public void user_should_navigate_to_the_chechout_page() {
	   String yy = driver.getTitle();
	   System.out.println(yy);
	}
	@Given("User should be on the checkout page.")
	public void user_should_be_on_the_checkout_page() {
	    System.out.println(driver.getTitle());
	}
	@When("User should click on the continueshopping button.")
	public void user_should_click_on_the_continueshopping_button() {
	   WebElement cs = driver.findElement(By.xpath("//button[text() ='Continue Shopping']"));
	   cs.click();
	}
	@When("User should land to the brand menu listing page.")
	public void user_should_land_to_the_brand_menu_listing_page() {
	    System.out.println(driver.getTitle());
	}
	@When("User should search the food item, {string}.")
	public void user_should_search_the_food_item(String sr) {
	   WebElement serch = driver.findElement(By.xpath("//input[@name ='searchText']"));
	   serch.sendKeys(sr);
	}
	@When("Add freshmilk to the cart.")
	public void add_freshmilk_to_the_cart() {
	    WebElement fm = driver.findElement(By.xpath("//p[text() ='Fresh Milk']"));
	    fm.click();
	    WebElement adde = driver.findElement(By.xpath("(//button[text() ='add'])[1]"));
	    adde.click();
	}
	@When("Click place order button.")
	public void click_place_order_button() {
	   WebElement po = driver.findElement(By.xpath("(//button[text() ='Place Order'])[1]"));
	   po.click();
	}
	@Then("User should navigate to the checkout page.")
	public void user_should_navigate_to_the_checkout_page() {
	   System.out.println(driver.getTitle());
	}
	@When("User should click on the pickup button.")
	public void user_should_click_on_the_pickup_button() {
	   WebElement pick = driver.findElement(By.xpath("(//a[text() ='Pick-up'])[1]"));
	   pick.click();
	}
	@When("User should the name.")
	public void user_should_the_name() {
	   WebElement yourname = driver.findElement(By.xpath("(//input[@placeholder ='Your name'])[1]"));
	   yourname.sendKeys("Swetha M");
	}
	@When("User should enter the email.")
	public void user_should_enter_the_email() {
	   WebElement emai = driver.findElement(By.xpath("(//input[@placeholder ='Email'])[1]"));
	   emai.sendKeys("mswetha@skoruz.com");
	   
	}
	@When("User enter the mobile num.")
	public void user_enter_the_mobile_num() {
	   WebElement mobnum = driver.findElement(By.xpath("(//input[@placeholder ='Mobile No'])[1]"));
	   mobnum.sendKeys("8888888888");
	}
	@When("User should click on the make payment.")
	public void user_should_click_on_the_make_payment() {
	   WebElement makepay = driver.findElement(By.xpath("(//button[text()='Make Payment '])"));
	   makepay.click();
	}
	@Then("Order palced message has been displayed.")
	public void order_palced_message_has_been_displayed() {
	   String it = driver.getTitle();
	   System.out.println(it);
	}






}
