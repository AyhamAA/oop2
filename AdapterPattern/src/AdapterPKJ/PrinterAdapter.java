package AdapterPKJ;
public class PrinterAdapter extends OldSystem{
     private NewPrinter newPrinter ;

    public PrinterAdapter(NewPrinter newPrinter) {
        this.newPrinter = newPrinter;
    }

    @Override
    public void PrintDocument() {
        super.PrintDocument();
    }
     
    
}
