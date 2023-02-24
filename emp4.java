public class emp4 {     // call the constructor use  this keyword
    emp4(){            // must use this keyword first statement
        this(12);
        System.out.println("0-agrument");
    }
    emp4(int a){
        this(34,45);
        System.out.println("1-agrument");
    }
    emp4(int a,int b){
        System.out.println("2-agrument");
    }
    public static void main(String agr[]){
        emp4 e=new emp4();
    }
}
