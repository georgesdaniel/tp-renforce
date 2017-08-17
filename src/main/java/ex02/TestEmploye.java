package ex02;

public class TestEmploye {
	
	public static String[] noms = {"Jackson", "Smith", "Warrand", "Cosco", "Clement", "Forrez", 
			                       "Thomson", "Wood", "Pot", "Gavin", "Andrew", "Vaughn"};
	
	public static String[] postes = {"BACK", "FRONT", "BACK", "FRONT", "BACK", 
            "FRONT", "BACK", "FRONT", "FRONT", "BACK", 
            "FRONT", "BACK"};
	public static double[] salaires = {2750.0, 2725.0, 2695.0, 2700.0, 2695.0, 2525.0, 
			                           2870.0, 3010.0, 2725.0, 2540.0, 2310.0, 2250.0};

	public static void main(String[] args){
		//TODO 1. Modifier la classe Employe afin de respecter les règles de l'encapsulation
		//TODO 2. Trouver un moyen de rendre la classe Employe impossible à instancier
		//TODO 3. Faire en sorte que les classes Technicien et Cadre héritent de Employe
		//TODO 4. Mettre en place un constructeur dans la classe Employe avec les 2 paramètres: nom et salaire
		//TODO 5. Mettre en place le même constructeur dans les classes filles.
		//TODO 6. Dans cette méthode, créez une ArrayList d'Employe et l'alimenter avec les données des tableaux ci-dessus
		//        On instanciera une instance de DeveloppeurBack si le postes[i] est BACK, et DeveloppeurFront dans le cas 
		//        contraire.
		
		//TODO 7. Faire une classe qui va centraliser des services permettant de répondre aux questions ci-dessous:
		//     a. Quelle est la moyenne des salaires des développeurs BACK
		//     b. Quelle est la moyenne des salaires des développeurs FRONT
		//     c. Quelle est la moyenne des salaires
		//TODO 8. Triez les employés par salaires descendants
		//TODO 9. Triez les employés par ordre alphabétique
	}
}
