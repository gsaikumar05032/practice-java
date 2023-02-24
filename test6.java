public class test6 {  // method vs return type primitive as the return value
    int m1(){
        System.out.println("m1 method");
        return 23;
    }
    float m2(){
        System.out.println("m2 method");
        return 56.9f;
    }
    static char m3(){
        System.out.println("m3 method");
        return 'a';
    }
    public static void main (String agr[]){
        test6 t=new test6();
        t.m1();
        t.m2();
        test6.m3();
    }
}
