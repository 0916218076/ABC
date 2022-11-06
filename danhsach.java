
import java.text.NumberFormat;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class danhsach {
    ArrayList<Account> list = new ArrayList<>();
    Account ac = new Account();
    Scanner sc = new Scanner(System.in);

    public void input_infor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("input stk: ");

        long stk = sc.nextLong();

        System.out.println("input name Account: ");
        sc.next();
        String name_Account = sc.nextLine();

        System.out.println("input money in account: ");

        double money_in_account = sc.nextDouble();

        ac = new Account(stk, name_Account, money_in_account);
        list.add(ac);

    }

    public void arr_list() {
        System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).intk();
        }
    }

    public void naptien() {
        System.out.println("nhap so tai khoan muon nap: ");
        long s = sc.nextLong();
        for (int i = 0; i < list.size(); i++) {
            long d = list.get(i).getstk();
            if (s == d) {
                System.out.println("ban chon tai khoan: " + d);
                list.get(i).deposit_money();
            } else {
                System.out.println("");
            }
        }
    }

    public void ruttien() {
        System.out.println("nhap tai khoan ban muon rut: ");
        long s = sc.nextLong();
        for (int i = 0; i < list.size(); i++) {
            long d = list.get(i).getstk();
            if (s == d) {
                System.out.println("ban cho tai khoan rut tien: ");
                list.get(i).withdraw_money();
            }
        }
    }

    public void daohan() {
        System.out.println("nhap tai khoan can dao han: ");
        long s = sc.nextLong();
        for (int i = 0; i < list.size(); i++) {
            long d = list.get(i).getstk();
            if (s == d) {
                System.out.println("ban chon tai khoan: " + d);
                list.get(i).expire();
            }

        }
    }

    public void chuyentien() {
        double chuyen, nhan, tienchuyen;
        long s;
        long d;
        System.out.println("tai khoan ban muon chuyen: ");
        s = sc.nextLong();
        System.out.println("tai khoan nhan: ");
        d = sc.nextLong();
        for (int i = 0; i < list.size(); i++) {
            long s1 = list.get(i).getstk();
            if (s == s1) {
                chuyen = list.get(i).getmoney_in_account();
                for (int j = 0; j < list.size(); j++) {
                    long d1 = list.get(i).getstk();
                    if (d == d1) {
                        nhan = list.get(i).getmoney_in_account();
                        System.out.println("so tien can chuyen: ");
                        tienchuyen = sc.nextDouble();
                        if (tienchuyen <= chuyen) {
                            chuyen = chuyen - tienchuyen;
                            nhan += tienchuyen;
                            list.get(i).setmoney_in_Account(chuyen);
                            list.get(i).setmoney_in_Account(nhan);
                            System.out.println("Tài khoản số " + s + " vừa chuyển: $" + tienchuyen);
                            System.out.println("Tài khoản số " + d + " vừa nhận: $" + tienchuyen);
                        } else {
                            System.out.println("Số tiền nhập không hợp lệ!");
                        }

                    } else {
                        System.out.println("");
                    }
                }
            } else {
                System.out.println("");
            }
        }
    }

}
