class shape {
    int s;
    int l, b;

    void insertSize(int s, int l, int b) {
        this.s = s;
        this.l = l;
        this.b = b;
    }

}

class Square extends shape {
    int Area() {
        return s * s;
    }
}

class Rectangle extends shape {
    int Area() {
        return l * b;
    }
}

public class prg3 {
    public static void main(String args []) {

    }
}
