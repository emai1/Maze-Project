# MazeSolver by Pineapple Pizza
## Personnel
Brian Lee, Erik Mai

## Statement of problem
Return the boolean value of the statement "There exists one path through a maze starting at a designated beginning, and ending at a treasure."

Definition: Maze - A grid with barriers  
Looping is disallowed: Each position can be reached at most once.

## Recursive Abstraction
When I am asked to ( Statement of the problem ), the recursive abstraction can ( Statement of the problem ) after I have moved one position.

## Base cases
```Java
If the explorer is in a wall, return false
If the explorer is at the treasure, return true.
```

## English or Pseudocode Description of Algorithm
```Java
if in wall
  return False
if in treasure
  return True  
else  
  save a snapshot
  for each direction
    go forward one position
    if recursive abstraction
      return True
    else
      restore to snapshot
  return False
```
## Class(es), with fields and methods

Solver
   - Fields
   - Methods
     - findSolution() : Checks for a possible solution to the maze

## Known Bugs

## Version *n* Wishlist
Version 0 - Find if treasure can be reached  
Version 1 - Find all possible paths  
Version 2 - Find the shortest path  
