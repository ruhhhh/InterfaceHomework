/*
* Bu sınıf Samsung marka telefonların özelliklerini ve fiyatını tanımlamaktadır.
* Phone Interface'inden implement edilmiştir.
* */

public class SamsungPhoneManager implements Phone{
    int price = 12000;
    double priceTemp;

    @Override
    public String phoneName() {
        return "Samsung";
    }

    @Override
    public void screenProperty() {
        System.out.println("Samsung telefonunun ekranı 6,1' ve 120 Hz'dir.");
    }

    @Override
    public void memoryProperty() {
        System.out.println("Samsung telefonun hafızası 1 tb'dir.");
    }

    @Override
    public void osProperty() {
        System.out.println("Samsung telefonlar Android işletim sistemine sahiptir.");
    }

    @Override
    public void buy() {
        System.out.println("Samsung telefon fiyatı: "+ price+ " TL");
    }

    @Override
    public void buyAgain() {
        int priceTemp = price - 250;
        System.out.println("BSize personel indirimi yapalım. Yeni fiyatınız "+priceTemp+ " TL");
    }
}
