package cliente;

import observers.Usuario2;
import observers.Usuario1;
import subject.PlataformaFilme;

/**
 * 
 * @author Dione
 *
 */
public class Cliente {

	public static void main(String[] args) {

		PlataformaFilme plataformaFilme = new PlataformaFilme();

		plataformaFilme.add(new Usuario1());
		plataformaFilme.add(new Usuario2());

		System.out.println("Novo Filme: Como Estrelas na Terra.");

		plataformaFilme.setStatus(true);
	}
}
