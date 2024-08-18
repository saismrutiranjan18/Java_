/* Question 3 :
Knight’s Tour
Given a N*N board with the Knight placed on the first block of an empty board. Moving
according to the rules of chess, knights must visit each square exactly once. Print the order of
each cell in which they are visited.
Sample Input 1 : N = 8
Sample Output 1 :
0 59 38 33 30 17 8 63
37 34 31 60 9 62 29 16
58 1 36 39 32 27 18 7
35 48 41 26 61 10 15 28
42 57 2 49 40 23 6 19
47 50 45 54 25 20 11 14
56 43 52 3 22 13 24 5
51 46 55 44 53 4 21 12
 */

 public class Knight {
    static final int N = 8; // Size of the chessboard

    // Check if (x, y) is a valid move for the knight
    public static boolean isSafe(int x, int y, int[][] sol) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Print the solution matrix
    public static void printSolution(int[][] sol) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    // Initialize the solution matrix and start the knight's tour
    public static boolean solveKT() {
        int[][] sol = new int[N][N];

        // Initialize all cells of the solution matrix with -1
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // Define the possible moves for the knight
        int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] yMove = { 1, 2, 2, 1, -1, -2, -2, -1 };

        // Start the knight from the first cell (0, 0)
        sol[0][0] = 0;

        // Attempt to solve the problem using backtracking
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
            return true;
        }
    }

    // Recursive utility function to solve the Knight's Tour problem
    public static boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove) {
        int next_x, next_y;

        // Base case: If all squares are visited, return true
        if (movei == N * N) {
            return true;
        }

        // Try all next moves from the current coordinate (x, y)
        for (int k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            // Check if the next move is safe
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei; // Mark the move

                // Recursively attempt to solve the problem with the next move
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1; // Backtracking: Unmark the move
                }
            }
        }

        return false; // If no move is possible, return false
    }

    public static void main(String[] args) {
        solveKT(); // Start solving the Knight's Tour problem
    }
}