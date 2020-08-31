/*
Eshika Dey
Command line program that allows the user to encode and decode text using a variety of ciphers. 

Encode:
    1. Ceasar Cipher
    ...

Decode:
    1. Ceasar Cipher
    ...

 */

package cipherencoderdecoder;

import java.util.Scanner;

public class CipherEncoderDecoder {

    public static void main(String[] args) {
        System.out.println("Welcome to Encode-Decode! A tool for encoding and decodeing messages using ciphers.");
        
        String again = "y";
        while (again.equalsIgnoreCase("y")){
            mainMenu();
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            
            switch (input){
                case "d":
                    //placeholder
                    System.out.println("You want to DECODE.");
                    break;
                case "e":
                    //placeholder
                    System.out.println("You want to ENCODE.");
                    break;
            }
            
            //after message encoding or decoding occurs
            System.out.println("Would you like to encode/decode another message? 'y' or 'n'.");
            again = s.nextLine();
            //if user enters something unintended, prompt them again until they do
            while (!again.equalsIgnoreCase("n") && !again.equalsIgnoreCase("y")){
                System.out.println("I didn't understand that. \nWould you like to encode/decode another message? 'y' or 'n'.");
                again = s.nextLine();
            }
        }
        System.out.println("Goodbye!");

    }
    public static void mainMenu(){
        System.out.println("Enter 'd' to DECODE a message.");
        System.out.println("Enter 'e' to ENCODE a message.");
    }
    
    
}
