package BookStore_Project_Task.src;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        OnlineKitapMagazasi o = new OnlineKitapMagazasi();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("***** MENU *****");
            System.out.println();
            System.out.println("Kitap eklemek için 1:");
            System.out.println("Kitap silmek için 2:");
            System.out.println("Kitapları listelemek için 3:");
            System.out.println("Çıkış için 0:" + "\n");
            System.out.print("Seçiminiz = ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    o.kitapEkle();
                    break;
                case 2:
                    o.kitapSil();
                    break;
                case 3:
                    o.kitapListele();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Program sonlandırılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
            }

        } while (!exit);
    }
}
