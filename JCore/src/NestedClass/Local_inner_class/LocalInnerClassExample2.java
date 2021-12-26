package NestedClass.Local_inner_class;

public class LocalInnerClassExample2 implements Math2 {
    public static void main(String[] args) {

        LocalInnerClassExample2 localInnerClassExample2 = new LocalInnerClassExample2();
        System.out.println(localInnerClassExample2.doOperation(5,3));

    }

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
interface Math2{
    int doOperation(int a,int b);

}