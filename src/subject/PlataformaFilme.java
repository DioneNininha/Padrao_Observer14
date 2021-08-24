package subject;

public class PlataformaFilme extends GerencNotificacoes {

	private boolean status = false;

	/**
	 * 
	 * @return
	 */
	public boolean getStatus() {

		return this.status;
	}

	public void setStatus(boolean newStatus) {

		if (newStatus != status) {

			this.status = newStatus;
			avisarUsuarios(newStatus);
		}
	}
}
