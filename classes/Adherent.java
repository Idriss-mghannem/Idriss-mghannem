package library_management_system;

public class Adherent {
	private int cin,n_isnc; 
	private String nom,prenom;

	public Adherent(int cin, int n_isnc, String nom, String prenom) {
		
		this.cin=cin; 
		
		this.n_isnc = n_isnc;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public int getN_isnc() {
		return n_isnc;
	}
	public void setN_isnc(int n_isnc) {
		this.n_isnc = n_isnc;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	} 
public boolean Cin_validation(int c)
		{
		if(String.valueOf(c).length()==8) {return true;}
		else {return false;}
		}
public Boolean num_inscri_valide(int x) {
	if(x>0){return true;}
	else {return false;}
}
public boolean isOnlyLetters(String name) {
    // Permet les lettres et les espaces
    return name.matches("[a-zA-Z ]+");
}
	}
