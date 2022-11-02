import java.util.Scanner;

public class If122 {
    public static void main(String[] args) {
        //    Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
//   musteri karti olup olmadigini sorun
//   Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
//   Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
//   alirsa %10 indirim yapin

        Scanner input = new Scanner(System.in);
        System.out.print("Aldigi urunun adedi: ");
        int adet = input.nextInt();
        System.out.print("Aldigi urunun fiyati: ");
        int fiyat = input.nextInt();
        System.out.print("Musteri kartiniz var mi? (E/H): ");
        char cevap = input.next().toUpperCase().charAt(0);
        if(adet<0 || fiyat<0){
            System.out.println("Hata...Adet veya fiyat degeri negatif olamaz...");
        }else {
            if(cevap=='E'){
                if (adet>10){
                    System.out.println("Tutar: " + (double) adet*fiyat*80/100);
                } else {
                    System.out.println("Tutar: " + (double) adet*fiyat*85/100);
                }
            }else if (cevap=='H'){
                if (adet>10){
                    System.out.println("Tutar: " + (double) adet*fiyat*85/100);
                } else {
                    System.out.println("Tutar: " + (double) adet*fiyat*90/100);
                }
            }else{
                System.out.println("Hata!..Musteri kartiniz var mi? icin sadece (E/H)");
            }
        }

         /*  Kullanicidan bir cumle ve bir kelime isteyin,kelimenin cumledeki kullanimina bakarak
             asagidaki 3 cumleden uygun olani yazdirin.
           -Girilen kelime cumlede kullanilmamis.
           -Girilen kelime cumlede 1 kere kullanilmis.
           -Girilen kelime cumlede 1'den fazla kullanilmis. */

        System.out.println("Lutfen bir cumle giriniz.");
        String cumle=input.nextLine();
        System.out.println("Lutfen bir kelime giriniz.");
        String kelime=input.next();
        int ilk= cumle.indexOf(kelime);
        int ikinci=cumle.indexOf(kelime,ilk+1);
        if (ilk==-1){
            System.out.println("Girilen kelime cumlede kullanilmamistir");
        } else if (ikinci==-1) {
            System.out.println("Girilen kelime cumlede bir kez kullanilmistir");
        } else {
            System.out.println("Girilen kelime cumlede birden fazla kullanilmistir ");
        }



    }
}
