/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varcharsearch;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maylngni
 */
public class VarCharSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu = null, name = null, let = null;
        char letter = 0;
        int count = 0;
        Scanner input = new Scanner(System.in); 
   
 
        System.out.println("Input name");
        name = input.nextLine();

        while (letter != '5') {
            count = 0 ;
            System.out.println("Type the letter you want to count, type 5 to stop");
            letter = input.next().charAt(0);
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == letter) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}
