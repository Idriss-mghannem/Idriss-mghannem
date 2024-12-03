package library_management_system;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement; 
import java.time.LocalDate;
import java.util.Scanner;


public class BIB {
	
	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		
		sql_req r=new sql_req();
		r.ajout_emprutn(now, now,"empr",2, 5);
		
		/*r.ajout_emprutn(now, now,"book",1521,5);
		/*r.ajout_livre("mathematique","prof",150);
		r.ajout_adhérent(8500,1525,"per","idriss");*/
		
		
		
		
		Connection connection=null;
		Statement statement; 
		ResultSet res;
		Adherent a=new Adherent(8, 12542, null, null); 
		
		System.out.println(".---------------------------Welcom--------------------.");
		System.out.println("|   options :                                         |");
		System.out.println("| pour ajouter un livre : ADL                         |");
		System.out.println("| pour supprimerer un livre :SPL                      |");
		System.out.println("| pour supprimerer un Adherent:SPA                     |");
		System.out.println("| pour ajouter un Adjrent : ADA                       |");
		System.out.println("| pour emprunter un livre : EML                       |");
		System.out.println("| pour rendre  un livre : RL                          |");
		System.out.println("'-----------------------------------------------------'");
		Scanner scan=new Scanner(System.in); 
		System.out.println(" option : "); 
		String op=scan.nextLine();
		
		//our ajouter livre 
		if (op.equals("ADL")) {
			Scanner scan_titre=new Scanner(System.in); 
			System.out.println(" titre : "); 
			String titre=scan_titre.nextLine();
			
			
			Scanner scan_auteur=new Scanner(System.in); 
			System.out.println(" auteur: "); 
			String auteur=scan_titre.nextLine();
			
			Scanner scan_npages=new Scanner(System.in); 
			System.out.println("n_pages : "); 
			int n_pages=scan_titre.nextInt();
			
			Book b=new Book(n_pages,titre,auteur);
			if (b.n_pages_valide(b.getN_page())) {
			r.ajout_livre(b.getTitre(),b.getAuteur(),b.getN_page());}
			else {System.out.println("n_pages doit > 0 ");}}
		// supprimer livre
		if (op.equals("SPL")) {
			Scanner scan_titre=new Scanner(System.in); 
			System.out.println(" titre : "); 
			String titre=scan_titre.nextLine();
			r.supp_livre(titre);}
		//ajouter adhérent 
		if (op.equals("ADA")) {
			Scanner scan_nom=new Scanner(System.in); 
			System.out.println("nom : "); 
			String nom=scan_nom.nextLine();
			
			
			Scanner scan_prenom=new Scanner(System.in); 
			System.out.println(" prenom: "); 
			String prenom=scan_prenom.nextLine();
			
			Scanner scan_num_ins=new Scanner(System.in); 
			System.out.println("n_inscri : "); 
			int num_isncri=scan_num_ins.nextInt();
			Scanner scan_cin=new Scanner(System.in); 
			System.out.println("cin : "); 
			int cin=scan_cin.nextInt();
			Adherent a1=new Adherent(cin,num_isncri,nom,prenom); 
			if ((a1.Cin_validation(a1.getCin()))&&(a1.isOnlyLetters(a1.getNom()))&&(a1.isOnlyLetters(a1.getPrenom()))&&(a1.num_inscri_valide(a1.getN_isnc()))) {
				r.ajout_adhérent(cin, num_isncri, nom, prenom);
			
			}}
			//pour supprimer un adhérent 
			if (op.equals("SPA")) {
				Scanner scan_num_isncri=new Scanner(System.in); 
				System.out.println(" num_inscri de l'adhérent : "); 
				int num_inscri=scan_num_isncri.nextInt();
				r.supp_adhérent(num_inscri);}
			if (op.equals("EML")) {
				Scanner scan_num_isncri=new Scanner(System.in); 
				System.out.println(" num_inscri de l'adhérent : "); 
				int num_inscri=scan_num_isncri.nextInt();
				Scanner scan_titre=new Scanner(System.in); 
				System.out.println(" titre : "); 
				String titre=scan_titre.nextLine();
				Scanner scan_period=new Scanner(System.in); 
				System.out.println(" periode : "); 
				int period=scan_period.nextInt();
				Emprunt e=new Emprunt(now,period,num_inscri,titre);
				if((e.validation_numins_et_periode(period))&&(e.validation_numins_et_periode(num_inscri))){
					r.ajout_emprutn(now,e.date_de_retour(now, period), titre, num_inscri, period);
				}
			}
			if (op.equals("RL")) {
		
			Scanner scan_num_isncri=new Scanner(System.in); 
			System.out.println(" num_inscri de l'adhérent : "); 
			int num_inscri=scan_num_isncri.nextInt();
			Scanner scan_titre=new Scanner(System.in); 
			System.out.println(" titre : "); 
			String titre=scan_titre.nextLine();
			if (a.num_inscri_valide(num_inscri)) {
				r.ajout_retour(now, titre, num_inscri);
			}
			
			}
			
			
		} 
			
			
			
		
		
		
		
		
		 
		
	}
	

	

