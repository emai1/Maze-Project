# MazeSolver by Pineapple Pizza
## Personnel
Brian Lee, Erik Mai

## Statement of the problem
Returns the boolean value of the statement "There exists one path through a maze starting at a designated beginning, and ending at a treasure.

Definition: Maze - A grid with barriers  
Looping is disallowed: Each position can be reached at most once.

## Recursive Abstraction
When I am asked to ( Statement of the problem ), the recursive abstraction can ( Statement of the problem ) after I have moved one position.

## Base case
If you are at the treasure, return true

## Pseudocode
```Java
if found treasure  
  return True  
else  
  get list of valid steps  
    for each  
      take the step  
      invoke recursive abstraction  
    go back
```
## Class(es), fields and methods
1. Maze
   - Fields
     - Visualization of the maze
   - Methods
     - step() : Takes a step in a specified direction
     - isLegal() / legalSteps() : Checks if the move made was legal / Finds all legal moves
     - toString()
     - Constructor()
2. Solver
   - Fields
   - Methods
     - findSolution() : Checks for a possible solution to the maze
   
## Version Wishlist
Version 0 - Find if treasure can be reached  
Version 1 - Find all possible paths  
Version 2 - Find the shortest path  
