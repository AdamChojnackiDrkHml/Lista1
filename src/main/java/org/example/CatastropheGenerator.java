package org.example;

import java.util.Random;


public class CatastropheGenerator//NOPMD
{
    private final String[] whatTheThingIsLike = {"Wielki ", "Potężny ", "Przerażający ", "Tragiczny ", "Straszny ", "Niepowstrzymany "};//NOPMD
    private final String[] whatItIs = {"meteor ", "Kowal ", "Marcel ", "chomik ", "kosmita ", "dyktator ", "ptaszor "};
    private final String[] whatIsItGoingToDo = {"spadnie na ", "spustoszy ", "rozgromi ", "wysadzi ", "zaleje ", "zdewastuje ", "zwyzywa ", "zrujnuje ", "przetrzebi "};
    private final String[] whereIsItGoingToDoThis = {"Kraśnik", "Ziemię", "Polskę", "USA", "lokalny ZUS", "Świdnicę", "Szopę Pana Wojtka", "Polską Gospodarkę", "Moje marzenia o stypendium", "Okręg trzech stanów"};//NOPMD
    private final String[][] generatorArrays = {whatTheThingIsLike, whatItIs, whatIsItGoingToDo, whereIsItGoingToDoThis};
    public Random randomizer = new Random();

    public String generateTheCatastrophe()
    {
        final StringBuilder builder = new StringBuilder();
        for (final String[] generatorArray : generatorArrays)
        {
            builder.append(generatorArray[randomizer.nextInt(generatorArray.length)]);
        }
        return builder.toString();
    }

}
