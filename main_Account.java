import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main_Account {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Account> list = new ArrayList<>();
        danhsach mn = new danhsach();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("input number in menu: ");
            System.out.println("----------------------------------------------------------");
            System.out.println("1. input information");
            System.out.println("2. output information: ");
            System.out.println("3. deposit money into your account");
            System.out.println("4. withdraw money");
            System.out.println("5. expire");
            System.out.println("6. transfers");
            int a;
            a = sc.nextInt();
            switch (a) {
                case 1:

                    mn.input_infor();
                    break;
                case 2:

                    mn.arr_list();

                    break;

                case 3:
                    mn.naptien();
                    break;

                case 4:
                    mn.ruttien();
                    break;
                case 5:
                    mn.daohan();
                    break;
                case 6:
                    mn.chuyentien();
                    break;

            }

        }

    }
}