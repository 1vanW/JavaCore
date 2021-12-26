package NestedClass.AnonymousClass;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {

        Math2 m = new Math2(){

            int c = 10;

            void abc(){}
            @Override
            public int doOperation(int a, int b){
                AnonymousClass anonymousClass = new AnonymousClass();
                return a + b + anonymousClass.x;
            }


        };
        Math2 m2 = new Math2(){

            int c = 10;

            void abc(){}
            @Override
            public int doOperation(int a, int b){
                return a * b;
            }


        };

        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6));



    }

}

class Math2{
    int doOperation(int a,int b){
        return a/b;
    }

}
