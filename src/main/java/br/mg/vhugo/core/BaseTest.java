package br.mg.vhugo.core;

import static br.mg.vhugo.core.DriverFactory.getDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.mg.vhugo.pages.LoginPage;

public class BaseTest {
	
	public /*static por não ser Before não precisa de variáveis estatic*/Properties getProp() throws IOException {
			Properties props = new Properties();
			FileInputStream file = new FileInputStream(
				"dados.properties");
			props.load(file);
			return props;
	}
	
	private LoginPage page = new LoginPage();
	
	@Rule
	public TestName testName = new TestName();
//	Rotinas de abertura do sistema migradas para o teste em suite/ Voltou o comportamento para funcionar com Threads(SureFire)
	@Before
	public void inicializa() throws IOException {
		Properties prop = getProp();
//		String email;
//		String senha;
		
		String email = prop.getProperty("EMAIL");
		String senha = prop.getProperty("SENHA");
		
		page.acessarTelaInicial();
		
		page.setEmail(email);
		page.setSenha(senha);
		page.entrar();
	}
	
	@After
	public void finaliza() throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
		DriverFactory.killDriver();
		}
	}

}
