package TestNg;

import org.testng.annotations.Test;

public class Testler_4 {

    @Test(groups = "grup2")
    public void Test_1(){
        System.out.println("---------Test1---------");
        System.out.println("-----------------------");
    }


    @Test(groups = "grup2")
    public void Test_2(){
        System.out.println("---------Test2---------");
        System.out.println("-----------------------");
    }

    @Test(groups = "grup2")
    public void Test_3(){
        System.out.println("---------Test3---------");
        System.out.println("-----------------------");
    }

    @Test(groups = "grup1")
    public void Test_4(){
        System.out.println("---------Test4---------");
        System.out.println("-----------------------");
    }

    @Test(groups = "grup1")
    public void Test_5(){
        System.out.println("---------Test5---------");
        System.out.println("-----------------------");
    }

    @Test(groups = "grup1")
    public void Test_6(){
        System.out.println("---------Test6---------");
        System.out.println("-----------------------");
    }


}
