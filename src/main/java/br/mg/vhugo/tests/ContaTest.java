package br.mg.vhugo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.pages.ContasPage;
import br.mg.vhugo.pages.MenuPage;

public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("Conta do Teste123");
		contasPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
}
