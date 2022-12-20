package br.mg.vhugo.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.mg.vhugo.core.BaseTest;
import br.mg.vhugo.core.DriverFactory;
import br.mg.vhugo.pages.MenuPage;
import br.mg.vhugo.pages.ResumoPage;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	
	@Test
	public void test1_ExcluirMovimentacao() {
		
		menuPage.acessarTelaResumo();
		
//		menuPage.clicarBotao("mes");
		
		
//				menuPage.clicarBotao(By.xpath("//*[@id=\"mes\"]/option[10]"));
				
//				menuPage.clicarBotao(By.xpath("//input[@class='btn btn-primary' and @type='submit']"));
				
				resumoPage.excluirMovimentacao();
		
		
		
		Assert.assertEquals("Movimentação removida com sucesso!", 
							resumoPage.obterMensagemSucesso());
	}
	
	//Poderia utilizar @Test(expected=NoSuchElementException.class) para passar o testo porém iria gerar um 
	//"Falso positivo"
	@Test
	public void test2_ResumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());
		
//		try {	
//			DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr"));
//			Assert.fail(); //lançado para ter um asser quando falhar
//		} catch (NoSuchElementException e) {
//			
//		}  -> Poderia ser feito assim que iria passar
		
		resumoPage.selecionarAno("2022");
		resumoPage.buscar();
		
		List<WebElement> elementosEncontrados = 
				DriverFactory.getDriver().findElements(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr"));
		
		Assert.assertEquals(0, elementosEncontrados.size());
	}
	
}
