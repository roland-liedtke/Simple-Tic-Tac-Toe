package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.print("> ");
        do {
            input = scanner.nextLine();
        } while (!input.contains("X") && !input.contains("O") && !input.contains("_") || input.length() > 9);

        String output = "---------\n";

        for (int i = 0; i < 9; i += 3) {
            output += String.format("| %c %c %c |\n", input.charAt(i), input.charAt(i + 1), input.charAt(i + 2));
        }
        output += "---------\n";

        System.out.print(output);

        // Rows
        int firstRow = input.charAt(0) + input.charAt(1) + input.charAt(2);
        int secondRow = input.charAt(3) + input.charAt(4) + input.charAt(5);
        int thirdRow = input.charAt(6) + input.charAt(7) + input.charAt(8);
        // Columns
        int firstCol = input.charAt(0) + input.charAt(3) + input.charAt(6);
        int secondCol = input.charAt(1) + input.charAt(4) + input.charAt(7);
        int thirdCol = input.charAt(2) + input.charAt(5) + input.charAt(8);
        // X-axis
        int firstX = input.charAt(0) + input.charAt(4) + input.charAt(8);
        int secondX = input.charAt(2) + input.charAt(4) + input.charAt(6);

        int[] arr = {firstRow, secondRow, thirdRow, firstCol, secondCol, thirdCol, firstX, secondX};

        if (firstRow == 264 || secondRow == 264 || thirdRow == 264 || firstCol == 264 || secondCol == 264 || thirdCol == 264 || firstX == 264 || secondX == 264) {
            System.out.println("X wins");
        } else if (firstRow == 237 || secondRow == 237 || thirdRow == 237 || firstCol == 237 || secondCol == 237 || thirdCol == 237 || firstX == 237 || secondX == 237) {
            System.out.println("O wins");
        } else if (input.contains("_") || input.contains(" ")) {
            System.out.println("Game not finished");
        } else if (true) {
            System.out.println("Impossible");
        } else {
            System.out.println("Draw");
        }
    }
}
