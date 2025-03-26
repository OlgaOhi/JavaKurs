package home_work.hw_42;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare(s1.score, s2.score);
    }
}

