package br.mg.vhugo.tests;

import org.junit.Test;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.pages.MenuPage;

public class MovimentacaoTest extends BaseTest{
	private MenuPage menuPage = new MenuPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		
		
	}

}
