package k191.fuchilo;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,5};
        System.out.println(arrayCheck(array));
        fizzBuzz();
    }
    public static boolean arrayCheck(int[] array){
        int i = 1;
        for (;i < array.length-1 & array[i-1] <= array[i];i++);
        if (i==array.length-1){
            return true;
        }
        else return false;
    }
    public static void fizzBuzz(){
        for (int i = 1;i<=100;i++){
             if (i % 3 == 0){
                System.out.print("fizz");
             }
             if (i % 5 == 0){
                System.out.print("buzz");
             }
             else if (i % 3 != 0 & i % 5 != 0)System.out.print(i);
             System.out.print("\n");
        }
    }
    public static boolean arrayHalfSumChecker(int[] array) {
        boolean f;
        int length = array.length;
        int firstHalf = 0, secondHalf = 0;
        for(int i = 0; i<length; i++) {
            if(i<length/2) {
                firstHalf += array[i];
            } else {
                secondHalf += array[i];
            }
        }
        if(firstHalf==secondHalf) {
            f = true;
        } else {
            f = false;
        }
        return f;
    }
}


