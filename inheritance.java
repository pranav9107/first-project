  class p{
        void hello(){
        System.out.println("hello");
        }
    }
    class c extends p{
        void world(){
        System.out.println("world");
    }
    }
public class inheritance {
    public static void main(String[] args) {
        c c1 = new c();
        c1.hello();
    c1.world();
    }
}
