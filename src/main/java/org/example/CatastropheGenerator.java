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
    int asdg = 52;

    public String generateTheCatastrophe()
    {
        String output = "";
        StringBuilder builder = new StringBuilder(output);
        for (String[] generatorArray : generatorArrays)
        {
            builder.append(generatorArray[randomizer.nextInt(generatorArray.length)]);
        }
        return builder.toString();
    }
}
