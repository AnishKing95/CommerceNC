package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage {
	
	
	
	@FindBy(xpath="(//a[text()='Apparel '])[1]")
	private WebElement apparel;
	
	@FindBy(xpath="//a[contains(text(),'Nike Floral Roshe Customized Running Shoes')]")
	private WebElement shoesSelected;
	
	
	@FindBy(xpath="//a[contains(text(),' Shoes ')]")
	private WebElement shoes;
	
	public WebElement getShoesSelected() {
		return shoesSelected;
	}


	public void setShoesSelected(WebElement shoesSelected) {
		this.shoesSelected = shoesSelected;
	}


	@FindBy(xpath="//select[@id='product_attribute_6']")
	private WebElement sizeDropDown;


	public WebElement getApparel() {
		return apparel;
	}


	public void setApparel(WebElement apparel) {
		this.apparel = apparel;
	}


	public WebElement getSizeDropDown() {
		return sizeDropDown;
	}


	public void setSizeDropDown(WebElement sizeDropDown) {
		this.sizeDropDown = sizeDropDown;
	}


	public WebElement getShoes() {
		return shoes;
	}


	public void setShoes(WebElement shoes) {
		this.shoes = shoes;
	}



	
	
	
	
	

}
