
public class ab {
    public static void main(String args[]) {
        B b1 = new B();
        b1.show(30);
    }

}

    
    class A {
        int a = 10;
    }

    class B extends A{
        int a=20;
        void show(int a)
    {
        System.out.println(super.a);
    }
    }
