/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author kjora
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        name=in.nextLine();
        char[] revName= name.toCharArray();
        for (int i =name.length()-1;i>=0;--i)
            System.out.println(revName[i]);
            
        
    }
    
}
