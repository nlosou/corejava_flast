import java.util.ArrayList;
import java.util.List;

public class C1_20 {
    public static void main(String[] args) {
        int n = 5; // 假设我们生成5阶的帕斯卡三角形
        List<List<Integer>> triangle = generatePascalTriangle(n);

        // 打印帕斯卡三角形
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // 第一行始终是[1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            // 每行的第一个元素始终是1
            row.add(1);

            // 计算中间的元素
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // 每行的最后一个元素始终是1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}