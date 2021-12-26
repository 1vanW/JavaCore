public class MinNumbers {
    public static void main(String[] args) {
        int [] number = new int []{ 25,76,32,8,19,5,4,2,911,65,1,3,-2 };
            int minIndex = 0;
        for (int i = 0; i < number.length;i++){
            int minValue = number[i];
            int min = 0;
            if(minValue < min ){
                min = minValue;
                minIndex = i;
                System.out.println("Самое минимальное число в массиве " + min + " а его индекс равен " + minIndex);
            }
        }

    }
}
