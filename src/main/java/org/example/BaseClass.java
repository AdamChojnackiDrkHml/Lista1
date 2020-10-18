package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class BaseClass
{
    public static void main(final String[] args )
    {
        final Scanner scanner = new Scanner(System.in);
        final VeryStrangeMathDoingMachine findOutOurChances = new VeryStrangeMathDoingMachine();
        System.out.print("Czy chcesz wygenerować katastrofę?\n");
        while ("TAK".equalsIgnoreCase(scanner.next()))
        {
            System.out.print("\n");

            findOutOurChances.doWeirdThings();

            System.out.print("\nCzy chcesz wygenerować kolejną katastrofę? \nWpisz Tak jeśli chcesz albo cokolwiek innego jeśli nie\n");
        }
        scanner.close();
    }
}
