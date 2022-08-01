package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    // Yeşil tik : test de hata yok
    // Sarı çarpi : test de hata var
    // Beyaz  : test çalıştırılmadı.skip

    @Test
    void equalOrnek(){
        String s1 = "Merhaba";
        String s2 = "Iyi aksamlar";

        // Olan, beklenen, "hata başlığı"
        Assert.assertEquals(s1,s2,"Karsilastirma sonucu");
        // Actual : Olan
        // Expected : Beklenen
    }

    @Test
    void notEqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "Iyi aksamlar";

        Assert.assertNotEquals(s1,s2,"Karsilastirma sonucu");
    }

    @Test
    void trueOrnek(){
        int s1 = 55;
        int s2 = 55;

        Assert.assertTrue(s1==s2,"Karsilastirma sonucu");
    }

    @Test
    void nullOrnek(){
        String s1 = null;

        Assert.assertNull(s1,"Karsilastirma sonucu");
    }

    @Test
    void direktFail(){
        int a = 5;
        if (a == 5)
            Assert.fail();
    }

}
