import java.util.Scanner;

/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */
public class C2_17{

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner in=new Scanner(System.in);
        String input= in.nextLine();
        while(!(input.equals("stop")))
        {
            queue.add(input);
            input=in.nextLine();
        }

        System.out.println("Queue after adding elements:");
        queue.printQueue();

        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after removing element:");
        queue.printQueue();
    }
}
class Queue {
            // 定义一个嵌套的 Node 类来表示链表的节点

    private static class Node {
                String data; // 存储节点的数据
                Node next;   // 指向下一个节点的引用

                Node(String data) {
                    this.data = data;
                    this.next = null;
                }
    }



            // 队列的头节点和尾节点
            private Node head;
            private Node tail;

            // 在队列尾部添加元素
            public void add(String item) {
                Node newNode = new Node(item); // 创建新节点
                if (tail == null) {
                    // 如果队列为空，新节点既是头节点也是尾节点
                    head = newNode;
                    tail = newNode;
                } else {
                    // 将新节点添加到当前尾节点的后面
                    tail.next = newNode;
                    // 更新尾节点为新节点
                    tail = newNode;
                }
            }

            // 在队列头部删除元素
            public String remove() {
                if (head == null) {
                    // 如果队列为空，返回 null
                    return null;
                }
                String removedData = head.data; // 获取头节点的数据
                head = head.next; // 将头节点指向下一个节点
                if (head == null) {
                    // 如果队列变为空，将尾节点也置为 null
                    tail = null;
                }
                return removedData;
            }

            // 打印队列中的所有元素
            public void printQueue() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }
