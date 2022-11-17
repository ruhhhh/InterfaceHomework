/*
* Bu sınıf kullanıcının CustomerManager sınıfdan seçmiş olduğu telefon markasına göre telefonlara ait sınıflara ulaşımı sağlar.
* Bir bakıma çoklu kalıtım yapılmış olur.
* Ayrıca kullanıcı seçimine göre ürünlerin özelliklerini ve ürün alış metotlarını içerir.
* */
import java.util.Scanner;

public class BasePhoneManager {

    private Phone phone;

    BasePhoneManager(Phone phone)
    {
        this.phone = phone;
    }
    public void screenPropertyPhone()
    {
        phone.screenProperty();
    }
    public void memoryPropertyPhone()
    {
        phone.memoryProperty();
    }
    public void osPropertyPhone()
    {
        phone.osProperty();
    }
    public void buyPhone()
    {
        phone.buy();
    }
    public void buyAgainPhone()
    {
        phone.buyAgain();
    }
    public String phoneNamePhone()
    {
        return phone.phoneName();
    }

    public void selectMenu()
    {
        int kararVer;
        Scanner okuma = new Scanner(System.in);
        System.out.print("Telefon özelliklerine bakmak isterseniz:\n-----\n[1]-Ekran Özellikleri\n[2]-Hafıza Özellikleri\n[3]-İşletim Sistemi Bilgisi\n-----\nKararınız: ");
        kararVer = okuma.nextInt();

        switch (kararVer)
        {
            case 1:
                System.out.println("-----");
                screenPropertyPhone();
                System.out.println("-----");
                buyAgainPhone();
                System.out.println("-----");
                lastChange();
                break;
            case 2:
                System.out.println("-----");
                memoryPropertyPhone();
                System.out.println("-----");
                buyAgainPhone();
                System.out.println("-----");
                lastChange();
                break;
            case 3:
                System.out.println("-----");
                osPropertyPhone();
                System.out.println("-----");
                buyAgainPhone();
                System.out.println("-----");
                lastChange();
                break;
            default:
                System.out.println("Tanımsız bir değer girdiniz.");
                break;
        }
    }

    public void lastChange()
    {
        int chooice;
        Scanner okuma = new Scanner(System.in);
        System.out.print("Satın almak istemez miydiniz?\n-----\n[1]-Satın Al\n[2]-Hayır, Teşekkürler\n-----\nKararınız: ");
        chooice = okuma.nextInt();
        switch (chooice)
        {
            case 1:
                System.out.println("Tebrikler yepyeni bir " + phoneNamePhone() + " telefona sahip oldunuz.");
                break;
            case 2:
                System.out.println("Rica ederim. İyi günler.");
                break;
            default:
                System.out.println("Tanımsız bir değer girdiniz.");
                break;
        }
    }
}
