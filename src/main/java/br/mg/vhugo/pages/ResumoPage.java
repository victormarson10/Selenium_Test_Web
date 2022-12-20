package br.mg.vhugo.pages;

import org.openqa.selenium.By;

import br.mg.vhugo.core.BasePage;

public class ResumoPage extends BasePage {
	//*[@id="tabelaExtrato"]/tbody/tr[1]/td[6]/a/span	
	
	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class=\"glyphicon glyphicon-remove-circle\"]"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public void selecionarAno(String ano) {
		selecionarCombo("ano", "2021");
	}
	
	public  void buscar() {
		clicarBotao(By.xpath("//input[@value='Buscar']"));
	}
}
