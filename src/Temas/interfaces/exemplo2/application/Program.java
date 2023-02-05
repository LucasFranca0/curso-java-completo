package Temas.interfaces.exemplo2.application;

import Temas.interfaces.exemplo2.entities.ComboDevice;
import Temas.interfaces.exemplo2.entities.ConcretPrinter;
import Temas.interfaces.exemplo2.entities.ConcretScanner;

public class Program {
    public static void main(String[] args) {

        ConcretPrinter p = new ConcretPrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");
        System.out.println();

        ConcretScanner s = new ConcretScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
