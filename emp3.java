public class emp3 {
    int eid;
    String ename;
    float fsal;
    emp3(int eid,String ename,float fsal){  // local and instance are same use this keyword
        // conversion of local value to instance value
        this.eid=eid;
        this.ename=ename;
        this.fsal=fsal;
    }
    void display(){
        System.out.println("emp3 id="+eid);
        System.out.println("emp3 ename="+ename);
        System.out.println("emp3 fsal="+fsal);
    }
    public static void main(String agr[]){
        emp3 e=new emp3(12,"sai",23444);
        e.display();
        emp3 e1=new emp3(13,"jashu",45000);
        e1.display();
        emp3 e2=new emp3(14,"siddu",50000);
        e2.display();
    }
}
