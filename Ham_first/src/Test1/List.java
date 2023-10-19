package Test1;

class Node
{
    int data;
    Node next;
}
public class List {

    private Node head;
    private Node before;
    private Node cur;
    private int count;

    public int data;

    public void Lset()
    {
        head = new Node();
        count = 0;
    }

    public void LInsert(int data)
    {
        Node new_node = new Node();
        new_node.data = data;

        new_node.next = head.next;
        head.next = new_node;
        count++;
    }

    public boolean LFirst()
    {
        if(head.next == null)
        {
            return false;
        }

        before = head;
        cur = head.next;
        data = cur.data;
        return true;
    }

    public boolean LNext()
    {
        if(cur.next == null)
        {
            return false;
        }

        before = cur;
        cur = cur.next;
        data = cur.data;
        return true;
    }

    public void LRemove()
    {
        before.next = cur.next;
        cur = before;
        count--;
    }

    public int LCount()
    {
        return count;
    }
}
