package ru.shirmanov.whattowatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drond on 18.11.2017.
 */

public class SeriesList {

    List<String> getGenre(int spinner) {
        List<String> series = new ArrayList<>();
        switch (spinner) {
            case 0:
                series.add("Друзья");
                break;
            case 1:
                series.add("Игра престолов");
                break;
            case 2:
                series.add("Ходячие мертвецы");
                break;
            case 3:
                series.add("футурама");
                break;
            case 4:
                series.add("Во все тажкие");
                break;
        }
        return series;
    }
}

