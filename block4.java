public class block4 {
    int a=90;
    static int b=89;
    void m1(int a){
        System.out.println("m1 method");
    }
    static void m2(String str){
        System.out.println("m2 method");
    }
    block4(){
        System.out.println("0- agrument");
    }
    block4(int a){
        System.out.println("1-agrument");
    }
    block4(int a, int b){
        System.out.println("2-agrument");
    }
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String agr[]){
        new block4();
        new block4(45);
        new block4(34,76);
    }

}
