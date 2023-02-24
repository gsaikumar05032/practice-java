public class test7     // current class same name use  this key word
{
    test7 m1() {
        System.out.println("m1 method");
        test7 t=new test7();
        return t;
    }
    test7 m2(){
        System.out.println("m2 method");
        return this;

    }
    public static void main(String agr[]){
        test7 t=new test7();
        t.m1();
        t.m2();
    }


}
