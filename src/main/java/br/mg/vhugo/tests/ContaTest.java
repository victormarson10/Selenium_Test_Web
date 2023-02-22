package br.mg.vhugo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.pages.ContasPage;
import br.mg.vhugo.pages.MenuPage;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void test1_InserirConta() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("Conta do Teste21");
//		contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	/*@Test
	public void test2_AlterarConta() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarAlterarConta("Conta para alterar");
//		contasPage.setNome("conta teste alterada321");
		contasPage.setNome("Conta alterada");
		contasPage.salvar();
		
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
		
	}*/
	
	@Test
	public void test3_InserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		
//		contasPage.setNome("conta teste alterada321");
		contasPage.setNome("Conta mesmo nome");
		contasPage.salvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}
	
}
