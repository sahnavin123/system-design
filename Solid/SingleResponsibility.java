// A class should have only  `1 reason to change 

package Solid;
// Marker Entity

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;

    }

    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }
}

// InvoiceDao -> data access object
class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        // save into the db
    }
}

class InvoicePrinter {
    @SuppressWarnings("unused")
    private Invoice invoice;




    public InvoicePrinter (Invoice invoice){
        this.invoice = invoice; 
    }

    public void print(){
        
    }

}
