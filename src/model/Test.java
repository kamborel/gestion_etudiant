package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner le nom de l'étudiant");
		String nom = sc.nextLine();
		
		System.out.println("Donner l'adresse de l'étudiant");
		String adresse = sc.nextLine();
		
				
		System.out.println("Donner l'age de l'étudiant");
		int age = sc.nextInt();
		
		System.out.println("Donner la moyenne de l'étudiant");
		double moyenne = sc.nextDouble();
		
		
		
		Etudiant etudiant2 = new Etudiant(nom, age, moyenne, adresse);
		
		etudiant2.info();
	}

}
