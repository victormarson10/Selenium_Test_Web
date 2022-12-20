package br.mg.vhugo.suit;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.mg.vhugo.core.DriverFactory;
import br.mg.vhugo.pages.LoginPage;
import br.mg.vhugo.tests.ContaTest;
import br.mg.vhugo.tests.MovimentacaoTest;
import br.mg.vhugo.tests.RemoverMovimentacaoContaTest;
import br.mg.vhugo.tests.ResumoTest;
import br.mg.vhugo.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
//	private static LoginPage page = new LoginPage();
//	
//	@BeforeClass
//	public static void  inicializa() /*throws IOException*/ {
//		
//		
////		Properties prop = getProp();
////		String email;
////		String senha;
////		
////		email = prop.getProperty("EMAIL");
////		senha = prop.getProperty("SENHA");
//		
//		page.acessarTelaInicial();
//		
//		page.setEmail("victor123456@email");
//		page.setSenha("123456");
//		page.entrar();
//	}
//	
//	@AfterClass
//	public static void finaliza() {
//		DriverFactory.killDriver();
//	} -> todo o bloco de código foi retirado uma vez que não será mais necessário pois todos os testes vão ter abertura 
//	e fechamento próprio de tela para funcionar com mvn test ou seja o comportamento voltou ao estado inicial
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void reset() throws IOException{
		page.acessarTelaInicial();
		
		
		page.setEmail("");
		page.setSenha("");
		page.entrar();
		
		page.resetar();
		
		DriverFactory.killDriver();
		
	}
}
