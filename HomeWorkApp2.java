/**
 * Java 1. Homework 2
 *
 * @author Igor
 * @version 30.03.2022
 */
class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSumBetw10and20(3, 1));
        System.out.println(isPositOrNegat(-1));
        System.out.println(isNumberPosOrNeg(-2));
        thisLineNumbRepet(3, "Lorem ipsum dolor sit amet");
        System.out.println(defineLeapYears(1700));
    }
    
    static boolean checkSumBetw10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static String isPositOrNegat(int x) {
        return x >= 0? "x is positive" : "x is negative";
    }
    
    static boolean isNumberPosOrNeg(int numb) {
        return numb < 0;
    }
    
    static void thisLineNumbRepet(int numb, String line) {
        for ( int i = 0; i < numb; i++) {
            System.out.println(line);
        }
    }
    
    static boolean defineLeapYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        } 
    }
}
   