/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class C4_8 {

    enum Color {
        BLACK {
            @Override
            void printColor() {
                System.out.println("BLACK");
            }
        },
        RED {
            @Override
            void printColor() {
                System.out.println("RED");
            }
        },
        BLUE {
            @Override
            void printColor() {
                System.out.println("BLUE");
            }
        },
        GREEN {
            @Override
            void printColor() {
                System.out.println("GREEN");
            }
        },
        CYAN {
            @Override
            void printColor() {
                System.out.println("CYAN");
            }
        },
        MAGENTA {
            @Override
            void printColor() {
                System.out.println("MAGENTA");
            }
        },
        YELLOW {
            @Override
            void printColor() {
                System.out.println("YELLOW");
            }
        },
        WHITE {
            @Override
            void printColor() {
                System.out.println("WHITE");
            }
        };

        // 抽象方法，每个枚举常量必须实现
        abstract void printColor();
    }

    public static void main(String[] args) {
        // 测试每个枚举常量的 printColor 方法
        for (Color color : Color.values()) {
            System.out.println(color);
            //color.printColor();
        }
    }
}

