package observers;

/**
 * 
 * @author Dione
 *
 */
public class Usuario2 implements Notificador {

	public void sendRecusarNotificacao() {

		System.out.println("Usuário2 => Notificação desativada.");
	}

	@Override
	public void atualizar(boolean status) {

		if (status) {
			sendRecusarNotificacao();

		} else {
			System.out.println("Notificação ativada.");
		}
	}
}
