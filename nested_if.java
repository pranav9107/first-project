import java.util.Scanner;
public class nested_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double per;
        System.out.println("enter the percentage");
        per=sc.nextDouble();
        if(per>35){
            if(per>75){
                System.out.println("pass with good marks");
            }
            else{
                System.out.println("pass");
            }
        }
        else{
            System.out.println("fail");
        }                                               
    }
}