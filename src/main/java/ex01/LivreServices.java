package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivreServices {

	
	public List <Livre> Listetri  (List <Livre> bookslist, int anneemin,int anneemax ){
	
		 
		List<Livre> listTri2 = new ArrayList<Livre>();
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Veuillez saisir une année min:");
//		int annee1 = scanner.next();
//		
//		
//		
//		System.out.println("Veuillez saisir une année max:");
//		int annee2 = scanner.next();
		
		for (Livre i : bookslist) {
			if (i.getAnnee() < anneemax && i.getAnnee() > anneemin) {
				listTri2.add(i);
			}
		}
		
		
		return listTri2;
		
	}
	
	
}
