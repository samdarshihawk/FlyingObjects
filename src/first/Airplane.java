// -----------------------------------------------------
// 
// Written by: Samdarshi  & Meet Vora 
// -----------------------------------------------------

package first;
import six.FlyingObjects;
//class Airplane
public class Airplane extends FlyingObjects
{
	/**
	 * An Airplane object has three attributes, a brand (String), a price (double), and a horsepower (int).
	 */
	
	//attributes
	public String brand;
	public double price;
	public int hp;
	
	//default constructor
	public Airplane()
	{	
	}
	
	/**
	 * this method is ConStructor that will take 3 argument 
	  * @param brand the first parameter of the constructor, type String 
	  * @param price the second parameter of the constructor, type double
	  * @param hp the third parameter of the constructor, type int
	  */
	//parametrized constructor
	public Airplane(String brand,double price, int hp)
	{
		this.brand = brand;
		this.price = price;
		this.hp = hp;
	}
	
	//copy constructor
	/**
	 * this method is ConStructor that take only argument
	 * @param airplane object of type Airplane
	 */
	public Airplane(Airplane airplane)
	{
		this.brand = airplane.brand;
		this.price = airplane.price;
		this.hp = airplane.hp;
	}
	
	//setters
	/**
	 * Method mutate the brand attribute of Airplane type object
	 * @param brand to set the brand
	 */
	public void setbrand(String brand)
	{
		this.brand = brand;
	}
	
	/**
	 * Method mutate the price member of the object
	 * @param price to set the price
	 */
	public void setprice(double price)
	{
		this.price = price;
	}
	
	/**
	 * Method set the horsepower of the object
	 * @param hp to set the horsepower
	 */
	public void sethp(int hp)
	{
		this.hp = hp;
	}
	
	//getters
	/**
	 * @return the brand attribute of the Airplane
	 */
	public String getbrand()
	{
		return brand;
	}
	
	/**
	 * @return the price attribute of the Airplane type object
	 */
	public double getprice()
	{
		return price;
	}
	
	/**
	 * 
	 * @return the horsepower of the Airplane type object
	 */
	public int gethp()
	{
		return hp;
	}
	

	/**
	 *toString is a overridden method and is used here to display all the attributes of Airplane object
	 *@return A String which Display the details(attributes) of the Airplane
	 */

	@Override
	public String toString()
	{
		return "\nThis airplane is manufactured by " + brand + " . It has the power of " + hp + " horse power and it costs $" + price;
	}
	

	/**
	 * Equals method compares the attributes of the object that called the method 
	 * with object which passed as the argument in this method.
	 * @param other the parameter is an Airplane type object .
	 * @return boolean value of the arugment's attributes matches with the object that called this method.
	 */
	//equals() method to check if both the objects are equal or not
	public boolean equals(Airplane airplane)
	{
		return (this.brand==airplane.brand && this.hp==airplane.hp && this.price==airplane.price);
	}

}
