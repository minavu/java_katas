package edu.pdx.cs410J.VNTeam;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();

    char input = 'F';

    int index = 0;
    for (char character: alphabet) {
      index++;
      if (character == input) break;
    }
    int num = 0;
    int underIndex = index;

    while(alphabet[num] <= input) {
      for(int i=0; i < index;i++) {
        System.out.print(" ");
        if (i == index - 1) {
          if (alphabet[num] == 'A')
            System.out.println(alphabet[num]);
          else {
            System.out.print(alphabet[num]);
            for (int j=0; j< (2*num-1);j++) {
              System.out.print(" ");
            }
            System.out.println(alphabet[num]);
          }
        }
      }
      num++;
      index--;
    }
    num = underIndex-2;
    while(alphabet[num] >= 'A') {
      for (int i=0; i < underIndex - num; i++) {
        System.out.print(" ");
      }
      if (alphabet[num] != 'A') {
        System.out.print(alphabet[num]);
        for (int j=0; j < 2*num-1; j++ ){
          System.out.print(" ");
        }
        System.out.println(alphabet[num]);
      } else {
        System.out.println(alphabet[num]);
      }
      num--;
      if (num < 0)
        break;
    }

    System.out.println("index: " + index);

    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}