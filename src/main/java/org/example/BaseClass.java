package org.example;

import java.util.Scanner;

public class BaseClass
{//NOPMD
    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);//NOPMD
        final VeryStrangeMathDoingMachine findOutOurChances = new VeryStrangeMathDoingMachine();//NOPMD
        System.out.print("Czy chcesz wygenerować katastrofę?\n");//NOPMD
        while ("TAK".equalsIgnoreCase(scanner.next()))
        {
            System.out.print("\n");//NOPMD

            findOutOurChances.doWeirdThings();

            System.out.print("\nCzy chcesz wygenerować kolejną katastrofę? \nWpisz Tak jeśli chcesz albo cokolwiek innego jeśli nie\n");//NOPMD
        }
        scanner.close();
    }
}
