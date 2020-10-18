package org.example;

public class VeryStrangeMathDoingMachine
{
    CatastropheGenerator generator = new CatastropheGenerator();
    char[] weirdArray;
    int sum;
    public void doWeirdThings()
    {

        String catastrophe = generator.generateTheCatastrophe();
        System.out.println(catastrophe);

        weirdArray = catastrophe.toCharArray();
        sum = 0;

        for (char c : weirdArray)
        {
            sum += c;
        }

        if(doWeirdMath(sum))
        {
            System.out.print("Nie ma szans na ratunek, to jest już koniec, nie ma już nic, wszyscy przegraliśmy, możemy iść\n");
        }
        else
        {
            System.out.print("Magiczne pancerniki przybyły z piątej gęstości i ponownie uratowały Ziemię, cieszcie się śmiertelnicy\n");
        }

    }
    private boolean doWeirdMath(int number)
    {
        return ((Math.abs(Math.sin(number)) > generator.randomizer.nextDouble()));
    }
}
