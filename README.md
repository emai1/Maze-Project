# MazeSolver by Pineapple Pizza
## Personnel
Brian Lee, Erik Mai

## Statement of the problem
Returns the boolean value of the statement "There exists one path through a maze starting at a designated beginning, and ending at a treasure.

Definition: Maze - A grid with barriers  
Looping is disallowed: Each position can be reached at most once.

## Recursive Abstraction
When I am asked to ( Statement of the problem ), the recursive abstraction can ( Statement of the problem ) after I have moved one position.

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
## Version Wishlist

Version 0 - Find if treasure can be reached  
Version 1 - Find all possible paths  
Version 2 - Find the shortest path  
