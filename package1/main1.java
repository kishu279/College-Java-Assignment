package package1;

class info {
    void display() {
        System.out.print("Hi this is the called method");
    }
}

public class main1 {
    void display() {
        System.out.print("Hii this side sourav");
    }
    public static void main(String args[]) {
        info var1 = new info();

        var1.display();
    }
}
