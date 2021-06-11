package uz.itcenter.shifoxona.controller;

import uz.itcenter.shifoxona.model.Bemor;
import uz.itcenter.shifoxona.service.BemorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BemorController implements IController{
    private BemorService bemorService = new BemorService();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void start() {
        System.out.println("Be'morlar bo'limi");
        while(true){
            System.out.println("Amalni tanlang:");
            System.out.println("1 - qo'shish");
            System.out.println("2 - o'zgartirish");
            System.out.println("3 - o'chirish");
            System.out.println("4 - ro'yxat");
            System.out.println("5 - qidirish");
            System.out.println("0 - chiqish");

            int amal = 0;
            System.out.println(">>> ");
            amal = sc.nextInt();
            switch (amal){
                case 1: qoshish(); break;
                case 2: ozgartirish(); break;
                case 3: ochirish(); break;
                case 4: royxat(); break;
                case 5: qidiruv(); break;

                case 0: return;
                default:
                    System.out.println("Noto'g'ri amal!!!");
            }


        }

    }

    @Override
    public void qoshish() {
        System.out.println("Bemor qo'shish:");
        Bemor b = new Bemor();
        sc.nextLine();
        System.out.print("Ism:");
        b.setIsm(sc.nextLine());
        System.out.print("Familiya:");
        b.setFamiliya(sc.nextLine());
        System.out.print("Sharif:");
        b.setSharif(sc.nextLine());
        System.out.print("Kassalik:");
        b.setKassalik(sc.nextLine());

        bemorService.qoshish(b);


    }

    @Override
    public void ochirish() {

    }

    @Override
    public void ozgartirish() {
        System.out.println("Bemor ma'lumotlarini o'zgartirish:");
        royxat();
        System.out.println("Ro'yxatdan kerakli bemor id ni kiriting");
        int id = sc.nextInt();

        Bemor b = bemorService.getById(id);
        if(b == null){
            System.out.println("Bunday id li bemor topilmaidi");
            ozgartirish();
            return;
        }
        sc.nextLine();


        System.out.print("Ism["+b.getIsm()+"]:");
        String ism = sc.nextLine();

        if(!Objects.requireNonNull(ism).isEmpty()){
            b.setIsm(ism);
        }
    System.out.print("Familiya["+b.getFamiliya()+"]:");
        String f = sc.nextLine();

        if(!Objects.requireNonNull(f).isEmpty()){
            b.setFamiliya(f);
        }


    }

    @Override
    public void royxat() {
        System.out.println("Bemorlar ro'yxati:");
        System.out.println("ID | Ism  | Kassalik");
        for(Bemor b: bemorService.getBemorlar()){
            System.out.printf("%d | %s | %s \n", b.getId(), b.getIsm(), b.getKassalik());
        }


    }

    @Override
    public void qidiruv() {

    }
}
