public class emp2 {
    int eid;
    String ename;
    float fsal;
    emp2(int eid,String ename,float fsal){ //local variables

    }
    void display(){
        System.out.print("emp2 id="+eid);
        System.out.println("emp2 ename="+ename);
        System.out.println("emp2 fsal="+fsal);
    }
    public static void main(String agr[]){
        emp2 e=new emp2(111,"sai",100000f);
        e.display();
        emp2 e1=new emp2(112,"sk",123444);
        e1.display();
    }
}
