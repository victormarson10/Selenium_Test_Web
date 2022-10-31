package br.mg.vhugo.pages;

import org.openqa.selenium.By;

import br.mg.vhugo.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[.='Conta adicionada com sucesso!']"));
	}

}
