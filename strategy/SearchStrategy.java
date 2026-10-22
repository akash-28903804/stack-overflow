package stackoverflow.strategy;

import stackoverflow.stack.classes.Question;

import java.util.List;

public interface SearchStrategy {
    List<Question> filter(List<Question> questions);
}