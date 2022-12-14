/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_2;

/**
 *
 * @author as
 */
import java.util.Scanner;
public class Task_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ASCII Value: ");
        int ascii = scan.nextInt();
        char ch = (char)ascii;
        System.out.println("\nThe character is \'"+ch+ "\'");
    }}  
    
    