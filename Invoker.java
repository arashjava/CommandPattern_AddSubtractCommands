/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycommandpattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class Invoker {
    private ArrayList<Double> numbers=new ArrayList<Double>();
    private ArrayList<ICommand> commands=new ArrayList<ICommand>();


    
    public void setCommands(ICommand command, Double number) {
        this.commands.add(command);
        int _size= numbers.size();
        if (_size==0){
            this.numbers.add(number);
        }
        else {
            if (command instanceof subtractNumbers){
               this.numbers.add(numbers.get(_size-1)- number);
            }
            if (command instanceof AddNumbers){
               this.numbers.add(numbers.get(_size-1)+ number);
            }
        }
    }
    
    public void runCommands(){
        for (int i=0; i<commands.size(); i++){
             commands.get(i).execute(numbers.get(i));
        }
    }
}
