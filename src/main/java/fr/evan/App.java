package fr.evan;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        Random randomNumbers = new Random();
        int nombreDeviner = randomNumbers.nextInt(100) + 1;

        System.out.println("Deviner le nombre : ");
        int nombre = clavier.nextInt();

        if (nombreDeviner == nombre) {
            System.out.println("Bonne réponse");
        }

        else if (nombreDeviner < nombre) {
            int ecart = nombre - nombreDeviner;
            System.out.println("Mauvaise reponse , Il vous manquait " + ecart + " .");
        }

        else {
            int ecart2 = nombreDeviner - nombre;
            System.out.println("Mauvaise reponse , vous avez de  " + ecart2 + " .");
        }
        System.out.println("Le nombre était " + nombreDeviner + " ."); 
    }

}

