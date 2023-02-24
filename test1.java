public class test1 {
    int a=34;
    static int b=56;
    public static void main (String agr[]){
        test1 t=new test1();
        System.out.println(t.a); //34
        System.out.println(t.b); //56
        t.a=999;
        t.b=676;
        System.out.println(t.a); //999
        System.out.println(t.b); //676
        test1 t1=new test1();
        System.out.println(t1.a); //34
        System.out.println(t1.b); //676
        t1.b=456;
        test1 t2=new test1();
        System.out.println(t2.a); //10
        System.out.println(t2.b); //456
    }
}
