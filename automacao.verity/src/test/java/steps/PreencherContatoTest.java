package steps;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;
import runner.Executa;
import utils.DicionarioDeMensagens;
import utils.MassaDeDados;

public class PreencherContatoTest {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	MassaDeDados massa = new MassaDeDados();
	DicionarioDeMensagens msg = new DicionarioDeMensagens();

	@Given("eu acessar o site")
	public void euAcessarOSite() {
		Executa.abrirNavegador();
	}

	@Given("clicar em contato")
	public void clicarEmContato() {
		metodos.clicar(el.contato);
	}

	@When("preencho os dados")
	public void preenchoOsDados() {
		metodos.escrever(el.nome, massa.nome );
		metodos.escrever(el.email, massa.email);
		metodos.escrever(el.celular, massa.celular);
		metodos.escrever(el.desafio, massa.desafio);
	}

	@When("clicar no checkbox")
	public void clicarNoCheckbox() {
		metodos.clicar(el.checkbox);
	}

	@Then("envio o fomulario")
	public void envioOFomulario() {
		metodos.clicar(el.enviar);
		metodos.pause(2000);
		metodos.evidencias("Formulario enviado");
		metodos.validarTexto(msg.mensagemRobo, el.robo);
		metodos.fecharNavegador();
	}

}
