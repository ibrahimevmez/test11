public class ifsorubankasi {
    public static void main(String[] args) {

       /* String sifre = "a1b2c3d44";
        if(sifre.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if(sifre.replaceAll("\\s", "").length()>=8){
            System.out.println("Gecerli Sifre");
        }else {
            System.out.println("Gecersiz Sifre ");
        }


        String pwd = "Az12/*587";

        boolean pwdLength = pwd.replaceAll(" ", "").length()>7;
        boolean pwdSpace= pwd.contains(" ");

        String sonuc = pwdSpace ? "Bosluk karakteri kullanmayiniz" : (pwdLength && !pwdSpace ? "Geçerli Şifre" : "Gecersiz sifre") ;
        System.out.println("Parola = " + sonuc);


        if(!pwdSpace){
            if(pwdLength && !pwdSpace){
                System.out.println("Sifre : Gecerli sifre");
            }else{
                System.out.println("Sifre : Gecersiz sifre");
            }
        }else{
            System.out.println("!!! Bosluk karakteri kullanmayiniz !!!");
        }  */
       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        String sifre1 = "Az12/*587";
        boolean a = sifre1.replaceAll(" ","").length()>7;
        boolean b = sifre1.contains(" ");

        String gecerliSifre = a ? "Gecerli sifre" : b ? "Sifrede bosluk karakteri lullanamyiniz" : "Gecersiz sifre";
        System.out.println("gecerliSifre= " + gecerliSifre ); */
       /* Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
        konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
        */
       /* double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        String operator = " fahrenaytdanSantigarata ";
        if(operator.equals("mildenKmye ")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate ")){
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata ")) {
            System.out.println((fahrenayt - 32) * 5 / 9);
        }*/
















    }
}
