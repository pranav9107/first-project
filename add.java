//write a code to addition with arument and no return value
public class add {
    void hello(int a, int b) {
        int c = a + b;
        System.out.println("addition is:" + c);
    }

    public static void main(String[] args) {
        add v1 = new add();
        v1.hello(10, 20);

    }
}
