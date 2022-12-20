package br.mg.vhugo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.pages.HomePage;
import br.mg.vhugo.pages.MenuPage;


public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();
//	BasePage page = new BasePage();

	@Test
	public void testSaldoConta() {
		menu.acessarTelaPrincipal();
//		Assert.assertEquals("555.00", page.obterSaldoConta("conta teste alterada321"));
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
//		Assert.assertEquals("555.00", page.obterTexto(By.xpath("//*[@id=\"tabelaSaldo\"]/tbody/tr/td[2]")));
	}
}


