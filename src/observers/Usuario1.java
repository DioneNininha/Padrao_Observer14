package observers;

/**
 * 
 * @author Dione
 *
 */
public class Usuario1 implements Notificador {

	public void receberNotificacao() {

		System.out.println("Usuário1 => Notificação ativada.");
	}

	@Override
	public void atualizar(boolean status) {

		if (status) {
			receberNotificacao();

		} else {

			System.out.println("Notificação desativada.");
		}
	}
}
