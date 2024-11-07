/* Now, whenever you call getName() of bird, it returns "The Mighty " + Name
Before, it used to just return Name
When an inherited method calls an overridden method, the overridden method will work inside the inherited method when the inherited method is called. 
*/
public class Driver
{
  public static void main (String[] args){
    Animal a = new Animal("heheheha",66,"Alpha");
    a.speak();
    Bird b = new Bird("squawk",1,"Jim",12,"black");
    b.speak();
  }
}
