interface Syrupable
{
void getSugary();
}
abstract class Pancake implements Syrupable {
}
class XYZ implements Pancake
{
public void getSugary()
{
;}
}
class YZX extends XYZ
{
void getSugary(int s)
{
;}
}