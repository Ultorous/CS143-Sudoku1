import java.util.*;
import java.io.*;

public class Sudoku{
   char[][] board = new char[9][9];
   String placeHolder = "";
   
   
   public Sudoku(String fileName) {
       try {
           Scanner file = new Scanner(new File(fileName));
           int row = 0;
           
           while (file.hasNextLine()) {
               String line = file.nextLine();
  
               for(int c = 0; c < board[row].length; c++){
                   char number = line.charAt(c);
                   board[row][c] = number;
               }
               row++;
           }
        } catch(FileNotFoundException e) {
         System.out.println(fileName + " not found.");
   }
   }
   
   
   public String toString(){
       return placeHolder;
   }
}