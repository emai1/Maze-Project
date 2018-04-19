/* 
    Class to test MazeSolver

    v1
    Now takes in input from console, handles non existant mazes
*/


public class UserOfMazeSolver {
    
    private static Maze maze;

    public static void main(String[] args){
        java.util.Scanner console = new java.util.Scanner(System.in);

        while (maze == null) {
            System.out.println("Maze to solve:");
            String path = console.next();
            System.out.println("X-cor of starting position:");
            int x = Integer.parseInt(console.next());
            System.out.println("Y-cor of starting position:");
            int y = Integer.parseInt(console.next());

            try {
                maze = new Maze(path, x, y);
            }

            catch (java.io.FileNotFoundException e) {
                System.out.println("Error: " + path + " could not be found.");
            }

        }

        MazeSolver solver = new MazeSolver(maze);
        System.out.println(solver.solve());
    }
}
