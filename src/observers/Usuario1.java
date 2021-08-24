package observers;

/**
 * 
 * @author Dione
 *
 */
public class Usuario1 implements Notificador {

	public void receberNotificacao() {

		System.out.println("Usu�rio1 => Notifica��o ativada.");
	}

	@Override
	public void atualizar(boolean status) {

		if (status) {
			receberNotificacao();

		} else {

			System.out.println("Notifica��o desativada.");
		}
	}
}
