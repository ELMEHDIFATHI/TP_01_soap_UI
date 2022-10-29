package server;

import mypackage.CalculeService;
import mypackage.CalculeServiceService;

public class clientjava {
    public static void main(String[] args) {
        CalculeService methode=new CalculeServiceService().getCalculeServicePort();
        System.out.println(methode.sommeTwoNumber(100,20));
        System.out.println(methode.multiplicationTwoNumber(100,20));
        System.out.println(methode.soustractionTwoNumber(100,20));
        System.out.println(methode.divisionTwoNumber(100,0));
    }
}
