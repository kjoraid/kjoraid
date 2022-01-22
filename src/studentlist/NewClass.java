/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 * Updated on 22 01 22
 * @author kjora
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word="Khalid";
        String newword="";
        char array[]= new char[10];
        for (int i=0;i<word.length(); ++i)
            array[i]=word.charAt(i);
        for (int i=word.length()-1;i>=0; --i)
            newword +=array[i];
        System.out.println(word);
        System.out.println(newword);
        //String newword2= reverse.
        System.out.println("");
    }
    
}
