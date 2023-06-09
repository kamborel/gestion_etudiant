package model;

public class Etudiant {
	
	String nom; 
	int age; 
	double moyenne;
	String adresse;
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		if( (nom.length()) < 8 ||  (nom.length()) > 30) {
			System.out.println("Le nom d'un etudiant doit être supérieur à 8 caractères et inférieur ou égale à 30 caractères");
		} else {
			this.nom = nom;
		}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if( age < 18 ||  age > 28) {
			System.out.println("L'age d'un etudiant doit être entre 18 et 28");
		} else {
			this.age = age;
		}
	}


	public double getMoyenne() {
		return moyenne;
	}


	public void setMoyenne(double moyenne) {
		if( moyenne < 0 ||  moyenne > 20) {
			System.out.println("La moyenne d'un etudiant doit être entre 0 et 20");
		} else {
			this.moyenne = moyenne;
		}
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public void info(){
		System.out.println("Je suis l'étudiant "+this.nom+ " j'ai "+this.age+" ans "+ " mon adresse c'est "+this.adresse+ " j'ai eu "+this.moyenne+ " de moyenne");
	}
	
	
	public Etudiant() {
		
	}
	

	public Etudiant(String nom, int age, double moyenne, String adresse) { 
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;	
	}
	
	
}
