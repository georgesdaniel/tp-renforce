package ex01;

import java.util.ArrayList;
import java.util.List;

public class TestLivre {

	public static String[] auteurs = {"BASSO", "BERTRAND", "BONNET", "CELIKBAS", "DELPECHE", 
			                          "EL ATMANI", "KACHI", "PICKEL", "PORTIER", "RODRIGUES", 
			                          "YOU", "VLAS"};
	public static String[] nomsLivres = {"Comment avoir de beaux cheveux", "Java 8 Expert", "L'encyclopédie de la chanson", "L'univers des plantes",
			                             "Les drosophiles en 10 tomes", "L'histoire de la Chine sous Mao", "Vers l'infini et au-delà", "Pourquoi j'aime Trump",
			                             "Le ragout sous toutes ses formes", "1001 salades", "Le secret des codes barres", "L'art du brassage de la bière"};
	
	public static int[] annees = {2010, 2015, 2012, 2014, 2013, 2016, 2011, 2015, 2010, 2016, 2015, 2013};
	public static int[] salles = {1, 2, 3};
	
	public static void main(String[] args) {
		// TODO 1. Modifier la classe Livre afin de respecter les règles de l'encapsulation
		// TODO 2. Mettre en place un constructeur dans la classe Livre qui prend en paramètres: l'année, l'auteur, le nom, la salle
		// TODO 3. Dans cette classe TestLivre, instanciez une ArrayList de Livre. Mettre 12 livres dans cette liste:
		//         Chaque livre sera instancié à partir des informations dans les tableaux ci-dessus. 

		
		List <Livre> bookslist = new ArrayList<Livre>();
		
				for (int i=0; i < auteurs.length; i++) {
					
					Livre monlivre = new Livre (annees[i], auteurs[i], nomsLivres[i], 1);
					bookslist.add(monlivre);
				}
		
		System.out.println(bookslist);
		
		
		LivreServices service = new LivreServices();
		List <Livre> listefiltree=service.Listetri(bookslist, 2010, 2015);
		
		System.out.println(listefiltree);
		
		
		
		// TODO 4. Créer une classe LivreServices
		// TODO 5. Dans la classe LivreServices, metrre en place une méthode qui prend en paramètre une liste de livres
		//         et qui retourne la liste des livres parus entre 2 années
		// TODO 6. Se servir de cette méthode pour afficher la liste des livres parus entre 2010 et 2014 et ceux parus entre 2015 et 2017
		// TODO 7. Créer une méthode qui permet de rechercher les livres rangés dans une salle donnée.
		// TODO 8. Extraire la liste des livres parus entre 2010 et 2015 rangés dans les salles 1 ou 2.
		
	}

}
