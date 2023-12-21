
package banka.hesap;

import java.util.Scanner;

public class BankaHesap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. İşlem: Bakiye Öğrenme\n"
                          +"2. İşlem: Para Çekme\n"
                          +"3. İşlem: Para Yatırma\n"
                          +"Çıkış için q'ya basınız";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        while (true) {            
            System.out.println("İşlem seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : = " + bakiye);
                
            }
            else if (islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye-tutar<0) {
                    System.out.println("Yeterli bakiye yok  Bakiyeniz: " + bakiye);
                    
                    
                }
                else
                    bakiye= bakiye - tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                
                
            }
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye = bakiye + tutar;
                
                System.out.println("Yeni bakiyeniz = " + bakiye);
                
            }
            else
                System.out.println("Geçersiz işlem lütfen tekrar deneyiniz...");
            
        }

        
    }
}
