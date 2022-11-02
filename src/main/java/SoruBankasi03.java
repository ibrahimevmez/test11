public class SoruBankasi03 {
    public static void main(String[] args) {
     /*   Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        sembol olmalıdır.
        Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        '! a b 3 k' kodunuz konsolda false yazdırmalıdır. */
      /*  String sifre = "!1a23b4?es";
        boolean sembolSayisi = sifre.replaceAll("\\w","").replaceAll("\\s","").length()>0;
        boolean karakterSayisi = sifre.replaceAll("\\s","").length()>8;
        boolean gecerliMi = sembolSayisi &&karakterSayisi;
        System.out.println(gecerliMi);

        String a = "Java";
        boolean x = a.contains("v");
        System.out.println(x);
        int y = a.replaceAll("\\a","").length();
        System.out.println(y);

    /*   String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız*/
      /*  String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String s = gomlekFiyat.replaceAll("[$.]","");
        String b = kitapFiyat.replaceAll("[$.]","");
        double xy = Double.valueOf(s);
        double yy = Double.valueOf(b);
        System.out.println("Toplam Fiyat : " + (xy+yy)/100);*/

        













    }
}
