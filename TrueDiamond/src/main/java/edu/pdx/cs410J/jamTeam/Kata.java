package edu.pdx.cs410J.jamTeam;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public void printDiamond(char targetLetter) {
    // https://stackoverflow.com/questions/10023818/shift-character-in-alphabet

     char currentLetter = 'A';
     int letterNumber = targetLetter - (int)'A';
//     System.out.println(String.valueOf(letterNumber));
     for (int i = letterNumber; i >= 0; --i) {
         for (int j = 0; j < i; ++j) {
             System.out.print(" ");
         }
         if (currentLetter == 'A') {
             System.out.println(currentLetter);
         } else {
             System.out.print(currentLetter);
         }

         if (currentLetter != 'A') {
             int distance = 2 * (int) ((int)currentLetter - (int)'A') - 1;

             for (int k = 0; k < distance; ++k) {
                 System.out.print(" ");
             }
             System.out.println(currentLetter);
         }
         ++currentLetter;
     }
     --currentLetter;

  }
                                                                                    

  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");
    Kata kata = new Kata();
    kata.printDiamond('D');
    System.exit(1);
  }
    // toEncode[i] = (toEncode[i] + 13 - (int)'a') % 26 + (int)'a';
}