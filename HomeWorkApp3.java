/**
 * Java 1. Homework 3
 *
 * @author Igor
 * @version 04.04.2022 edited
 */
 import java.util.Arrays;
 
 class HomeWorkApp3 {
    public static void main(String[] args) {
        
        invertArrayVal();
        fillArray();
        changeArray();
        squareDiagonal();
    }
    
    static void invertArrayVal() {
        int[] arr = { 1, 0, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray() {
        int[] arrTwo = new int[100];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrTwo));
    }
    
    static void changeArray() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
            arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void squareDiagonal() {
        int[][] arr = new int[9][9];
        for(int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i -1] = 1;
            }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}