import java.util.Random;
import java.util.Scanner;

/**
 * The type C 2 2.
 */
public class C2_2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 使用Scanner读取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = scanner.nextInt();
        System.out.println("你输入的整数是：" + input);

        // 使用Random生成随机数
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("生成的随机整数是：" + randomInt);

        // 再次生成一个随机整数
        int anotherRandomInt = random.nextInt();
        System.out.println("再次生成的随机整数是：" + anotherRandomInt);

        // 验证Scanner对象的状态
        System.out.println("Scanner对象是否还有下一个整数？ " + scanner.hasNextInt());

        // 关闭Scanner
        scanner.close();
    }
}


