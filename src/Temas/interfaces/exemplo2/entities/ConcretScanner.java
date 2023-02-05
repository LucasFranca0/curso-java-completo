package Temas.interfaces.exemplo2.entities;

public class ConcretScanner extends Device implements Scanner{
    public ConcretScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
