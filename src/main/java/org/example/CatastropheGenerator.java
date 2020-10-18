package org.example;

import java.util.Random;

public class CatastropheGenerator
{
    private final static String[] whatTheThingIsLike = {"Wielki ", "Potężny ", "Przerażający ", "Tragiczny ", "Straszny ", "Niepowstrzymany "};
    private final static String[] whatItIs = {"meteor ", "Kowal ", "Marcel ", "chomik ", "kosmita ", "dyktator ", "ptaszor "};
    private final static String[] whatIsItGoingToDo = {"spadnie na ", "spustoszy ", "rozgromi ", "wysadzi ", "zaleje ", "zdewastuje ", "zwyzywa ", "zrujnuje ", "przetrzebi "};
    private final static String[] whereIsItGoingToDoThis = {"Kraśnik", "Ziemię", "Polskę", "USA", "lokalny ZUS", "Świdnicę", "Szopę Pana Wojtka", "Polską Gospodarkę", "Moje marzenia o stypendium", "Okręg trzech stanów"};
    private final static String[][] generatorArrays = {whatTheThingIsLike, whatItIs, whatIsItGoingToDo, whereIsItGoingToDoThis};
    public Random randomizer = new Random();

    public String generateTheCatastrophe()
    {
        final StringBuilder builder = new StringBuilder();
        for (String[] generatorArray : generatorArrays)
        {
            builder.append(generatorArray[randomizer.nextInt(generatorArray.length)]);
        }
        return builder.toString();
    }
}
