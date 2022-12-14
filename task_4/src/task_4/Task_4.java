/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_4;

/**
 *
 * @author as
 */
 import java.util.Scanner;
public class Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        Scanner input =new Scanner(System.in); 
         
        int r = input.nextInt(); 
        int c =input.nextInt(); 
        int [][]arr=new int[r][c]; 
         
        for(int i=0; i<r;i++) 
        {    for(int j=0; j<c; j++ )  
            { arr[i][j]=input.nextInt(); } } 
             
        int [][]transport= new int[r][c]; 
         
        for(int i=0; i<r;i++) 
        {   for(int j=0; j<c; j++ )  
            { transport[j][i]=arr[i][j]; } } 
         
         
        for(int i=0; i<r;i++) 
        { 
            for(int j=0; j<c; j++ )  
            { System.out.print(transport[i][j]+"");  } 
            System.out.println(); 
        } 
             
         
    }   
    }  

// TODO code application logic here
   