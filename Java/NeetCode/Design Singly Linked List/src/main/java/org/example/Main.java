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
        if(index >= size){
            return -1;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.getNext();
        }


        return current.getVal();
    }

    public void insertHead(int val) {
        Node newHead = new Node(val, head);

        if (head == null) {
            tail = newHead;
        }

        head = newHead;
        size++;
    }

    public void insertTail(int val) {
        Node newTail = new Node(val, null);

        if (tail != null) {
            tail.setNext(newTail);
        } else {
            head = newTail;
        }

        tail = newTail;
        size++;
    }

    public boolean remove(int index) {

        if(index >= size){
            return false;
        }

        if(index == 0){
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return true;
        }

        Node prevNode = head;

        for(int i = 0; i < index - 1; i++){
            prevNode = prevNode.next;
        }

        Node nodeToRemove = prevNode.next;
        prevNode.next = nodeToRemove.next;
        size--;

        if(nodeToRemove == tail){
            tail = prevNode;
        }

        return true;
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
