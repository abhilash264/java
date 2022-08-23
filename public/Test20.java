interface Animal
{
void eat();
void drink();
}
class Lion implements Animal
{
@Override 
public void eat()
{
System.out.println("I am  king I eat meat");
}
@Override
public void drink()
{
System.out.println("I am  king I drink water");
}
}
class Rabbit implements Animal
{
@Override 
public void eat()
{
System.out.println("I am simple I eat veg");
}
public void drink()
{
System.out.println("I am simple I drink water");
}
}
class Test
{
public static void displayAnimal(Animal aa)
{
aa.eat();
aa.drink();
}
}
public class Test20
{
public static void main(String args[])
{
String name=args[0];
if(name.equalsIgnoreCase("Lion"))
{
Test.displayAnimal(new Lion());
}
else
{
Test.displayAnimal(new Rabbit());
}
}
}
