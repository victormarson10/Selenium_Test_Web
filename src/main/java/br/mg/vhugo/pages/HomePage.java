package br.mg.vhugo.pages;

import br.mg.vhugo.core.BasePage;

public class HomePage extends BasePage{
	
	public String obterSaldoConta(String nome) {
		
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
			 
	}
}
