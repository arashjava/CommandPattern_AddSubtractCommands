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
public class subtractNumbers implements ICommand{

    private Receiver rec;

    public subtractNumbers(Receiver receiver) {
        this.rec = receiver;
    }
    
    @Override
    public void execute(double number) {
        rec.subNumber(number);
    }
 }
