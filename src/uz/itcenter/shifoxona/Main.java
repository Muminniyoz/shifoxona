package uz.itcenter.shifoxona;

import uz.itcenter.shifoxona.controller.BemorController;
import uz.itcenter.shifoxona.model.Bemor;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Shifoxona tizimiga xush kelibsiz!");
        System.out.println("Tizimga kirish:");
        while (true) {
            System.out.print("Login: ");
            String login = sc.next();
            System.out.print("Parol: ");
            String parol = sc.next();

            if (login.equals("admin") && parol.equals("admin")) {
                start();
            } else {
                System.out.println("Login yoki parol xato");
                System.out.println("Qaytatdan o'rinib ko'ring");
            }
        }
    }

    private static void start() {
        while (true) {
            System.out.println("Bo'limni tanlang:");
            System.out.println("1 - Bemorlar bo'limi");

            System.out.println("0 - chiqish");
            int bolim = sc.nextInt();
            BemorController bc = new BemorController();
            switch (bolim){
                case 1: bc.start(); break;

                case 0: System.exit(0);
                default:
                    System.out.println("Noto'g'ri bo'lim raqami"
                    );
            }
        }
    }
}
