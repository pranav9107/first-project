//write a code to addition(arument,return value) and substraction(no argument,no return value)
public class add3 {
    int add (int a,int b){
        int c=a+b;
        System.out.println(c);
return 0;
    }
    void sub(){
        int d=20,e=10;
        int f=d-e;
        System.out.println(f); 
    }
    public static void main(String[] args) {
        add3 v1=new add3();
        v1.add(10 , 20);
v1.sub();
    }
}
