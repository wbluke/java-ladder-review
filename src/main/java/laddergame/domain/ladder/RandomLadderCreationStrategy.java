package laddergame.domain.ladder;

import java.util.Random;

public class RandomLadderCreationStrategy implements LadderCreationStrategy {

    @Override
    public boolean createCrossBar() {
        return new Random().nextBoolean();
    }
}
