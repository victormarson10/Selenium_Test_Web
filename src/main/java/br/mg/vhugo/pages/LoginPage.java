package br.mg.vhugo.pages;

import org.openqa.selenium.By;

import br.mg.vhugo.core.BasePage;
import br.mg.vhugo.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/logout");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("//button[@Class='btn btn-primary']"));
	}
	
//	public void logar(String email, String senha) { -> Método alternativo para logar
//		setEmail(email);
//		setSenha(senha);
//		entrar();
//	}

}
