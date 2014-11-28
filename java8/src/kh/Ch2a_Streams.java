/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kh;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karlharb
 */
public class Ch2a_Streams {
       public static void main(String[] args) {

           f1();
           
        
       } 

    private static void f1() {
           try {
               String contents = new String(Files.readAllBytes(Paths.get("/tmp/zips.txt")), StandardCharsets.UTF_8);
               
               List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
               
               long count = words.parallelStream().filter(w -> w.length()>12).count();
               
               System.out.println(count);
               
           } catch (IOException ex) {
               
           }
        
        
    }
          
       
       
          
          
          
}
