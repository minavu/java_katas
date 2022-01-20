package edu.pdx.cs410J.VNteam;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {

    if (args.length > 1 ) {
      System.err.println("Only 1 argument needed");
      System.exit(1);

    } else if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }

    int year = Integer.parseInt(args[0]);
    boolean isLeap = false;
    if (year % 400 == 0)
      isLeap = true;
    else if (year % 4 == 0 && year % 100 != 0)
      isLeap = true;

    if (isLeap)
      System.out.println("Bingo");
    else
      System.out.println("Opps");

  }
}