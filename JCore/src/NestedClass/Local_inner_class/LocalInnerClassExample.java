package NestedClass.Local_inner_class;

public class LocalInnerClassExample {



    public static void main(String[] args) {
        Math m1 = new Math();
        m1.getResult(21,4);

    }


}

class  Math{
    public void getResult(int delimoe, int delitel){

        class Delenie{


            public int getDelimoe() {
                return delimoe;
            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatik(){
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
//        delenie.setDelitel(4);

        System.out.println("Delimoe " + delenie.getDelimoe());
        System.out.println("Delitel " + delenie.getDelitel());
        System.out.println("Chastnoe " + delenie.getChastnoe());
        System.out.println("Ostatok " + delenie.getOstatik());
    }
}
