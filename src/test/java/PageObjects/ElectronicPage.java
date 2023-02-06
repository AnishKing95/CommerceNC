package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicPage {
		
@FindBy(xpath="(//a[text()='Electronics '])[1]")
private WebElement electronics;

@FindBy(xpath="//a[text()=' Cell phones ']")
private WebElement cellphone;

@FindBy(id="products-orderby")
private WebElement sortby;

public WebElement getElectronics() {
	return electronics;
}

public void setElectronics(WebElement electronics) {
	this.electronics = electronics;
}

public WebElement getCellphone() {
	return cellphone;
}

public void setCellphone(WebElement cellphone) {
	this.cellphone = cellphone;
}

public WebElement getSortby() {
	return sortby;
}

public void setSortby(WebElement sortby) {
	this.sortby = sortby;
}


}
