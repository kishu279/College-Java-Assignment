class Product {
    String id;
    String name;
    double price;
    int stock;

    void setData(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    void discount(double discount) {
        price -= discount;
    }
}

public class prg1 {
    Product [] items;

    prg1(int n) {
        items = new Product[n];
    }

    static int count = 0;

    void data(String id, String name, double price, int stock) {
        items[count].setData(id, name, price, stock);
        count ++;
    }

    void display() {
        System.out.println("Id  Name    price   stock");
        for(int i = 0; i < count; i++) {
            System.out.println(items[i].id + ". " + items[i].name + " " + items[i].price + " " + items[i].stock);
        }
    }

    public static void main(String [] args) {
        int n = 3;
        prg1 obj = new prg1(n);

        obj.data("1a", "keyboard", 2790.09, 123);
        obj.data("1b", "mouse", 1290.09, 200);
        obj.data("1c", "stand", 1321, 203);

        obj.display();

    }
}