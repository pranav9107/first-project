public class this_keyword {
    int a,b;
    void set(int a,int b){
        this.a=a;
        this.b=b;
    }
    void get(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        this_keyword k1=new this_keyword();
        k1.set(20, 10);
        k1.get();
    }
}
