/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author shubham
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s=new String("JAVA");
        String s1=new String("JAVA");
        String s2=new String("java");
        System.out.println("== result is: "+(s==s1));
        System.out.println(".equals result is: "+(s.equals(s2)));
        System.out.println(".equalsIgnoreCase result is: "+(s.equalsIgnoreCase(s2)));
        System.out.println(".compareTo result is: "+(s.compareTo(s2)));
       
            
                
    }
    
}
