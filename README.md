# dot-com-killer
<hr>

### Think Battleship™, only we are sinking tech startups like it is 2001.

    This is an exercise from Head First Java™ (HIGHLY recommend for any wannabe Java Jabronis [like myself]) chapters 5 and 6.
    
## The Jist
The computer is attempting to start a bunch of dot-com business's.  As a corporate take-over VP, it is your job to sink as many of their startups in the fewest number of tries (how else would we maintain our Monopoly status?). You will be rated based on your performance, and PIP'd (i.e. sacked) if you don't perform!

The computer will place 3 dot-coms on a 7x7 grid (no GUI, this is a command-line application).

      Note that the first iteration of the game (SimpleDotCom) is just a single row of 7 cells and one dot-com that takes up 3 cells. This iteration exists to show:
         1. Arrays suck and you should use ArrayList
         2. To start simple, get it working (pass tests) and scale up to meet requirements
         3. How/when to refactor

# Design process

### High-Level
1. User starts the game
   1. Game creates 3 objects (dot-coms)
   2. Game places 3 objects into 7x7 grid (randomly)
2. Game play begins, repeat:
   1. Prompt user for guess
   2. Check the user guess - look for hit/miss/kill
      1. if a hit, delete the cell
      2. if a kill, delete the dot-com object
3. Game finishes
   1. Give the user a rating based on number of guesses

### Developing a Class
- What is the Class supposed to do?
- List instance variables and methods
- Prepcode (pseudo)
- Test code **
- Implement the Class
- Test the methods
- Debug/reimplement

        
    ** Writing test code first comes from XP. At the time you write the code, there is nothing to run it against. 
    The act of thinking through and writing test code helps clarify your thoughts about what the method itself needs to do. 
    As soon as the implementation code is done, you already have test code ready to validate it.

    Besides, if you don't do it first, you'll never do it (proven scientific fact)!


