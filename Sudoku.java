import java.util.*;
import java.io.*;

public class Sudoku{
   protected char[][] board;
   
   //Constructor
   public Sudoku(String fileName) {
       board = new char[9][9];
   
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
   
   //toString method
   public String toString(){
       StringBuilder sb = new StringBuilder("");
       for(int r = 0; r < board.length; r++){
           for(int c = 0; c<board[r].length; c++){
           sb.append(board[r][c]);
           }
       sb.append("\n");
   }
   return sb.toString();
}
}