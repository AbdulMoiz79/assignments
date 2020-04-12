/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Abdul Moiz711
 */
public class JavaApplication13 {

    /**
     * @param s
     * @param sub
     * @return 
     */
    public boolean substring(String s,String sub){
        return s.contains(sub);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sct = new Scanner(System.in);
        String s,sub;
        boolean b;
        System.out.print("ENTER STRING=");
        s = sct.nextLine();
        System.out.print("ENTER SUBSTRING=");
        sub = sct.nextLine();
        JavaApplication13 j=new JavaApplication13();
        b=j.substring(s, sub);
         if (b)
        {
            System.out.println("SUBSTRING EXIST");
        }
        else
        {
            System.out.println("SUBSTRING DOESNOT EXIST");
        }
    }   
}
