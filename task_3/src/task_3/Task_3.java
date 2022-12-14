/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_3;

/**
 *
 * @author as
 */
 import java.util.Scanner; 
public class Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         
        Scanner input=new Scanner(System.in); 
         System.out.print("enter the size of the array "); 
        int n = input.nextInt(); 
        double []arr= new double[n]; 
         
        System.out.println("enter random numbers "); 
        for(int i=0; i<n;i++) 
        {  arr[i]=input.nextDouble();} 
         
       double largest =arr[0]; 
        
        for(int i=0; i<n;i++) 
        { if(largest<arr[i]) 
            largest=arr[i]; 
            } 
        System.out.print(largest); 
         
         
    } 
}  // TODO code application logic here
  

