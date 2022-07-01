package fooddelivery;
import fooddelivery.Menuinfo;
public class List {
    private class Node
    {
        Menuinfo data;
        Node next;
        
        public Node()
        {
            data = null;
            next = null;
        }
        
        public Node(Menuinfo xx)
        {
            data = xx;
            next = null;
        }
    
    }
    
    private Node head;
    private Node current;
    
    //Constructor
    public List()
    {
        head = null;
        current = null;
    }
    public List(Menuinfo data)
    {
        head = new Node(data);
        current = null;
    }
    
    //insert data at the front
    public void insertFront(Menuinfo data)
    {
        Node x = new Node(data);
        x.next = head;
        head = x;
    }
    
    //get the first data in the linked list
    public Object getFirst()
    {
        Object data = head.data;
        return data;
    }
    
    //get the next data after the current node
    public Object getNext(Node p)
    {
        Node q = p.next;
        Object data = q.data;
        return data;
    }
    
    //display whole list
    public void printAll()
    {
        Node ptr;
        ptr = head;
        
        while(ptr!=null)
        {
            System.out.println(ptr.data.toString());
            ptr = ptr.next;
        }
    }

    //display complete information of one menu given a name
    public void displayInformation(String name)
    {
        Node ptr;
        ptr=head;
        
        while(ptr!=null)
        {
            if(ptr.data.getName().equals(name))
            {
                ptr.data.toString();
            }
            ptr = ptr.next;
        }
        
    }

    //to calculate total menu by category
    public void calculateTotalMenu(int category)
    {
        int category1= 0,category2= 0,category3= 0;
        
        Node ptr;
        ptr = head;
        
        while(ptr!= null)
        {
            if(ptr.data.getCategory().equals(1))
            {
                category1++;
            }
            else if(ptr.data.getCategory().equals(2))
            {
                category2++;
            }
            else
            {
                category3++;
            }
            ptr=ptr.next;
        }
        

    }
    
    //calculate total all menu
    public int totalmenu()
    {
        int count = 0;
        Node ptr;
        ptr = head;
        
        while(ptr!= null)
        {
            count++;
            ptr = ptr.next;
        }
        return count;
    }
    
    public void insertAfter(Menuinfo data , Node p)
    {
        Node x = new Node(data);
        x.next = p.next;
        p.next = x;
    }
    
    public Object deleteFront()
    {
        Object data = head.data;
        head = head.next;
        return data;
    }
    
    private Object deleteAfter(Node p)
    {
        Node q = p.next;
        Object x = q.data;
        p.next = q.next;
        return x;
    
}
}
