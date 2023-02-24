public class block5 {
    int a=67;
    static int b=89;
    void m1(int a){
        System.out.println("m1 method");
    }
    static void m2(int a,int b){
        System.out.println("m2 method");
    }
    block5(){
        this(78);
        System.out.println("0-agru");
    }
    block5(int a){
        this(65,78);
        System.out.println("1-agru");
    }
    block5(int a,int b){
        System.out.println("2-agru");
    }
    {
        System.out.println("insatnce block");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String agr[]){
        new block5();
    }
}
