package AdapterPKJ;

public class Test {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem(); 
        oldSystem.PrintDocument();
        NewPrinter newPrinter = new NewPrinter(); 
        PrinterAdapter adapter = new PrinterAdapter(newPrinter); 
        adapter.PrintDocument();
    }
    
}
