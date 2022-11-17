/*
 * Bu sınıf Apple marka telefonların özelliklerini ve fiyatını tanımlamaktadır.
 * Phone Interface'inden implement edilmiştir.
 * */
public class ApplePhoneManager implements Phone
{
    int price = 20000;
    double priceTemp;
    @Override
    public String phoneName()
    {
        return "Apple";
    }
    @Override
    public void screenProperty() {
        System.out.println("Apple telefonunun ekranı 6.7' ve 120 Hz'dir.");
    }

    @Override
    public void memoryProperty() {
        System.out.println("Apple telefonun hafızası 128 gb'dir.");
    }

    @Override
    public void osProperty() {
        System.out.println("Apple telefonlar iOS işletim sistemine sahiptir.");
    }

    @Override
    public void buy() {
        System.out.println("Apple telefon fiyatı: "+ price+ " TL");
    }

    @Override
    public void buyAgain() {
        double priceTemp = price*1.20;
        System.out.println("Biraz önce fiyatlara zam yapıldı. Yeni fiyatımız: "+priceTemp+ " TL");
    }
}
