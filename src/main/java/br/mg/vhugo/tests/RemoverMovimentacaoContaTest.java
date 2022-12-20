package br.mg.vhugo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.pages.ContasPage;
import br.mg.vhugo.pages.MenuPage;


public class RemoverMovimentacaoContaTest extends BaseTest{

	@Test
	public void testExcluirContaComMovimentacao() {
		MenuPage menuPage = new MenuPage();
		ContasPage contasPage = new ContasPage();
		
		menuPage.acessarTelaListarConta();
		
//		contasPage.clicarExcluirConta("conta teste alterada321");
		contasPage.clicarExcluirConta("Conta com movimentacao");
		
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}
