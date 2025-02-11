class InvoiceItem {
    int id;
    String des;
    int qua;
    float price;

    InvoiceItem(int id, String des, int qua, float price) {
        this.id = id;
        this.des = des;
        this.qua = qua;
        this.price = (25.0f / 100) * price + price; // Fix tax calculation
    }

    void discount(int per) {
        float dis = price * (per / 100.0f); // Fix discount calculation
        price = price - dis;
        System.out.printf("After discount: %.2f (Discount applied: %.2f)\n", price, dis);
    }

    void display() {
        System.out.println("\nItem Details:");
        System.out.printf("ID: %d | Description: %s | Quantity: %d | Price with Tax: %.2f\n", id, des, qua, price);
    }
}

public class prg4 {
    public static void main(String[] args) {
        InvoiceItem obj1 = new InvoiceItem(12, "Grocery", 13, 650);
        
        obj1.discount(12);
        obj1.display();
    }
}
