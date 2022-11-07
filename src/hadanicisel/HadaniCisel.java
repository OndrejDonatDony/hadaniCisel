/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hadanicisel;

/**
 *
 * @author ondrej.donat
 */
import java.util.Scanner;
public class HadaniCisel {
    static int minValue = 1;
    static int maxValue = 100;
    static boolean end = false;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        
               
        do{
            displayMenu();
            choice = sc.nextInt();

            switch(choice){
                case 1: computerGuesses(); break;
                case 2: userGuesses(); break;
                case 0: end = true; break;
                default: System.out.println("Neplatna Volba");
            }       
        }while(!end); //end == false
    }
    
    private static void displayMenu(){
       System.out.println("Vitej ve hre!");
       System.out.println("Zadej volbu");
       System.out.println("1. Hada pocitac");
       System.out.println("2. Hada uzivatel");
       System.out.println("0. Konec hry");
    } 

    private static void computerGuesses() {
        System.out.println("Tady bude varianta hada pocitac");
        int min;
        int max;       
        int guess;
        int answer;
        System.out.println("Uzivateli, mysli si cislo " + "v rozsahu " + minValue + " do " + maxValue);
        min = minValue;
        max = maxValue;
        do{
        guess = (min+max)/2;
        System.out.println("uzivateli,mysli si cislo " + guess + "?");
        System.out.println("Odpovez: -1 pro mensi, 1 pro vetsi, 0 trefa");
        answer = sc.nextInt();
        
        if (answer == -1){
            max = guess-1;
            }
        else if(answer == 1){
            min = guess +1;
        }
        else{ System.out.println("trefa");
        end = true;
        }
    }while(!end);
}
    private static void userGuesses() {
        System.out.println("Tady bude varianta hada uzivatel");
    }

    private static boolean end() {
      
        return false;
    }
}

