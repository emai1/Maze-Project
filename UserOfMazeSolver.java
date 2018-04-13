/* 
    Class to test MazeSolver
*/


public class UserOfMazeSolver {
    
    public static void main(String[] args) throws java.io.FileNotFoundException {

        System.out.println("=====Base Case Tests=====");

        test("mazes/4cell_treasureWest.txt", 0, 3, false);
        test("mazes/4cell_treasureWest.txt", 0, 0, true);
        test("mazes/4cell_treasureWest.txt", 300, 300, false);

        System.out.println("=====Recursive Case Tests=====");

        test("mazes/4cell_treasureWest.txt", 0, 2, true);
        test("mazes/4cell_treasureWest.txt", 0, 1, true);
        test("mazes/intersection_noTreasure.txt", 1, 1, false);
        test("mazes/intersection_treasureNorth.txt", 1, 1, true);
        test("mazes/largerMaze.txt", 0, 5, true);
        test("mazes/hole.txt", 0, 0, false);

    }

    private static void test(String mazeName, int startRank, int startFile, boolean answer) throws java.io.FileNotFoundException {
        Maze maze = new Maze(mazeName, startRank, startFile);
        MazeSolver solver = new MazeSolver(maze);
        System.out.println(solver.solve() + ", should be " + answer);
    }
}
