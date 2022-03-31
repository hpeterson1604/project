/**
 * Java 1. Homework 1
 *
 * @author Igor
 * @version 27.03.2022 edited
 */
class HomeWorkApp1 {
    
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = -8;
        int b = 3;
        System.out.println(a + b >= 0? "Positive" : "Negative"); 
    }
    
    static void printColor() {
        int value = 77;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
        
    static void compareNumbers() {
        int a = 2;
        int b = 3;
        System.out.println(a >= b? "a> = b" : "a < b");
    }
    
}