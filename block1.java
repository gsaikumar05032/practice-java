public class block1 {
    block1(){
        this(89);
        System.out.println("0-agrument");
    }
    block1(int a){
        this(90,56);
        System.out.println("1-agrument");
    }
    block1(int a,int b){
        System.out.println("2-agrument");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String agr[]){
        new block1();
    }
}
