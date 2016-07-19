/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.Multiplication;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        System.out.println("1. ADD");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. MAXIMUM");
        System.out.println("6. MINIMUM");
        System.out.println("7. POWER");
        System.out.println("8. MULTIPLICATION TABLE");
        System.out.println("5. EXIT");
        choice=sc.nextInt();
       while (true) {            
            switch(choice){
            
                case 1:{
                    int a,b;
                    System.out.println("Please enter second numbers:");
                    a=sc.nextInt();
                    System.out.println("Please enter second numbers");
                    b=sc.nextInt();
                    
                    int sum=a+b;
                    System.out.println(" Sum " + sum);
                    break;
                }
                case 2:
                {
                    int a,b;
                    System.out.println("Please enter first numbers");
                    a=sc.nextInt();
                    System.out.println("Please enter second numbers");
                    b=sc.nextInt();
                    int sub=a-b;
                    System.out.println(" Subtraction " + sub);
                    break;
                }
                
                case 3:
                {
                    int a,b;
                    System.out.println("Please enter first numbers");
                    a=sc.nextInt();
                    System.out.println("Please enter second numbers");
                    
                    b=sc.nextInt();
                    int mul=a*b;
                    System.out.println(" Subtraction " + mul);
                    break;
 
                }
                
                case 4:
                {
                 int a,b;
                    System.out.println("Please enter first numbers");
                    a=sc.nextInt();
                    System.out.println("Please enter second numbers");
                    b=sc.nextInt();
                    int div=a/b;
                    System.out.println(" Division " + div);
                    break;
                
                }
                
                
                case 5:
                {
                        int a,b,c;
                        System.out.println("Please enter first numbers");
                        a=sc.nextInt();
                        System.out.println("Please enter second numbers");
                        b=sc.nextInt();
                        System.out.println("Please enter third numbers");
                        c=sc.nextInt();
                        
                        
                        if(a>b && a>c)
                        {
                            System.out.println(a + "  is the greatest");
                        }
                        
                        else if(b>a && b>c)
                        {
                            System.out.println( b + " is the greatest");
                        }
                        
                        else
                        {
                                System.out.println(c + "  is the greatest");
                            }
                        break;
                            
                }
            
                
                case 6:
                {
                        int a,b,c;
                        System.out.println("Please enter any three numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        
                        
                        if(a<b && a<c)
                        {
                            System.out.println(a + " is the smallest");
                        }
                        
                        else if(b<a && b<c)
                        {
                            System.out.println( b + " is the smallest");
                        }
                        
                        else
                        {
                                System.out.println(c + " is the smallest");
                            }
                        break;
                }
                
                case 7:
                {
                    int a,b;
                    System.out.println("Please enter the base:");
                    a=sc.nextInt();
                    System.out.println("Please enter the power:");
                    
                    b=sc.nextInt();
                    int power=1;
                    for(int i=1;i<=b;i++)
                    {
                        power *=a;
                    }
                    System.out.println(a +"^" +b +"=" +power);
                    break;
                }
                
                case 8:
                {
                    int a,b,c = 0;
                    System.out.println("Please enter first number:");
                    a=sc.nextInt();
                    System.out.println("Please enter second number");
                    b=sc.nextInt();
                    
                    
                    for(  b=1;b<=10;b++)
                    {
                        
                         c=a*b;
                         System.out.println(a + "*" + b + "=" + c);
                         }
               break;
                   
                }
                
                case 9:
                {
                    System.exit(0);
                }
                
                default:
                {
                    System.out.println("Invalid Input!");
                }
                
                
                
            System.out.println("Do you want to continue?[Y/N]");
                   
                   
                    
                
                
            
            }
            
            
                    
                
        }
        
        
        
        
    }

    
    
    
     
    }
    

