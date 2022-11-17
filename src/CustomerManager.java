/*
* Kullanıcı seçimlerinin gerçekleştiği ana sınıftır. Polimorfizim yapılmıştır.
* */
import java.util.Scanner;

public class CustomerManager {
    public static void main(String[] args) {

        BasePhoneManager basePhoneManager;
        int karar;
        Scanner okuma = new Scanner(System.in);
        System.out.println("-----");
        System.out.print("[1]-Apple Satın Al\n[2]-Samsung Satın Al\n[3]-Huawei Satın Al\n-----\nKararınız: ");
        karar = okuma.nextInt();
        switch (karar)
        {
            case 1:
                basePhoneManager = new BasePhoneManager(new ApplePhoneManager());
                System.out.println("-----");
                basePhoneManager.buyPhone();
                System.out.println("-----");
                basePhoneManager.selectMenu();
                break;
            case 2:
                basePhoneManager = new BasePhoneManager(new SamsungPhoneManager());
                System.out.println("-----");
                basePhoneManager.buyPhone();
                System.out.println("-----");
                basePhoneManager.selectMenu();
                break;
            case 3:
                basePhoneManager = new BasePhoneManager(new HuaweiPhoneManager());
                System.out.println("-----");
                basePhoneManager.buyPhone();
                System.out.println("-----");
                basePhoneManager.selectMenu();
                break;
            default:
                System.out.println("Tanımsız bir değer girdiniz.");
                break;
        }
    }
}