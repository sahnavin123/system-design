// Open for extension but closed for modification 

package Solid;

interface InvoiceDao1 {
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao1 {
    @Override
    public void save(Invoice invoice) {
    }
}

class fileInvoiceDao implements InvoiceDao1 {
    @Override
    public void save(Invoice invoice) {
    }
}
