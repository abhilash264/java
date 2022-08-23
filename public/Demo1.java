class Node
{
  int data;
  Node next;
 }
public class Demo1
   { 
    public static void main(String args[])
     { 
    Node start=new Node();
    Node temp;
    temp=start;
    temp.data=12;
    for(int i=1;i<3;i++)
     {
   temp.next=new Node();
   temp=temp.next;
   temp.data=18;
  }
 temp=start;
 System.out.println("Retrive the data from singleLinkedlist.");
while(temp!=null)
    {
   System.out.println(temp.data);
   temp=temp.next;
  }
}
}
     