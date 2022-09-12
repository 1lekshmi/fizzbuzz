public class rough {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // multiple of 3 and 5
            } if ((i % 3 == 0 && i % 7 ==0) || (i % 5 == 0 && i % 7 == 0)){
                System.out.println("FizzBang"); // multiple of 3 and 7 or multiple of 7 and 5
            } if (i % 3 == 0 && i % 13 == 0){
                System.out.println("FizzFezz"); // multiple of 3 and 13
            } if (i % 13 == 0 && i % 5 == 0){
                System.out.println("FezzBuzz"); // multiple of 13 and 5
            } if (i % 7 == 0 && i % 13 == 0){
                System.out.println("FezzBang"); // multiple of 7 and 13
            } if (i % 11 == 0 && i % 13 == 0){
                System.out.println("FezzBong"); // multiple of 11 and 13
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // multiple of 3
            } else if (i % 5 == 0){
                System.out.println("Buzz"); // multiple of 5
            } else if (i % 7 == 0) {
                System.out.println("Bang"); // multiple of 7
            } else if (i % 11 == 0) {
                System.out.println("Bong"); // multiple of 11
            } else if (i % 13 == 0) {
                System.out.println("Fezz"); // multiple of 13
            } else{
                System.out.println(i);


            }
        }
    }
}
