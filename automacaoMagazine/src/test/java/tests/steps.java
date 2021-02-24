package tests;

import Elementos.elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class steps {
	Metodos metodos = new Metodos();
	elementos elementos = new elementos();

	@Given("que eu esteja na loja Magazine Luiza")
	public void que_eu_esteja_na_loja_magazine_luiza() {
		metodos.abrirBrowser("https://www.magazineluiza.com.br");
		metodos.esperaImplicita();
		metodos.click(elementos.getCookies());

	}

	@When("pesquisar produto")
	public void pesquisar_produto() throws InterruptedException {

		metodos.escrever("notbook", elementos.getCampoPesquisar());
		metodos.click(elementos.getClick());
		metodos.click(elementos.getClickProduto());
		metodos.esperaImplicita();
		metodos.click(elementos.getClickSacola());
		metodos.click(elementos.getClickContinuar());

	}

	@Then("adiciono no carrinho")
	public void adiciono_no_carrinho() {

		metodos.fecharNavegador();

	}

}
