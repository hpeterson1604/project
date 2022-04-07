import java.util.Random;
import java.util.Scanner;

class HomeWorkApp4 {

    Random random;
    Scanner scaner;
    char[][] table;

    public static void main(String[] args) {
        new HomeWorkApp4().game();
    }

    HomeWorkApp4() {
        random = new Random();
        scaner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;                
            }
            turnAI();
            if (checkWin('o')) {
                System.out.println("YOU LOST!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;                
            }           
        }
        System.out.println("GAME OVER");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < 3; y++) { 
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < 3; y++) { 
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter number column_X and number row_Y [1_3]: ");
            x = scaner.nextInt() - 1;
            y = scaner.nextInt() - 1;
        } while(!isCellValid(x, y));
        table[x][y] = 'x';
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x, y));
        table[x][y] = 'o';
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }
    
    boolean checkWin(char ch) {
        for (int y = 0; y < 3; y++) {
            if (table[0][y] == ch && table[1][y] == ch && table[2][y] == ch) return true;
        }
        for (int x = 0; x < 3; x++) {
            if (table[x][0] == ch && table[x][1] == ch && table[x][2] == ch) return true;
        }                
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        
        return false;
    }
    
    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}