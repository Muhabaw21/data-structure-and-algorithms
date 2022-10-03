import java.util.ArrayList;
import java.util.List;
public class Main {

    public static int guthrieIndex(int num) {
        if (num == 1) {
            return 0;
        }
int count =0;
        while (num != 0 && num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num = 3 * num + 1;
                count++;
            }
        }
return count;
    }
    public static void main(String[] args) {
//call a funcion or a method here
        int result = guthrieIndex(42);
// testing output
        System.out.println(result);
        //
        Sum add = new Sum();
        add.setFirstNumber(54);
        add.setSecondNumber(2);
        System.out.println("add: "+  add.getAdditionResult());
        System.out.println("subtract: " + add.getSubtractionResult());
        System.out.println("Division: " + add.getDivisionResult());
        System.out.println("Multiply:" + add.getMultiPlicationResult());
        bankAccount account = new bankAccount("1000139715927", 100000.0, "Alex", "alluwa2127@gmail.com","+251973965944");
        double withdraw = account.withdrawMoney(1000000);
        System.out.println(withdraw);

    }

}