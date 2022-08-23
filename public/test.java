
class test{
       int data;
       void call()
          {
            data++; 
          }
          static void fun()
         {
         A aa=new A();
         aa.data+=5;
       System.out.println("data value is : "+aa.data);
      }
   }
public class Text1
  {
   void show()
   {
     A ss=new A();
     ss.data+=3;
     System.out.println("data value in show() method is :"+ss.data);
   }
public static void main(String args[])
 {
   A kk=new A();
   kk.call();
   System.out.println("within main() data value is:"+kk.data);
  A.fun();
   new Text1().show();
 }
}