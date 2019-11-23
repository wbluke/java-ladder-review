package laddergame.domain.name;

import laddergame.exception.ExcessOfPlayerNameException;

import java.util.Objects;

public class LadderPlayerName {

    public static final int MAX_LEN_OF_PLAYER_NAME = 5;

    private final Name name;

    public LadderPlayerName(final String name) {
        if (isNameExceedMaxLength(name)) {
            throw new ExcessOfPlayerNameException();
        }

        this.name = new Name(name);
    }

    private boolean isNameExceedMaxLength(final String name) {
        return name.length() > MAX_LEN_OF_PLAYER_NAME;
    }

    public boolean matchName(final String name) {
        return this.name.match(name);
    }

    public String getName() {
        return name.getInnerName();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final LadderPlayerName that = (LadderPlayerName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}