package Penguin;

import java.awt.*;
import java.util.Scanner;

public class Level {

    private static char[][] lvl1 = {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

    private static String[] direction = {"North", "East", "South", "West"};
    private static int directionIndex;
    private static String forward; // String representation of the current direction

    public static void main(String[] args) {
        directionIndex = 1; // Start out by facing east.
        forward = direction[directionIndex];
        Point startingPoint = new Point(2, 7); // starting point of the maze
        traverseTheMaze(startingPoint);

    }

    private static void traverseTheMaze(Point p) {
        lvl1[p.y][p.x] = 'X'; // Capital 'X' marks the current spot

        for (int i = 0; i < 50; ++i) System.out.println(); // Clear Console

        if (isExit(p)) { // base case
            lvl1[p.y][p.x] = '$'; // '$' when the exit is located
            printMaze();

        } else {
            printMaze();

            Scanner position = new Scanner(System.in);
            System.out.println("Enter choice :");
            char choice = position.next().charAt(0);

            if (choice == 'd') {
                p.x++;
                traverseTheMaze(p);
                lvl1[p.y][p.x] = ' ';
            }
            if (choice == 'q') {
                p.x--;
                traverseTheMaze(p);
                lvl1[p.y][p.x] = ' ';

            }
            if (choice == 's') {
                p.y++;
                traverseTheMaze(p);
                lvl1[p.y][p.x] = ' ';
            }
            if (choice == 'z') {
                p.y--;
                traverseTheMaze(p);
                lvl1[p.y][p.x] = ' ';
            }
        }
    }

    private static boolean isExit(Point p) {
        // Combines direction and location on border of the maze to determine an exit
        if (forward.equals("North") && p.y == 0)
            return true;
        else if (forward.equals("East") && p.x == 19)
            return true;
        else if (forward.equals("South") && p.y == 10)
            return true;
        else if (forward.equals("West") && p.x == 0)
            return true;
        else
            return false;
    }

    private static void printMaze() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 19; x++) {
                System.out.print(" " + lvl1[y][x]);
            }
            System.out.println();
        }
    }
}

