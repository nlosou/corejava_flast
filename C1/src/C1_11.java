import java.util.Scanner;

public class C1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine(); // 读取一行文本

        // 遍历字符串中的每个字符
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // 检查字符是否为非ASCII字符
            if ((int) ch > 127) {
                // 打印字符及其Unicode值
                System.out.println("Character: " + ch + ", Unicode: " + (int) ch);
            }
        }
        scanner.close();
    }
}
