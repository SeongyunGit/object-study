package ch12.step01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private int pass;
    private String title;
    private List<Integer> scores = new ArrayList<>();

    public Lecture(String title, int pass, List<Integer> scores) {
        this.title = title;
        this.pass = pass;
        this.scores = scores;
    }

    public double average() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
    }

    public List<Integer> getScores() {
        return Collections.unmodifiableList(scores);
    }

    public String evaluate() {
        return String.format("Parr:%d Fail:%d",passCount(), failCount());
    }

    public long passCount() {
        return scores.stream().filter(score -> score >=pass).count();
    }

    public long failCount() {
        return scores.size() - passCount();
    }

    public String stats() {
        return String.format("Title: %s, Evaluation Method: %s", title, getEvaluationsMethod());
    }

    public String getEvaluationsMethod() {
        return "Pass or Fail";
    }
}
