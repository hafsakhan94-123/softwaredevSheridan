package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean printerDuplex;

    public Printer(int tonerLevel, boolean printerDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.printerDuplex = printerDuplex;
    }

    public int tonerFillUp(int amount) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        } else {
            return -1;
        }

    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.printerDuplex){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}