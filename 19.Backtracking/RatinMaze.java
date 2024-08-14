/* Question 1 :
Rat in a Maze
You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
square matrix of order N * N where the cells with value 0 represent the maze’s blocked
locations while value 1 is the open/available path that the rat can take to reach its destination.
The rat's destination is at (N - 1, N - 1).
Your task is to find all the possible paths that the rat can take to reach from source to
destination in the maze.
The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down)
i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).

Sample Input : int maze[][] = { { 1, 0, 0, 0 },
{ 1, 1, 0, 1 },
{ 0, 1, 0, 0 },
{ 1, 1, 1, 1 } }; 

Sample Output : 1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1

*/


public class RatinMaze {

    // Method to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if a cell is safe to visit
    public static boolean isSafe(int maze[][], int x, int y) {
        // Check if (x, y) is within bounds and is a path (value 1)
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    // Method to solve the maze problem
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // Utility method to solve the maze using backtracking
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // Base case: If (x, y) is the destination
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            // Check if the cell is already included in the solution path
            if (sol[x][y] == 1)
                return false;

            // Mark the cell as part of the solution path
            sol[x][y] = 1;

            // Move forward in x direction
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            // Move down in y direction
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            // If none of the above movements work, unmark the cell as part of the solution path
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Main method
    public static void main(String args[]) {
        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        solveMaze(maze);
    }
}
