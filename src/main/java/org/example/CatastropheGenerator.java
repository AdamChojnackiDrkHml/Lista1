package org.example;

import java.util.Random;

public class CatastropheGenerator
{
    private final String[] whatTheThingIsLike = {"Wielki ", "Potężny ", "Przerażający ", "Tragiczny ", "Straszny ", "Niepowstrzymany "};
    private final String[] whatItIs = {"meteor ", "Kowal ", "Marcel ", "chomik ", "kosmita ", "dyktator ", "ptaszor "};
    private final String[] whatIsItGoingToDo = {"spadnie na ", "spustoszy ", "rozgromi ", "wysadzi ", "zaleje ", "zdewastuje ", "zwyzywa ", "zrujnuje ", "przetrzebi "};
    private final String[] whereIsItGoingToDoThis = {"Kraśnik", "Ziemię", "Polskę", "USA", "lokalny ZUS", "Świdnicę", "Szopę Pana Wojtka", "Polską Gospodarkę", "Moje marzenia o stypendium", "Okręg trzech stanów"};
    private final String[][] generatorArrays = {whatTheThingIsLike, whatItIs, whatIsItGoingToDo, whereIsItGoingToDoThis};
    Random randomizer = new Random();

    public String generateTheCatastrophe()
    {
        String output = "";
        StringBuilder builder = new StringBuilder(output);
        for(int i = 0; i < generatorArrays.length; i++)
        {
            builder.append(generatorArrays[i][randomizer.nextInt(generatorArrays[i].length)]);
        }
        return builder.toString();
    }
}
