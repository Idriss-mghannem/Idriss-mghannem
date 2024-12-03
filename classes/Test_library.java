package library_management_system;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Test_library {
	LocalDate now=LocalDate.now();
	LocalDate expectedDate = LocalDate.of(2025, 1,2);
	
		Adherent a=new Adherent(8, 12542, null, null); 
		Emprunt e=new Emprunt(now,30, 0, null);
		Book b=new Book(-1,"titre","auteur");
		 @Test
		public void test_book() {
			
			Assertions.assertEquals(false,b.n_pages_valide(0));
			Assertions.assertEquals(true,b.n_pages_valide(10));
			
			}
		
		@Test 
		public void testAdherent() {
			//pour len(cin)<8
			Assertions.assertEquals(false,a.Cin_validation(a.getCin()));
			Assertions.assertNotEquals(true,a.Cin_validation(a.getCin()));
			//pour num_inscription >0
			Assertions.assertEquals(false,a.num_inscri_valide(0));
			Assertions.assertEquals(false,a.num_inscri_valide(-1));
			Assertions.assertEquals(false,a.isOnlyLetters("i2dr2ss"));
			Assertions.assertEquals(true,a.isOnlyLetters("idriss"));
			
			}
		@Test
		public void test_emprunt() {
			//pour tester la date de retour 
			Assertions.assertEquals(expectedDate,e.date_de_retour(now,e.getPeriod()));
			Assertions.assertEquals(false,e.validation_numins_et_periode(0));
		}



		

}
