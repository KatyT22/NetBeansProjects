/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author katy
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        
        try{
            cars.remove("BMW");
        }catch(Exception e){
            System.out.println("exception error");
        }finally{
            cars.add("Peugeot");
        }
        
        
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("USA");
        System.out.println(capitalCities);
        
        /*System.out.println("Jeu de cartes");
        
        int nbTour;
	int carteA;
	int carteB;
	int pointA = 0;
	int pointB = 0;
	//String  line;
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()) {
            System.out.println("Nombre de tour :");
            nbTour = sc.nextInt();
            sc.nextLine();

            for(int i=0; i<nbTour; i++){
                System.out.println("Carte A");
                carteA=sc.nextInt();
                System.out.println("Carte B");
                carteB=sc.nextInt();
                sc.nextLine();
                if(carteA>carteB){
                    pointA++;
                }else if(carteB>carteA){
                    pointB++;
                }
            }
            System.err.println("pointA = "+pointA+"; pointB = "+pointB);
            System.out.println(pointA>pointB?"A":"B");
        }    
    
        System.out.println("Recherche produit : ");
        
        int  nbProduits;
        String produit;
        String currProduit;
        String currNomProduit;
        int currPrix;
        int lowestPrix = Integer.MAX_VALUE;
		//Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
                        System.out.println("Nombre produits :");
			nbProduits = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nom produit :");
                        produit = sc.nextLine();
            
            //System.err.println("nbProduits = "+nbProduits+"; nom produit = "+produit);
			/* Lisez les données et effectuez votre traitement */
           /*for(int i=0; i<nbProduits; i++){
                System.out.println("Nom produit recherché : ");
                currProduit = sc.nextLine();
                currNomProduit = currProduit.split(" ")[0];
                currPrix = Integer.parseInt(currProduit.split(" ")[1]);
                //currPrix = sc.nextLine();
                //System.err.println("currProduit = "+currProduit);
                System.err.println("currNomProduit = "+currNomProduit+"; currPrix = "+currPrix);
                if(produit.equals(currNomProduit)){
                    if(currPrix < lowestPrix){
                        lowestPrix = currPrix;
                    }
                }
            }
            System.out.println(lowestPrix);
		}*/
        
                Foo f = new AbstractExample();
                
                System.out.println("résultat Nombre spécial : "+ NombreSpecial.IsSpecialNumber(122111222));
        
    }
    
}
