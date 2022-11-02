package method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodCalling {
    public static double getOrtalamaKazanc(List<Double> liste){

        double ortalama=0;
        for (double w:liste)
        {
            ortalama+=w;
        }

        return ortalama/liste.size();
    }

    public static void getOrtalamaninUstundeKazancGunleri(List<String> gunListe, List<Double> gunlukKazancListesi,double ortalama){

        List<String> sonGunListe=new ArrayList<>();
        for (int i = 0; i < gunlukKazancListesi.size(); i++)
        {
            if (ortalama< gunlukKazancListesi.get(i))
            {
                sonGunListe.add(gunListe.get(i));
            }
        }
        System.out.println("Ortalamanın üstündeki günler\n"+sonGunListe);
    }
    public static void getOrtalamaninAltindaKazancGunleri(List<String> gunListe, List<Double> gunlukKazancListesi,double ortalama){

        List<String> sonGunListe=new ArrayList<>();
        for (int i = 0; i < gunlukKazancListesi.size(); i++)
        {
            if (ortalama> gunlukKazancListesi.get(i))
            {
                sonGunListe.add(gunListe.get(i));
            }
        }
        System.out.println("Ortalamanın altındaki günler\n"+sonGunListe);
    }



    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */

    String[] arrGunler={"Pazartesi","Salı","Carsamba","" +
            "Persembe","Cuma","Cumartesi","Pazar"};

    List<String> listeGunler=new ArrayList<>();

    for (String w:arrGunler)
    {
        listeGunler.add(w);
    }
    List<Double> gunlukKazancListesi=new ArrayList<>();

    Scanner input=new Scanner(System.in);

    System.out.println("Bir Haftalık gunluk kazanclarınızı giriniz ");
    int gun=1;
    double kazanc=0;
    int counter=0;

    while (gun!=7){
        System.out.print(arrGunler[counter++]+" kazacınız = ");
        kazanc= input.nextDouble();
        gunlukKazancListesi.add(kazanc);
        gun++;
    }
    System.out.println(gunlukKazancListesi);

    double ortalama=getOrtalamaKazanc(gunlukKazancListesi);

    System.out.println("ortalama kazanc = "+ ortalama);

    getOrtalamaninUstundeKazancGunleri(listeGunler,gunlukKazancListesi, ortalama);
    getOrtalamaninAltindaKazancGunleri(listeGunler,gunlukKazancListesi, ortalama);


    }
}
