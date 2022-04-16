package Abraham;

import java.io.*;
import java.util.*;

public class UserMainCode {

    public int numberOfSoldiers(int input1) {
        int Num = input1 + 1;
        if (Num == 1)
            return 1;

        Node last = newNode(1);
        last.next = last;

        for (int i = 2; i <= Num; i++) {
            Node temp = newNode(i);
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }

        Node curr = last.next;

        Node temp = new Node();
        while (curr.next != curr) {
            temp = curr;
            curr = curr.next;
            temp.next = curr.next;

            temp = temp.next;
            curr = temp;
        }

        int res = temp.data;

        return temp.data;
    }
    class Node {
        int data;
        Node next;
    }

    Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }
    public static void main(String args[]) {
        int N = 4;
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.numberOfSoldiers(N));
    }
}
