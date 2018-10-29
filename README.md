# ChestAnatomySolution

## To Run
1. Open your Terminal 
2. CD to folder containing App.java
3. Type "javac App.java" then enter ( this should create a couple of class files in the same directory )
4. Type "java App" then enter ( this should bring up a small window with the solution )

## General Summary 
    I started out with checkboxes and was going to make my own simple node tree and interface to show everything … not wanting to reinvent the wheel I searched the web for some ideas. 
    
    https://stackoverflow.com/questions/21847411/java-swing-need-a-good-quality-developed-jtree-with-checkboxes
    
    This solution combines JCheckBoxes with JTrees. The main changes to the JTree are: 
    * The cell render because the GUI now needs to show Checkboxes
    * The selection mechanics because we are using a more suitable CheckNode
    * The mouse clicked listener because of the specific rules our solution must follow


## To Do
### Unit Tests
    Putting in a couple of unit tests to make sure that multiple selections and deselections on the same item(s) would not break anything. 

### Data File
    Having the original data for the hierarchy come from a .txt or .csv file so that this solution could be edited without recompiling and reused with other anatomy hierarchies.

