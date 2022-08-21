// Singly Linked List
package linkedlist;

import searching.LinerSearch;

public class LinkedListOperation {

    private Node start;      // Start refernce var is Denoted by First Node ::

    public LinkedListOperation() {   // CONSTRUCTOR
        start = null;
    }

    public void insertAtfirst(int data) {
        Node temp, t;

        temp = new Node();
        temp.item = data;

        if (start == null) {
            start = temp;
            temp.next = null;
            System.out.println("Insert Successful");
        } else {
            t = start;
            start = temp;
            temp.next = t;
            System.out.println("Insert Successful");
        }
    }

    public void insertAtEnd(int data) {
        Node temp;

        temp = new Node();
        temp.item = data;
        temp.next = null;

        if (start == null) {
            start = temp;
            System.out.println("Insert Successful");
        } else {
            Node t = start;

            while (null != t.next) {  //t.next is variable
                t = t.next;
            }
            t.next = temp;
            System.out.println("Insert Successful");
        }
    }

    public void deletedAtFirst() {
        if (start == null) {
            System.out.println("Deleted Not Possible");
        } else {
            Node t;
            t = start.next;
            start = t;
            System.out.println("Deleted Successful");

        }
    }

    public void deletedAtLast() {
        if (start == null) {
            System.out.println("Delete not Possible");
        } else {
            Node t, r = null;
            t = start;
            while (null != t.next) {
                r = t;
                t = t.next;
            }
            r.next = null;
            System.out.println("Deleted Successful");
        }
    }

    public int countNode() {
        Node temp = start;
        int x = 0;

        if (start == null) {
            return 0;
        } else {
            while (null != temp.next) {
                x++;
                temp = temp.next;
            }
            x++;
            return x;
        }

    }

    public void bubbleSort() {
        int x = countNode();

        System.out.println("Sorting completed");
    }

    public int sumOfNode() {
        Node t = start;
        int sum = 0;

        if (start == null) {
            System.out.println("data empty");
            return 0;
        } else {
            while (null != t.next) {
                sum = sum + t.item;
                t = t.next;
            }
            sum = sum + t.item;
            viewRecursion(start);
            return sum;
        }

    }

    public void displayList() {
        Node t;
        t = start;

        if (start == null) {
            System.out.println("Data Empty");
        } else {
            while (null != t.next) {
                System.out.print(t.item + " ");
                t = t.next;
            }
            System.out.print(t.item + " ");
        }
    }

    public boolean deleteParticularData(int data) {
        if (start == null) {
            System.out.println("Not Deleted possible Data");
            return false;
        } else {
            LinerSearch LS = new LinerSearch();  // object LS

            if (LS.listNodeSearch(start, data)) {   // Data Search Function
                System.out.println("Data Verify SuccessFul");

                Node prev = null, trav = start, temp;

                if (start.item == data) {
                    Node t = start.next;
                    start = t;
                    return true;
                }

                while (trav.next != null) {

                    if (trav.item == data) {
                        temp = trav.next;
                        prev.next = temp;
                        System.out.println("ok delete 1");
                        return true;
                    }
                    prev = trav;
                    trav = trav.next;
                }

                if (trav.item == data) {
                    temp = trav.next;
                    prev.next = temp;
                    System.out.println("ok delete 2");
                    return true;
                }
            } else {
                System.out.println("Data is Not Verify ");
                System.out.println("Data Delete Not Possible");
                return false;
            }
        }
        System.out.println("Not delete");
        return false;
    }

    public void shiftingLastNode() {   //CLOCKWISE
        if (start == null) {
            System.out.println("Shifting is Not Possible");
        } else {
            Node t = start, par = null;

            while (t.next != null) {
                par = t;
                t = t.next;
            }
            par.next = null;

            t.next = start; // last node connect first node
            start = t;

            System.out.println("Shifting SuccessFul");
        }
    }

    public void viewRecursion(Node t) {
        if (t != null) {
            System.out.print(t.item + " ");
            viewRecursion(t.next);
        }

    }

    public void reserveList() {   // Reserve Linked List
        Node t1 = null, t2 = null;

        while (start != null) {

            t2 = start.next;   // t2 second node point
            start.next = t1;
            t1 = start;

            start = t2;// next node point
        }
        System.out.println("Reverse SuccessFul!");
        start = t1;  // last node denoted by start
    }

    public void findDuplicate() {
        Node t = start;
        if (start == null) {
            System.out.println("UnderFlow");
        } else {
            Node rev = start.next;
            while (t.next != null) {

                while (rev != null) {
                    if (t.item == rev.item) {
                        System.out.println("Duplicate value Available");
                        return;
                    }
                    rev = rev.next;
                }
                t = t.next;
                rev = t.next;
            }
            System.out.println("Duplicate Value Not Available");
        }
    }
}
