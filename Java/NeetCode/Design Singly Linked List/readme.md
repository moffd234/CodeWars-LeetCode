Design Singly Linked List
Easy

Design a Singly Linked List class.

Your LinkedList class should support the following operations:

<ul>
    <li>LinkedList() will initialize an empty linked list.</li>
    <li>int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.</li>
    <li>void insertHead(int val) will insert a node with val at the head of the list.</li>
    <li>void insertTail(int val) will insert a node with val at the tail of the list.</li>
    <li>bool remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.</li>
    <li>int[] getValues() return an array of all the values in the linked list, ordered from head to tail.</li>
</ul>

Example 1:

```
Input:
["insertHead", 1, "insertTail", 2, "insertHead", 0, "remove", 1, "getValues"]

Output:
[null, null, null, true, [0, 2]]
```

Example 2:

```
Input:
["insertHead", 1, "insertHead", 2, "get", 5]

Output:
[null, null, -1]
```


Note:
    The index ```int i``` provided to ```get(int i)``` and ```remove(int i)``` is guaranteed to be greater than or equal to ```0```.

