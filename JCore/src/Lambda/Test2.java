package Lambda;

public class Test2 {

    static void def(i i){
        System.out.println(i.agc());
    }

    public static void main(String[] args) {
        def(()-> 18);
    }
}
interface i{
    int agc();

}
