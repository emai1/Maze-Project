/*
    MazeSolver v0

    Given a maze, will return whether the treasure can be reached or not as a boolean value.
*/

public class MazeSolver {

    private Displayer displayer;
    private final int console_height = 15;
    private Maze maze;
    private final int[] directions = {Maze.EAST, Maze.SOUTH, Maze.NORTH, Maze.WEST};

    public MazeSolver(Maze input) {
        maze = new Maze(input);
        displayer = new Displayer(console_height);
    }

    public boolean solve() {
        displayer.atTopOfWindow(maze.toString());

        // base cases
        if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
        }
        if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        }
        
        // recursive case
        maze.dropA(maze.WALL);
        Maze snapshot = new Maze(maze);
        
        for (int direction : directions) {
            maze.go(direction);
            if (solve()){
                return true;
            }
            else {
                maze = new Maze(snapshot);
            }
        }
        return false;
    }
    
}
