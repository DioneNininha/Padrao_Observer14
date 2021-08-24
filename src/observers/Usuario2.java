package observers;

/**
 * 
 * @author Dione
 *
 */
public class Usuario2 implements Notificador {

	public void sendRecusarNotificacao() {

		System.out.println("Usu�rio2 => Notifica��o desativada.");
	}

	@Override
	public void atualizar(boolean status) {

		if (status) {
			sendRecusarNotificacao();

		} else {
			System.out.println("Notifica��o ativada.");
		}
	}
}
