import java.sql.Date;

public class prg3 {
    int [][]DateTime;
    int n;
    private int count;

    prg3(int n) {
        DateTime = new int[n][3];
        this.n = n;
        count = 0;
    }

    void book(int date, int start, int end) {
        if(checkAvailability(date, start, end)) {
            DateTime[count][0] = date;
            DateTime[count][1] = start;
            DateTime[count][2] = end;

            count ++;
        } else {
            System.out.println("No Availability at this " + date + " " + start + " - " + end);
        }
    }

    boolean checkAvailability(int date, int start, int end) {
        for(int i = 0; i < n; i++) {
            if(DateTime[i][0] == date && (DateTime[i][1] >= start && DateTime[i][2] <= end)) {
                return false;
            }       
        }
        return true;
    }

    void booked() {
        System.out.println("Date and Time");
        
        for(int i = 0; i < count; i++) {
            System.out.println("Date: " + DateTime[i][0] + ", Time: " + DateTime[0][1] + " - " + DateTime[0][2]);
        }
    }

    public static void main(String []args) {
        prg3 obj1 = new prg3(10);

        obj1.book(12, 9, 12);
        obj1.book(12, 10, 1);
        obj1.book(10, 10, 1);
        obj1.book(2, 10, 7);
        obj1.book(13, 4, 9);
        obj1.book(12, 22, 24);
        obj1.book(12, 6, 8);

        obj1.booked();
    }
}
