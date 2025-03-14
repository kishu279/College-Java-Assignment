import java.util.Scanner;

class Box {
    float width;
    float height;
    float depth;

    void BoxDimension(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    float calculateVolume() {   // returning the volume of the box
        return width * height * depth;
    }   
}

class BoxWidth extends Box {
    float costPerKm;
    float dis;

    void details(float w, float h, float d, float c, float dis) {
        BoxDimension(w, h, d);
        costPerKm = c;
        this.dis = dis;
    }

    float calculateCost() {
        return calculateVolume() * costPerKm * dis;
    }
}

public class prg1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Height, Width and Depth : ");
        float h = in.nextFloat();
        float w = in.nextFloat();
        float d = in.nextFloat();

        System.out.println("Enter the distance to be coovered and the cost per km : ");
        float dis = in.nextFloat();
        float cost = in.nextFloat();

        BoxWidth obj = new BoxWidth();

        obj.details(w, h, d, cost, dis);

        System.out.println("The Volume of the box : " + obj.calculateVolume());
        System.out.println("The Cost of Shipping : " + obj.calculateCost());
    }    
}
