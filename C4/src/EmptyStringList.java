/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public final class EmptyStringList implements StringList {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public StringList append(String element) {
        return new NonEmptyStringList(element, this);
    }

    @Override
    public String toString() {
        return "[]";
    }
}
