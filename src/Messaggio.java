import java.io.Serializable;

/**
 * Classe che definisce un <i>Messaggio</i>.
 *
 * Un messaggio contiene le seguenti caratteristiche:
 * destinatario;
 * testo del messaggio;
 *
 * @author Gabriele Manenti
 *
 * @version 4.0 1 Febbraio 2019
 *
 */
public class Messaggio implements Serializable{

	/*Attributi*/
	private Utente destinatario;
	private String testo;
		
	/*Costruttori*/
	/**
	 * Un messaggio e' costituito da destinatario e testo:
	 *
	 * @param _destinatario il destinatoario del messaggio
	 * @param _testo il testo del messaggio
	 *
	 * @author Gabriele Manenti
	 */
	public Messaggio(Utente _destinatario, String _testo){
		destinatario =_destinatario;
		testo= _testo;
			
	}

	/*Getters*/
	/**
	 * Ritorna il destrinatario del messaggio
	 * @return destrinatario del messaggio
	 *
	 * @author Gabriele Manenti
	 */
	public Utente getDestinatario() {
		return destinatario;
	}
	/**
	 * Ritorna il testo del messaggio
	 * @return il testo del messaggio
	 *
	 * @author Gabriele Manenti
	 */
	public String getTesto() {
		return testo;
	}

	/*Setters*/
	/**
	 * Metodo che imposta il destrinatario del messaggio
	 *
	 * @param destinatario il destrinatario del messaggio
	 *
	 * @author Gabriele Manenti
	 */
	public void setDestinatario(Utente destinatario) {
		this.destinatario = destinatario;
	}
	/**
	 * Metodo che imposta il testo del messaggio
	 *
	 * @param testo il testo del messaggio
	 *
	 * @author Gabriele Manenti
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

}
