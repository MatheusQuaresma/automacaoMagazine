package Elementos;

import org.openqa.selenium.By;

public class elementos {
	
	private By campoPesquisar = By.id("inpHeaderSearch");
	private By click = By.id("btnHeaderSearch");
	private By clickProduto = By.cssSelector("#product_2254442 > a.product-li > div");
	private By clickSacola = By.cssSelector("body > div.wrapper__main > div.wrapper__content.js-wrapper-content > div.wrapper__control > div.wrapper-product__content.wrapper-product__box-prime > div.wrapper-product__informations.js-block-product > button.button__buy.button__buy-product-detail.js-add-cart-button.js-main-add-cart-button.js-add-box-prime");
    private By clickContinuar = By.cssSelector("body > div.sticky-footer-wrapper > div > div > div.warranty-container > div.warranty-wrapper > div.price-warranty > a");
	private By cookies = By.cssSelector("body > div.container-banner-cookie > div.container-button-banner > p");
	
	
	public By getCampoPesquisar() {
		return campoPesquisar;
		
	

	}

	public By getClick() {
		return click;
	}

	public By getClickProduto() {
		return clickProduto;
	}

	public By getClickSacola() {
		return clickSacola;
	}

	public By getClickContinuar() {
		return clickContinuar;
	}

	public By getCookies() {
		return cookies;
	}
	

}
