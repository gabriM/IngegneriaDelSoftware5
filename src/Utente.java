import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import MyLib.Utility;

/**
 * Classe che definisce un <i>Utente</i>.
 *
 * Un utente ha le seguenti caratteristiche:
 * nome;
 * elenco eventi dell'utente
 * elenco messaggi dell'utente;
 *
 * @author Matteo Gusmini
 *
 * @version 4.0 1 Febbraio 2019
 *
 */
public class Utente implements Serializable{

	/*Costanti*/
	final String NOME="Nome categoria: ";
	final String DESCRIZIONE="Descrizione: ";
	final String SCELTACATEGORIA="Quale categoria vuoi aggiungere ai preferiti?";
	
	/*Attributi*/
	private String nomeUtente;
	private ArrayList<Integer> fasciaEta;
	private ArrayList<Categoria> categorieInteresse= new ArrayList<>();
	private ArrayList<Evento> eventiUtente = new ArrayList<>();
	private ArrayList<Messaggio> messaggiUtente = new ArrayList<>();
	private ArrayList <Utente> Utentiamici = new ArrayList<>();

	/*Costruttori*/
	/**
	 * Un utente e' costituito da nome, elenco eventi e elenco messaggi:
	 *
	 * @param _nomeUtente il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public Utente(String _nomeUtente)
	{
		nomeUtente=_nomeUtente;
	}

	/*Getters*/
	/**
	 * Ritorna il nome dell'utente
	 * @return il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public String getNomeUtente() {
		return nomeUtente;
	}
	/**
	 * Ritorna un ArrayList degli eventi correlati all'utente
	 * @return ArrayList degli eventi correlati all'utente
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Evento> getEventiUtente() {
		return eventiUtente;
	}
	/**
	 * Ritorna un ArrayList dei messaggi correlati all'utente
	 * @return ArrayList dei messaggi correlati all'utente
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Messaggio> getMessaggiUtente() {
		return messaggiUtente;
	}
	/**
	 * Ritorna un ArrayList delle categorie d'interesse
	 * @return ArrayList delle categorie d'interesse
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Categoria> getCategorieInteresse() {
		return categorieInteresse;
	}
	/**
	 * Ritorna un ArrayList degli utenti "Amici"
	 * @return ArrayList degli utenti "Amici"
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Utente> getUtentiamici() {
		return Utentiamici;
	}
	/**
	 * Ritorna un ArrayList delle fascie d'et�
	 * @return ArrayList delle fascie d'et�
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Integer> getFasciaEta() {
		return fasciaEta;
	}
	
	/*Setters*/
	
	/**
	 * Metodo che imposta il nome dell'utente
	 * @param nomeUtente il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	/**
	 * Permette di cambiare l'elenco degli eventi associati all'utente
	 * @param eventiUtente il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setEventiUtente(ArrayList<Evento> eventiUtente) {
		this.eventiUtente = eventiUtente;
	}
	/**
	 * Permette di cambiare l'elenco dei messaggi associati all'utente
	 * @param messaggiUtente il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setMessaggiUtente(ArrayList<Messaggio> messaggiUtente) {
		this.messaggiUtente = messaggiUtente;
	}
	/**
	 * Permette di cambiare l'elenco delle categorie di interesse
	 * @param categorieInteresse il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setCategorieInteresse(ArrayList<Categoria> categorieInteresse) {
		this.categorieInteresse = categorieInteresse;
	}
	/**
	 * Permette di cambiare l'elenco degli utenti "Amici"
	 * @param utentiamici il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setUtentiamici(ArrayList<Utente> utentiamici) {
		Utentiamici = utentiamici;
	}
	
	/**
	 * Permette di cambiare l'arraylist della fascia d'eta
	 * @param fasciaEta il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setFasciaEta(ArrayList<Integer> fasciaEta) {
		this.fasciaEta = fasciaEta;
	}

	/*Metodi*/
	/**
	 * Metodo che, dato il nome di un utente, permette di sapere se � lo stesso con cui si fa il confronto
	 *
	 * @param uConfronto il nome dell'utente
	 * @return true se l'utente � lo stesso, false altrimenti
	 *
	 * @author Matteo Gusmini
	 */
	public Boolean confrontaUtente(Utente uConfronto){
		Boolean uguale;
		if(nomeUtente.equalsIgnoreCase(uConfronto.getNomeUtente()))
			uguale=true;
		else
			uguale=false;
		return uguale;
	}
	/**
	 * Metodo che permette di definire i dati personali di un utente
	 *
	 * @param elencoCategorie l'elenco delle categorie
	 *
	 * @author Matteo Gusmini
	 */
	public void inserisciDatiPersonali(ArrayList<Categoria> elencoCategorie){
		int inserimento= Utility.leggiIntero(0,1, "Vuoi modificare l'elenco delle tue categorie preferite? Digita 1 per SI e 0 pre NO");

		if(inserimento==0){

		}
		else{
			ArrayList<Categoria> nuoveCategorie= new ArrayList<>();
			ArrayList<Categoria> sceltaCategorie= new ArrayList<>();
			sceltaCategorie=elencoCategorie;
			int numCat=0;
			do{
				System.out.println("0) Esci");
				for (int i=0; i<sceltaCategorie.size();i++){
					System.out.println(i+1+")");
					System.out.println(NOME + sceltaCategorie.get(i).getNome());
					System.out.println(DESCRIZIONE + sceltaCategorie.get(i).getDescrizione()+"\n");
				}

				numCat=Utility.leggiIntero(0, sceltaCategorie.size()+1, SCELTACATEGORIA);
				if(numCat!=0){
					nuoveCategorie.add(sceltaCategorie.get(numCat-1));
					sceltaCategorie.remove(numCat-1);
				}
					
			}while(sceltaCategorie.size()>0 && numCat!=0);
			categorieInteresse=nuoveCategorie;
		}
			
		int inserimento2= Utility.leggiIntero(0,1, "Vuoi inserire la tua fascia di et�? Digita 1 per SI e 0 pre NO");
		if(inserimento2==0){


		}
		else{
			fasciaEta= Utility.leggiFasciaEta("Seleziona la tua fascia d'eta");
		}
			
			
	}



}
