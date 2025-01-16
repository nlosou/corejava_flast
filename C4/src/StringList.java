/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public sealed interface StringList permits EmptyStringList, NonEmptyStringList {
    int size();
    StringList append(String element);
}
