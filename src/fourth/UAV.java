// -----------------------------------------------------
// Part: 5
// Written by: Samdarshi Tiwari(40113256) & Meet Vora (40155271)
// -----------------------------------------------------


package fourth;
import six.FlyingObjects;

public class UAV extends FlyingObjects
{
	/**
	 * UAV class has dpuble weight and double price as its attributes.
	 */
	//attributes
	public double weight;
	public double price;
	
	//default constructor
	public UAV()
	{
	}

	//parametrized constructor
	/**
	 * Constructor method with 2 parameters
	 * @param weight type double: weight of the UAV
	 * @param price type double: Price of the UAV
	 */
	public UAV(double weight,double price)
	{
		this.weight = weight;
		this.price = price;
	}
	
	//copy constructor
	/**
	 * Copy Constructor method 
	 * @param uav instance of UAV class
	 */
	public UAV(UAV uav)
	{
		this.weight = uav.weight;
		this.price = uav.price;
	}
	
	//setters
	/**
	 * 
	 * @param weight to set the weight
	 */
	public void setweight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * 
	 * @param price to set the price
	 */
	public void setprice(double price)
	{
		this.price = price;
	}
	
	//getters
	/**
	 *
	 * @return weight
	 */
	public double getweight()
	{
		return weight;
	}
	
	/**
	 * 
	 * @return price
	 */
	public double getprice()
	{
		return price;
	}
	
	public String toString()
	{
		return "This is UAV . The weight of this UAV is " + weight + ". It costs $" + price;
	}
	
	public boolean equals(UAV uav)
	{
		return this.price==uav.price && this.weight==uav.weight;
	}
	
}
