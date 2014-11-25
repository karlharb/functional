/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kh;

import java.util.stream.Stream;

/**
 *
 * @author Karl
 */
public class Ch2Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        
        Stream<String> upper = song.map(String::toUpperCase);
        
        for (Object arg : upper.toArray()) {
            System.out.println(arg);
                
            }
        

// TODO code application logic here
    }
    
}
