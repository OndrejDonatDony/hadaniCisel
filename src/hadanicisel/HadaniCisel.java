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
    static int pocetHer = 1;
    static boolean end = false;
    static boolean zpet = false;      
    static Scanner sc = new Scanner(System.in);   
    public static void main(String[] args) { //program pro hlavní menu
        int choice;                     
        do{
            displayMenu();
            choice = sc.nextInt();
            
            switch(choice){
                case 1: user1Guesses();break; 
                case 2: user2Guesses();break; 
                case 3: nastaveni();break;
                case 0: end = true; break;                                                    
            }       
        }while(!end); //end == false
    }
    
    private static void displayMenu(){ //hlavní menu
       System.out.println("Vitej ve hre!");     
       System.out.println("1. Hrac 1");
       System.out.println("2. Hrac 2");
       System.out.println("3. Nastaveni");
       System.out.println("Rozsah hledaneho cisla je od " + minValue + " do " + maxValue +", Pocet her je "+pocetHer+". Pro zmenu volby prejdete do nastaveni.");
       System.out.println("0. Konec hry");
    } 

    private static void user1Guesses() {
        System.out.println("Hraje hrac 1");
        if(minValue>maxValue){
            int a = maxValue;
            maxValue = minValue;
            minValue = a;                   
        } 
        int max = maxValue;
        int min = minValue;
        int pocetPokusu = 1;
        int i = 0;
        while(i<pocetHer){
            int hra = i+1;
            int tip = (max+min)/2;
            System.out.println(hra+". hra");
            System.out.println("pokus: "+pocetPokusu+".");          
            System.out.print("pocitac ti vybral nejvhodnejsi tip: "+tip +" Zde napis svuj tip: ");
            int cislo = sc.nextInt();
            System.out.println();
            System.out.println("s - smaller, b - bigger, f - found, e - exit");           
            char odpoved; 
            odpoved = sc.next().charAt(0);
            //odpovedi uzivatele
            if(odpoved == 'b'){
            min = cislo;                                        
            }else if(odpoved == 's'){
            max = cislo;    
            }else if(odpoved == 'f'){
                System.out.println("Gratuluju! Nasel jsi cislo na "+pocetPokusu+". pokus"); 
                i++;
            }else if(odpoved == 'e'){
            break;
            }  
            pocetPokusu++;
        }        
    }   
    
    private static void user2Guesses() { 
        System.out.println("Hraje hrac 2");
        if(minValue>maxValue){
            int a = maxValue;
            maxValue = minValue;
            minValue = a;                   
        } 
        int max = maxValue;
        int min = minValue;
        int pocetPokusu = 1;
        int i = 0;
        while(i<pocetHer){
            int hra = i+1;
            int tip = (max+min)/2;
            System.out.println(hra+". hra");
            System.out.println("pokus: "+pocetPokusu+".");          
            System.out.print("pocitac ti vybral nejvhodnejsi tip: "+tip +" Zde napis svuj tip: ");
            int cislo = sc.nextInt();
            System.out.println();
            System.out.println("s - smaller, b - bigger, f - found, e - exit");           
            char odpoved; 
            odpoved = sc.next().charAt(0);
            //odpovedi uzivatele
            if(odpoved == 'b'){
            min = cislo;                                        
            }else if(odpoved == 's'){
            max = cislo;    
            }else if(odpoved == 'f'){
                System.out.println("Gratuluju! Nasel jsi cislo na "+pocetPokusu+". pokus"); 
                i++;
            }else if(odpoved == 'e'){
            break;
            }  
            pocetPokusu++;
        }                     
    }
    
    private static void nastaveni() { //program pro menu nastavení
        int choice2;
        zpet = false;
        do{
            displayMenu2();
            choice2 = sc.nextInt();
            
            //prohozeni min a max hodnot
            if(minValue > maxValue){
            int min = minValue;
            minValue = maxValue;
            maxValue = min;                                 
            } 
            if(pocetHer<=0){
            pocetHer=1;
            }  
            
            switch(choice2){
                case 1: 
                minValue = sc.nextInt();break;   
                case 2: 
                maxValue = sc.nextInt();break;
                case 3:
                pocetHer = sc.nextInt();break; 
                case 0: zpet = true;                                                      
            }       
        }while(!zpet); //end == false                           
    }
    
    private static void displayMenu2() { //menu pro nastaveni
       System.out.println("Nastavení");     
       System.out.println("1. Minimum hledaného čísla: "+minValue);
       System.out.println("2. Maximum hledaného čísla: "+maxValue);
       System.out.println("3. Pocet her: "+pocetHer);
       System.out.println("0. Zpět");
    }
    
    private static boolean end() {  //konec hry 
        return false;
    }
}
    

  
