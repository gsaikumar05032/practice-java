public class test9 {
    void m1(){
        System.out.println("m1 method");
    }
    test9(){
        System.out.println("0-agr");
    }
    test9(int a){
        System.out.println("1-agr");
    }
    public static void main(String agr[]){
        test9 t=new test9();
        t.m1();
        test9 t1=new test9(10);
        t1.m1();
    }
}
