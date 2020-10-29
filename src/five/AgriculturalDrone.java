// -----------------------------------------------------
// Part: 6
// Written by: Samdarshi Tiwari (40113256) & Meet Vora (40155271)
// -----------------------------------------------------

package five;

import fourth.UAV;
//class AgriculturalDrone inherited from UAV class
public class AgriculturalDrone extends UAV
{
	/**
	 * Agricultural drone is a sub-class of UAV and has the following data members
	 * Brand(string)
	 * Capacity(int)
	 */
	//attributes
	public String brand ;
	public int capacity;
	
	//default constructor
	public AgriculturalDrone()
	{
	}
	
	//parametrized constructor
	/**
	 * Constructor method which takes super argument and its own argument
	 * @param weight type double: weight of the drone
	 * @param price type double: price of the drone
	 * @param brand type String: brand of the drone
	 * @param capacity int : Freight weight carrying capacity
	 */
	public AgriculturalDrone(double weight,double price,String brand,int capacity)
	{
		super(weight,price);
		this.brand = brand;
		this.capacity = capacity;
	}
	
	//copy constructor
	/**
	 * 
	 * @param agriculturaldrone
	 */
	public AgriculturalDrone(AgriculturalDrone agriculturaldrone)
	{
		super(agriculturaldrone);
		this.brand = agriculturaldrone.brand;
		this.capacity = agriculturaldrone.capacity;
	}
	
	//setters
	/**
	 * 
	 * @param brand to set the brand
	 */
	public void setbrand(String brand)
	{
		this.brand = brand;
	}
	
	/**
	 * 
	 * @param capacity to set the capacity
	 */
	public void setcapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	//getters
	/**
	 * 
	 * @return brand
	 */
	public String getbrand()
	{
		return brand;
	}
	
	/**
	 * 
	 * @return capacity
	 */
	public int getcapacity()
	{
		return capacity;
	}
	
	@Override
	public String toString()
	{
		return "\n Agricultural Drone :" + super.toString() + ". It is manufactured by " + brand + " and it has carry capacity of " + capacity ;
	}

	public boolean equals(AgriculturalDrone agriculturaldrone)
	{
		return super.equals(agriculturaldrone) && this.brand.equals(agriculturaldrone.brand) && this.capacity==agriculturaldrone.capacity;
	}
	
}
