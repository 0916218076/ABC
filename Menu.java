import java.text.NumberFormat;
import java.util.Scanner;

public class Menu {

    public static double deposit_money;

    public void deposit_money() {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.println("deposit money into your account: ");
        deposit_money = sc.nextDouble();

        if (deposit_money >= 0) {
            ac.setmoney_in_Account(deposit_money + ac.getmoney_in_account());
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(deposit_money);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {// ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }

    }

}