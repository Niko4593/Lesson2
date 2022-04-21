package Lesson2;


public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(First(4, 7));
        Second(0);
        System.out.println(Third(-8));
        Fourth("Finally", 5);
    }

    public static boolean First(int a, int b) {

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void Second(int c){
        if (c >= 0){
            System.out.println(c + " -> Positive number");
        } else{
            System.out.println(c + " -> Negative number");
        }
    }

    public static boolean Third(int d){
        if (d >= 0){
            return false;
        }
        else {
            return true;
        }
    }

    public static void Fourth(String word, int f){
        for (int i = 0; i < f; i++){
            System.out.println(word);
        }
    }
}