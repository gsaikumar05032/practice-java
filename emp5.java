public class emp5 {
    emp5(){
        System.out.println("0-agrument");
    }
    emp5(int a){
        System.out.println("1-agrument");
    }
    emp5(int a,int b){
        System.out.println("2-agrument");
    }
    public static void main(String agr[]){
        new emp5();
        new emp5(90);
        new emp5(78,98);
    }
}
