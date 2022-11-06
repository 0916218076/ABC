import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private long stk;
    private String name_Account;
    private double money_in_account;

    public Account() {
        this.money_in_account = 0;
        this.stk = 0;
        this.name_Account = null;
    }

    public Account(long stk, String name_Account, double money_in_account) {
        this.money_in_account = money_in_account;
        this.stk = stk;
        this.name_Account = name_Account;

    }

    public long getstk() {
        return stk;
    }

    public String getname_Account() {
        return name_Account;
    }

    public double getmoney_in_account() {
        return money_in_account;
    }

    public void setstk(long stk) {
        this.stk = stk;
    }

    public void setname_Account(String name_Account) {
        this.name_Account = name_Account;
    }

    public void setmoney_in_Account(double money) {
        this.money_in_account = money;
    }

    public void intk() {
        System.out.printf("%-10d %-20s %20s \n", getstk(), getname_Account(),
                NumberFormat.getCurrencyInstance(Locale.US).format(getmoney_in_account()));
    }

    public void deposit_money() {
        double deposit_money;

        System.out.println("deposit money into your account: ");
        deposit_money = sc.nextDouble();

        if (deposit_money >= 0) {
            setmoney_in_Account(deposit_money + getmoney_in_account());
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(deposit_money);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {// ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }

    }

    public double withdraw_money() {
        double phi = 5;
        double rut;
        System.out.println("so tien ban muon rut");
        rut = sc.nextDouble();

        if (rut <= (getmoney_in_account() - phi)) {
            setmoney_in_Account(getmoney_in_account() - (rut + phi));
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {// ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return withdraw_money();
        }
        return rut;
    }

    public double expire() {
        double laisuat = 0.035;
        setmoney_in_Account(getmoney_in_account() + (getmoney_in_account() * laisuat));
        System.out.println("ban vua duoc: " + NumberFormat.getCurrencyInstance(Locale.US).format(getmoney_in_account())
                + "tu dao han 1 thang");
        return getmoney_in_account();
    }

}