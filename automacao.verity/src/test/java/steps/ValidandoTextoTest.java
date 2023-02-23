package steps;

import elementos.ElementosWeb;
import io.cucumber.java.en.Then;
import pages.Metodos;

public class ValidandoTextoTest {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Then("então valido o texto")
	public void entãoValidoOTexto() {
		metodos.validarTexto("Nossas soluções_", el.nSolucoes);
		metodos.validarTexto("Nossos clientes", el.nCLientes);
		metodos.pause(2000);
		metodos.evidencias("Validando texto");
		metodos.fecharNavegador();
	}
}
