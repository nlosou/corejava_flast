public class C1_16 {
    public static  void main(String[] args)
    {
        String sourceCode = """
                public class Quine {
                    public static void main(String[] args) {
                        String sourceCode = %s;
                        System.out.println(sourceCode.formatted(sourceCode));
                    }
                }
                """;

        System.out.printf((sourceCode) + "%n", sourceCode);
    }
}
