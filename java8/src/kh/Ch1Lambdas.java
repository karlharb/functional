/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kh;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author karlharb
 */
public class Ch1Lambdas {
       public static void main(String[] args) {

           //ex2();
           
           //ex3();
           //ex4();
           
           ex8();
       }
       
       public static void ex2()
       {
           File tmp = new File("/tmp");           
           // with lambda
           File[] dirs = tmp.listFiles(file -> file.isDirectory());
           
           Arrays.asList(dirs).forEach(System.out::println);
                      
           //with method expression
           dirs = tmp.listFiles(File::isDirectory);
           
           Arrays.asList(dirs).forEach(System.out::println);                      
       }
       
       public static void ex3()
       {
           File tmp = new File("/tmp");                      
           
          String[] files = tmp.list((dir, fn) -> fn.endsWith(".tsv"));
           //String[] files = tmp.list((dir, fn) -> fn.length()> 10);

           Arrays.asList(files).forEach(System.out::println);                      

       }
       
       
       public static void ex4()
       {
           File tmp = new File("/tmp");           
           // with lambda
           File[] files = tmp.listFiles();
           
           //String[] files = {"london", "paris", "new york", "moscow", "berlin"};
           
           //
           Arrays.sort(files, (first, second) -> {
               if (first.isDirectory()) 
               {
                   if (second.isDirectory())
                   {
                       return first.getAbsolutePath().compareToIgnoreCase(second.getAbsolutePath());
                   }
                   return -1;
               }
               else
               {
                   if (second.isDirectory())
                   {
                       return 1;                   
                   }
                   return first.getAbsolutePath().compareToIgnoreCase(second.getAbsolutePath());
               }                                            
           }
           );
                       
          
           
           for (File file : files) {
               if (file.isDirectory()) {
                System.out.print("DIR: ");   
               }
               System.out.println(file);
           }              
       }
                                        
       
       public static void ex8()
       {
           String[] names = {"Peter", "Paul", "Mary"};
           
           List<Runnable> runners = new ArrayList<>();
           
           for (String name: names)
           {
               runners.add( () -> System.out.println(name));
           }               
                     
           runners.forEach(x-> x.run());                      
           
           runners = new ArrayList<>();
           
           for (int i=0; i < names.length; i++)
           {
               // not allowed as i cannot change
               //runners.add( () -> System.out.println(names[i]));
           }               
                     
           runners.forEach(x-> x.run());    
           
       }                    
}
