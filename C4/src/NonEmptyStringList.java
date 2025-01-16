/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public final class NonEmptyStringList implements StringList {
    private final String head;
    private final StringList tail;

    public NonEmptyStringList(String head, StringList tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int size() {
        return 1 + tail.size();
    }

    @Override
    public StringList append(String element) {
        return new NonEmptyStringList(head, tail.append(element));
    }

    @Override
    public String toString() {
        return "[" + head + ", " + tail.toString().replaceAll("^\\[", "").replaceAll("]$", "") + "]";
    }
}
