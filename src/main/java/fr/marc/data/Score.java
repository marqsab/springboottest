package fr.marc.data;

import org.springframework.data.annotation.Id;

/**
 * Created by marc on 12/04/2016.
 */
public class Score {

    @Id
    private String id;

    private String name;
    private int score;

    public Score(){}

    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', score='%i']",
                id, name, score);
    }
}
