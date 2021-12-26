package Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> stInfo = new Info<>("Info ParametrizedClass");
//        System.out.println(stInfo);
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);
//        System.out.println(info2.getValue());





    }
//    public void abc(Info<String> s){
//        String st = s.getValue();
//    }

    public void abc(Info<Integer> s){
        int st = s.getValue();
    }
}
class Info <T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info {" +
                "value=" + value +
                '}';
    }

    public T getValue(){
        return value;
    }


}

class Parent{

    public void abc(Info <String> st){
        String s = st.getValue();

    }

}

class Child extends Parent{

    public void abc(Info <String> st){
        String s = st.getValue();

    }

}