/* Now, whenever you call getName() of bird, it returns "The Mighty " + Name
Before, it used to just return Name
When an inherited method calls an overridden method, the overridden method will work inside the inherited method when the inherited method is called.*/
/*b2 did not work because you cannot create an Animal that uses the Bird's methods.
If Bird has methods that Animal doesn't, that would create issues
Intuitively, not all animals are birds.*/
public class Driver
{
  public static void main (String[] args){
    Animal a = new Animal("heheheha",66,"Alpha");
    a.speak();
    Bird b = new Bird("squawk",1,"Jim",12,"black");
    b.speak();

    Animal a1 = new Animal("al", 1, "Alpha1");
    Bird b1 = new Bird("br", 1, "Bravo1", 30, "green");
    //Bird b2 = new Animal("K", 1, "G"); <- incompatible types: Animal cannot be converted to Bird
    Animal a2 = new Bird("apf", 1, "Alpha2", 30, "red");
  }
}
