public class instance {
    int a=10;
    int b=20;
    public static void main(String[] agr){ // static method
        // static area
        instance i = new instance();
        System.out.println(i.a);
        System.out.println(i.b);
        i.m1();
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }
}
