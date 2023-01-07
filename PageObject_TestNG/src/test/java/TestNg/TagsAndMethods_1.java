package TestNg;

import org.testng.annotations.*;

public class TagsAndMethods_1 {

    @BeforeSuite(enabled = false)
    public void BeforeSuite(){
        System.out.println("BEFORE SUİTE-->  İlk çalışan testng metotdur.");
    }




    @BeforeTest
    public void BeforeTest(){
        System.out.println("BEFORE TEST--> Testin başında çalışan metotdur.");
    }




    @BeforeClass
    public void BeforeClass(){
        System.out.println("BEFORE CLASS-->Testten sonra çalışan ilk clastır.Driver bilgileri girilir.");
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




    @AfterMethod
    public void AfterMethod(){
        System.out.println("AFTER METHOD--Her test metodundan sonra çelışır.");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AFTER CLASS--CLASS sonunda çalışır.");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AFTER TEST--Testin sonunda çalışır.");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AFTER SUİTE--SUİTE tamamlandıktan sonra en son çalışır.");
    }


}
