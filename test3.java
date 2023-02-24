public class test3 {
    void m1(int a, char ch){
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(ch);
    }
    static void m2(String str, double d){
        System.out.println("m2 method");
        System.out.println(str);
        System.out.println(d);
    }
    public static void main(String agr[]){
        test3 t=new test3();
        t.m1(23,'a');
        test3.m2("sai",87.8);
    }
}
