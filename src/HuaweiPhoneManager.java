/*
 * Bu sınıf Huawei marka telefonların özelliklerini ve fiyatını tanımlamaktadır.
 * Phone Interface'inden implement edilmiştir.
 * */
public class HuaweiPhoneManager implements Phone{
    int price = 8000;
    double priceTemp;

    @Override
    public String phoneName() {
        return "Huawei";
    }

    @Override
    public void screenProperty() {
        System.out.println("Huawei telefonunun ekranı 7.4' ve 60 Hz'dir.");
    }

    @Override
    public void memoryProperty() {
        System.out.println("Huawei telefonun hafızası 512 gb'dir.");
    }

    @Override
    public void osProperty() {
        System.out.println("Huawei telefonlar HuaweiOS işletim sistemine sahiptir.");
    }

    @Override
    public void buy()
    {
        System.out.println("Huawei telefon fiyatı: "+ price+ " TL");
    }

    @Override
    public void buyAgain()
    {
        double priceTemp = (price*1.25) - price;
        System.out.println("Bugüne özel Huaweilerde inanılmaz indirim. Yeni fiyatımız: "+priceTemp+ " TL");
    }
}
