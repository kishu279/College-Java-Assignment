import java.util.*;

// ## Understanding Abstraction and Interfaces

// interface print {
//     void printSomething(String str);    // Abstract method 
//     // {
//     //     System.out.print("The value of str : " + str);
//     // }
// }

// class user implements print{
//     String userName;
    
//     public void printSomething(String str) {
//         System.out.println(str);
//     }
// }

// abstract class Animal {
//     int legs;
//     String livesWhere;

//     abstract void printSpecificProperty(String property);

//     void commonProperty() {
//         System.out.println("They have " + this.legs + " and they lives in " + livesWhere);
//     }
// }

// class Tiger extends Animal {

//     void printSpecificProperty(String property) {
//         System.out.println("They are : " + property);
//     }

//     void setLegsAndLivesWhere(int legs, String livesWhere) {
//         this.legs = legs;
//         this.livesWhere = livesWhere;
//     }
// }

class Animal {
    int legs;
    String livesWhere;

    void printSpecificProperty(String property) {
        System.out.println("From Animal Class");
        System.out.println("They are : " + property);
    }

    void commonProperty() {
        System.out.println("They have " + this.legs + " and they lives in " + livesWhere);
    }
}


class Tiger extends Animal {

    // Default or use @Overrides
    void printSpecificProperty(String property) {
        System.out.println("From Tiger Class");
        System.out.println("They are : " + property);
    }

    void setLegsAndLivesWhere(int legs, String livesWhere) {
        this.legs = legs;
        this.livesWhere = livesWhere;
    }
}

public class prg1 {
    public static void main(String args[]) {

        // user obj = new user();
        // obj.printSomething("Sourav");

        // Tiger obj1 = new Tiger();
        // obj1.setLegsAndLivesWhere(4, "Jungle");
        // obj1.commonProperty();

        // obj1.printSpecificProperty("Herbivores");

        Animal obj = new Tiger();
        obj.printSpecificProperty("Eat Depends on the Habitat");

    }
}
