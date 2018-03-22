/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycommandpattern;

import java.text.DecimalFormat;

/**
 *
 * @author arash
 */
public class Receiver {
    DecimalFormat df = new DecimalFormat("#.##");
    public void addNumber(double number) {
        System.out.println("Added and result is: "+ df.format(number));
    }
    
    public void subNumber(double number) {
        System.out.println("Subtracted and result is: "+ df.format(number));
    }
    
}
