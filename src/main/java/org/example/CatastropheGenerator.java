package org.example;

import java.util.Random;


public class CatastropheGenerator//NOPMD
{
    private final transient String[] whatTheThingIsLike = {"Wielki ", "Potężny ", "Przerażający ", "Tragiczny ", "Straszny ", "Niepowstrzymany "};//NOPMD
    private final transient String[] whatItIs = {"meteor ", "Kowal ", "Marcel ", "chomik ", "kosmita ", "dyktator ", "ptaszor "};
    private final transient String[] whatIsItGoingToDo = {"spadnie na ", "spustoszy ", "rozgromi ", "wysadzi ", "zaleje ", "zdewastuje ", "zwyzywa ", "zrujnuje ", "przetrzebi "};
    private final transient String[] whereIsItGoingToDoThis = {"Kraśnik", "Ziemię", "Polskę", "USA", "lokalny ZUS", "Świdnicę", "Szopę Pana Wojtka", "Polską Gospodarkę", "Moje marzenia o stypendium", "Okręg trzech stanów"};//NOPMD
    private final transient String[][] generatorArrays = {whatTheThingIsLike, whatItIs, whatIsItGoingToDo, whereIsItGoingToDoThis};
    public transient Random randomizer = new Random();

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
