public class test4 {
    void m1(){
        m2();
        System.out.println("m1 method");
    }
    void m2(){
        m3(12);
        System.out.println("m2 method");
    }
    void m3(int a){
        System.out.println("m3 method");
    }
    public static void main(String agr[]){
        test4 t=new test4();
        t.m1();
    }

}
