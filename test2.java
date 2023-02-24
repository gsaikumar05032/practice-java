public class test2 {
    void m1(){ // by using object
        System.out.println("m1 method");
    }
    static void m2(){ // by using class name
        System.out.println("m2 method");
    }
    public static void main (String agr[]){
        test2 t=new test2();
        t.m1();
        test2.m2();
    }

}
