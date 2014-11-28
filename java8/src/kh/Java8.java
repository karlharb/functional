/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kh;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author karlharb
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] words = {"london", "paris", "new york", "moscow", "berlin"};

        Arrays.sort(words, (first, second) -> Integer.compare(first.length(), second.length()));

        for (String word : words) {
            System.out.println(word);
        }

        // better version of above code
        //loc 724 - note errata in book - comparing and not compare !
        Arrays.sort(words, Comparator.comparing(String::length));
        
        
        System.out.println("---");

        Arrays.sort(words, String::compareToIgnoreCase);
        for (String word : words) {
            System.out.println(word);
        }
        
        
        
        
        
        //loc 611 - default method added to old interface
        Arrays.asList(words).forEach(System.out::println);
    }

    //loc 548
    public static void repeatMessage(final String text, final int count) {
        Runnable r = () -> {
            while (count > 0) {
                //count--;
            }
            System.out.println(text);
            Thread.yield();
        ;
    };
    
    new Thread(r).start();
}

}

//loc 626 - default methods
interface Person {
    long getId();
    
    default String getName() { return "Fred Bloggs"; }    
}


//loc 694 - interfaces can have static methods


