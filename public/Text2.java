public class Text2
{
 static int a;
 static void call()
{
   a++;
   Text2.a++;
   new Text().a++;
   }
void fun()
 {
  a++;
  Text2.a++;
  new Text().a++;
 }
class A
{
static void call1()
{
Text2.a++;
new Text2().a++;
}
void fun2()
{
Text2.a++;
new Text2().a++;
}
}
}    