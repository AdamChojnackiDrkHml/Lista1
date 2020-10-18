package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        VeryStrangeMathDoingMachine isThereAnyHope = new VeryStrangeMathDoingMachine();
        System.out.print("Czy chcesz wygenerować katastrofę?\n");
        while ("TAK".toUpperCase().equals(scanner.next()))
        {
            System.out.print("\n");

            isThereAnyHope.doWeirdThings();

            System.out.print("\nCzy chcesz wygenerować kolejną katastrofę? \nWpisz Tak jeśli chcesz albo cokolwiek innego jeśli nie\n");
        }
    }
}
