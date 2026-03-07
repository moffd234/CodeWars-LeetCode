package org.example;

import java.util.ArrayList;

class LinkedList {

    public LinkedList() {

    }

    public int get(int index) {
        return 0;
    }

    public void insertHead(int val) {

    }

    public void insertTail(int val) {

    }

    public boolean remove(int index) {
        return false;
    }

    public ArrayList<Integer> getValues() {
        return new ArrayList<>();
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val, Node next) {
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
