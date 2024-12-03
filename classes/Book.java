package library_management_system;

public class Book {
	private int  n_page; 
	private String titre,auteur;
	public Book(int n_page, String titre, String auteur) {
		
		this.n_page = n_page;
		this.titre = titre;
		this.auteur = auteur;
	}
	public int getN_page() {
		return n_page;
	}
	public void setN_page(int n_page) {
		this.n_page = n_page;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Boolean n_pages_valide(int x) {
		if(x>0){return true;}
		else {return false;}
	
		
	}

}
