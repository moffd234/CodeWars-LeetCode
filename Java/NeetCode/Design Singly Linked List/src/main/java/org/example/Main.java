package org.example;

import java.util.ArrayList;

class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        return 0;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val, head);

        if (head == null) {
            tail = newHead;
        }

        head = newHead;
    }

    public void insertTail(int val) {
        Node newTail = new Node(val, null);

        if (tail != null) {
            tail.setNext(newTail);
        } else {
            head = newTail;
        }

        tail = newTail;
    }

    public boolean remove(int index) {
        return false;
    }

    public ArrayList<Integer> getValues() {
        return new ArrayList<>();
    }

    private static class Node {
        private Integer val;
        private Node next;

        public Node(Integer val, Node next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
