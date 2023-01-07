package TestNg;

import org.testng.annotations.*;

public class TestNG_2 {

    @BeforeClass
    public void BeforeClass(){


        System.out.println("BEFORE CLASS-->Sistem Açılıyor.");
    }


    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BEFORE METHOD--Her test metodundan önce çelışır.");
    }

    @Test
    public void Test1(){
        System.out.println("---------Test1---------");
        System.out.println("-----------------------");
    }




    @Test
    public void Test2(){
        System.out.println("---------Test2---------");
        System.out.println("-----------------------");
    }




    @Test
    public void Test3(){
        System.out.println("---------Test3---------");
        System.out.println("-----------------------");
    }

    @AfterClass
    public void AfterClass(){


        System.out.println("AFTER CLASS--Sistem Kapanıyor.");
    }

    @AfterMethod
    public void AfterMethod(){

        System.out.println("AFTER METHOD---------------------");
    }
}
