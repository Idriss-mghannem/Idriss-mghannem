package library_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class sql_req {
	Connection connection=null;
	
	Statement statement; 
	ResultSet res; 
	//ajout d'emprunt sur mysql server 
	public void ajout_emprutn(LocalDate date_emprunt,LocalDate retour,String titre,int num_ins,int period) {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	       
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String insert="INSERT INTO  empruntt values('"+titre+"','"+num_ins+"','"+date_emprunt+"','"+retour+"','"+period+"')";
	        statement.execute(insert);
	        } 
	        catch(Exception e) {System.out.println("fail to insert emprunt ");}
	        
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	       
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String delete="Delete from retour where titre='"+titre+"' and num_inscription='"+num_ins+"'";
	        
	        
	        statement.execute(delete);
	        } 
	        catch(Exception e) {System.out.println("fail to delete ou le book n'existe pas  ");}
	        }
	
	//pour ajouter retour 
	public void ajout_retour(LocalDate date_emprunt,String titre,int num_ins) {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	       
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String insert="INSERT INTO  retour values('"+titre+"','"+date_emprunt+"','"+num_ins+"')";
	        
	        statement.execute(insert);
	        
	        } 
	        catch(Exception e) {System.out.println("fail to insert retour ");}
		
	        
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	       
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String delete="Delete from empruntt where titre='"+titre+"' and num_inscription='"+num_ins+"'";
	        
	        
	        statement.execute(delete);
	        } 
	        catch(Exception e) {System.out.println("fail to insert retour ");}
	        }
	 
	
	
		
		


	public void ajout_livre(String titre,String auteur,int n_pages) {
	try {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        
       
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
        statement=connection.createStatement();
        String insert="INSERT INTO  books(titre,auteur,n_pages) values('"+titre+"','"+auteur+"','"+n_pages+"')";
        statement.execute(insert);
        System.out.println("Succès : le livre |titre : "+titre+"|auteur : "+auteur+"| n_pages : "+n_pages+"Les données ont été insérées dans la table 'emprunt'.");
        
        } 
        catch(Exception e) {System.out.println("fail to insert livre");}
	}
	public void ajout_adhérent(int cin, int n_isnc, String nom, String prenom) {
		try {
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	       
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String insert="INSERT INTO  adhérent(cin,num_inscription,nom,prenom) values('"+cin+"','"+n_isnc+"','"+nom+"','"+prenom+"')";
	        statement.execute(insert);
	        System.out.println("l'adhérent est ajouté"); 
	        
	        } 
	        catch(Exception e) {System.out.println("fail to insert adhérent");}
		}
	
	public void supp_livre(String titre) {
		try {
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
	        statement=connection.createStatement();
	        String delete="DELETE from books where titre='"+titre+"'";
	        statement.execute(delete);
	        } 
	        catch(Exception e) {System.out.println("fail to delete livre  ");}
		}
		
		public void supp_adhérent(int x) {
			try {
		        
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","");
		        statement=connection.createStatement();
		        String delete="DELETE from adhérent where num_inscription='"+x+"'";
		        statement.execute(delete);
		        } 
		        catch(Exception e) {System.out.println("fail to delete adhérent ");}
		}
	
	
		
		
		
		
		
	}



