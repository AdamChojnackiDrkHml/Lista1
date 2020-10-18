package org.example;


public class VeryStrangeMathDoingMachine//NOPMD
{
    private final transient CatastropheGenerator generator = new CatastropheGenerator();

    public void doWeirdThings()
    {

        final String catastrophe = generator.generateTheCatastrophe();
        System.out.println(catastrophe);//NOPMD

        final char[] weirdArray = catastrophe.toCharArray();//NOPMD
        int sum = 0;

        for (final char c : weirdArray)
        {
            sum += c;
        }

        if (doWeirdMath(sum))
        {
            System.out.print("Nie ma szans na ratunek, to jest już koniec, nie ma już nic, wszyscy przegraliśmy, możemy iść\n");//NOPMD
        }
        else
        {
            System.out.print("Magiczne pancerniki przybyły z piątej gęstości i ponownie uratowały Ziemię, cieszcie się śmiertelnicy\n");//NOPMD
        }
    }


    private boolean doWeirdMath(final int number)
    {
        return ((Math.abs(Math.sin(number)) > generator.randomizer.nextDouble()));//NOPMD
    }


}
