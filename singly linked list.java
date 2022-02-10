import java.util.*;
public class SinglyLinkedList
{
    class Node {
        int rollno;
        Node next;
    }
    Node START;
    SinglyLinkedList()
    {
        START=null;
    }
    void insert()
    {
        System.out.println("Enter your rollnumber");
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();

        Node nn= new Node();
        nn.rollno= data;
        nn.next=null;

        if(START==null)
        {
            START = nn;
        }
        else
        {
            Node current= START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
        System.out.println("Data Inserted");
        sc.close();
    }
    void delete()
    {
        if(START==null)
        {
            System.out.println("List Empty");

        }
        else{
            System.out.println("deleted"+START.rollno);
            if(START.next==null)
            {
                START=null;
            }
            else{
                START=START.next;
            }
        }
    }
    void traverse()
    {
        if(START== null)
        {
            System.out.println("List Empty");
        }
        else {
            Node current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.println("" + current.rollno);
            }
        }
    }
    public static void main(String args[])
    {
        SinglyLinkedList obj= new SinglyLinkedList();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 1 for delete");
            System.out.println("Press 1 for traverse");
            System.out.println("Press 1 for exit");
            System.out.println("Enter your choice");
            Scanner sc= new Scanner(System.in);
            int choice= sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;

                case 3:
                    obj.traverse();
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    sc.close();
            }

        }
    }
}
