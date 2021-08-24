package subject;

import java.util.ArrayList;
import java.util.List;
import observers.Notificador;

/**
 * 
 * @author Dione
 *
 */
public abstract class GerencNotificacoes {

	private List<Notificador> usuarios= new ArrayList<Notificador>();

	public void add(Notificador notificador) {

		usuarios.add(notificador);
	}

	public void avisarUsuarios(boolean status) {

		for (Notificador o : usuarios) {
			o.atualizar(status);
		}
	}
}
