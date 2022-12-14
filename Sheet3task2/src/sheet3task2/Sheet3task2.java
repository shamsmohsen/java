/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet3task2;

/**
 *
 * @author as
 */
public class Sheet3task2 { 
     
    public static class triangle { 
        private double h,a,b,c; 
        
        public void set_t (double high, double l1,double l2,double l3) 
        {  h=high;  
          a=l1; 
          b=l2; 
          c=l3; 
        }  
         
        public double area ( ) 
        { return (0.5*b*h); } 
         
         public double circumference () 
         { return (a+b+c) ;  } 
          
    } 
     
    public static class circle { 
        private double r; 
         
        public void set_c(double raduis) 
        { r=raduis; } 
         
        public double area ( ) 
        { return (3.14*r*r ); } 
         
         public double circumference () 
         { return (2*3.14*r ) ;  } 
          
    } 
      
 
    public static void main(String[] args) { 
         
        triangle t1 = new triangle(); 
         
        t1.set_t(5, 5, 3, 6); 
         System.out.println( "area is " + t1.area()); 
         System.out.println( "circ is " + t1.circumference() ) ; 
         
        circle c1 = new circle(); 
         
        c1.set_c(5); 
       System.out.println( "area is " + c1.area() ); 
        System.out.println( "circ is " + c1.circumference()); 
         
 
         
         
    } 
}