/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SplittableRandom;

public class C3_8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        // 自定义比较器：先按长度排序，长度相同则按字典顺序排序
        Comparator<String> cmp = (s1, s2) -> {
            int len1 = s1.length();
            int len2 = s2.length();
            if (len1 != len2) {
                return len1 - len2;
            }
            return s1.compareTo(s2);
        };

        // 创建 lucky_sort 对象并排序
        lucky_sort sorter = new lucky_sort(list, cmp);
        sorter.lucksort();

        // 打印排序后的列表
        System.out.println(list);
    }
}

class lucky_sort {
    private ArrayList<String> str;
    private Comparator<String> cmp;
    private SplittableRandom random;

    public lucky_sort(ArrayList<String> str, Comparator<String> cmp) {
        this.cmp = cmp;
        this.str = str;
        this.random = new SplittableRandom();
    }

    public void lucksort() {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < str.size() - 1; i++) {
                if (cmp.compare(str.get(i), str.get(i + 1)) > 0) {
                    // 交换元素
                    String temp = str.get(i);
                    str.set(i, str.get(i + 1));
                    str.set(i + 1, temp);
                    sorted = false;
                }
            }
            // 随机交换两个元素，增加随机性
            if (!sorted) {
                int i = random.nextInt(str.size());
                int j = random.nextInt(str.size());
                String temp = str.get(i);
                str.set(i, str.get(j));
                str.set(j, temp);
            }
        } while (!sorted);
    }
}