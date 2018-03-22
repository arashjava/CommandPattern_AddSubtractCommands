/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycommandpattern;

/**
 *
 * @author arash
 */
public class MyCommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Invoker control = new Invoker();
        Receiver reciver= new Receiver();
        
        // define actions
        ICommand add =new AddNumbers(reciver);
        ICommand sub =new subtractNumbers(reciver);
        
        
        control.setCommands(add, 34.23);
        control.setCommands(sub, 12.09);
        control.setCommands(sub, 13.34);
        control.setCommands(sub, 14.56);
        control.setCommands(add, 82.6);
        control.runCommands();
    }
    
}
