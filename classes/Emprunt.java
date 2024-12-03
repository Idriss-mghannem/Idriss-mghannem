package library_management_system;
import java.time.LocalDate;

public class Emprunt {
	LocalDate date_emprunt,date_retour;
	int period,num_ins1; 
	String titre;
	public Emprunt(LocalDate date_emprunt, int period, int num_ins, String titre) {
		super();
		this.date_emprunt = date_emprunt;
		this.date_retour = date_de_retour(date_emprunt,period);
		this.period =period; 
		this.num_ins1 = num_ins;
		this.titre = titre;
	}
	public LocalDate getDate_emprunt() {
		return date_emprunt;
	}
	public void setDate_emprunt(LocalDate date_emprunt) {
		this.date_emprunt = date_emprunt;
	}
	public LocalDate getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(LocalDate date_retour) {
		this.date_retour = date_retour;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getNum_ins() {
		return num_ins1;
	}
	public void setNum_ins(int num_ins) {
		this.num_ins1 = num_ins;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	} 
	public boolean titre_non_vide(String titre)
	{
		if(titre.length()>0){
			return true;
		}
		else {return false;}
	}
	
	public boolean validation_numins_et_periode(int x) {
		if(x>0) {return true;}
		else {return false;}
			
	}
	public <Localdate> LocalDate date_de_retour(LocalDate l,int x) {
		LocalDate date_retour=l.plusDays(x);
		return date_retour;
		
	}
	
	

}
