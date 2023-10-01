/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingbasketballsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zhiya
 */
public class AmazingBasketballSetup {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws FileNotFoundException, IOException {
      int optionNum = mainMenu();
      if (optionNum == 1) {
       dataInput();
    }
    }
    
    public static int mainMenu(){
      System.out.println("Welcome to this Amazing Basketball Program! What would you like to do?");
       System.out.println("1: Initialise the program with data.");
        System.out.println("2: Enter in a team.");
        Scanner sc = new Scanner (System.in);
        String option = sc.nextLine();
      //  int optionNum = Integer.parseInt(option);
      return Integer.parseInt(option);
}
    
    public static void dataInput() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader (new FileReader("FantasyFootballData2.csv"));
        // csv = comma separated values
        
        String line; 
               while ((line = br.readLine())!= null){//br.readline without doing anything for the first line!
                 String[] playerData = line.split(",");
                // for(int i=0; i<playerData.length; i++){
                    // if(i%2 )
                // } for cal the length??
                   System.out.println(playerData[0]);
                   if (playerData[4].equals("Forward")){
                       Forward Player= new Forward(0, playerData[0],playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
                
                   }
               }
       //. System.out.println("The first line is: "+ line);
       // String[] playerData = line.split(",");    }
    
    }}

  
    
    



