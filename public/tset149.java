class Node 
{
int info;
Node link;
Node(int value)
{
info=value;
link=null;
}
}
public class tset149
{
Node tail;
void addtail(int value)
{
Node nw=new Node(value);
if(tail==null)
{
tail=nw;
tail.link=tail;
}
else
{
nw.link=tail.link;
tail.link=nw;
tail=nw;
}
}
void traverse()
{
Node temp=tail.link;
while(temp!=tail)
{
System.out.print(temp.info+" ");
temp=temp.link;
}
System.out.println(temp.info);
}
public static void main(String args[])
{
tset149 ts=new tset149();
ts.addtail(10);
ts.addtail(20);
ts.addtail(30);
ts.addtail(40);
ts.traverse();
}
}