
public class pattern {
    void Y() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == j) {
                    System.out.print(" \\");
                } else {
                    System.out.print(" ");
                }
            } 

            for(int j = 0; j < 5; j++) {
                if(j == 3 && i >= 5) {
                    System.out.print(" |");
                } else {
                    System.err.print("");
                }
            }

            for(int j = 0; j < 5; j++) {
                if(i + j == 4 ) {
                    System.out.print("/");
                } else {
                    System.err.print(" ");
                } 
            }
                System.out.println();
        }
    }
    
    void InvY() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 3 && i < 5) {
                    System.out.print("       |");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0; j < 5; j++) {
                if(i >= 5 && i + j == 9) {
                    System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }

            for(int j = 0; j < 5; j++) {
                if(i - 5 == j && i >= 4) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void tiltedSquare() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i + j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }

            
        }
    }


    public static void main(String [] args) {
        pattern obj = new pattern();

        // obj.Y();
        // obj.InvY();

        obj.tiltedSquare();


    }    
}
