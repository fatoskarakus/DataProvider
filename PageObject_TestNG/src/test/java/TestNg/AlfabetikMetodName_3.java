package TestNg;

import org.testng.annotations.Test;

public class AlfabetikMetodName_3 {

//testng de methot isimleri alfabetiktir.Öncelik sıralaması için "priority" kullanılır.

    @Test() //default:0
    public void d(){
        System.out.println("---------a---------");
        System.out.println("-----------------------");
    }



//metodu atlamak için
    @Test(priority = 1,enabled = false)
    public void b(){
        System.out.println("---------b---------");
        System.out.println("-----------------------");
    }



    @Test(priority = 2)
    public void c(){
        System.out.println("---------c---------");
        System.out.println("-----------------------");
    }

}
