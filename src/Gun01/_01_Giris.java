package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        webSitesiniAc();
//        loginTestIsleminiYap();
//        driverıKapat();
//    }

    @Test(priority = 1)     // -> annotation denir.
    void webSitesiniAc(){
        System.out.println("Driver tanimlandi ve web sitesi acildi.");
    }
    @Test(priority = 2)     // priority -> öncelik sırası demektir.
    void loginTestIsleminiYap(){
        System.out.println("Login test islemleri yapildi.");
    }
    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatildi ve cikildi.");
    }

    // Yeşil tik hatalı assertion yok demektir.
    // Eğer test metodlarına sıralama verilmezse alfabetik sıra ile çalışır.


}
