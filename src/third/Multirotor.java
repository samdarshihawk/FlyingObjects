// -----------------------------------------------------
// Part: 4
// Written by: Samdarshi Tiwar(40113256) & Meet Vora (40155271)
// -----------------------------------------------------

package third;

import second.Helicopter;

//class Multirotor inherited from Helicopter
public class Multirotor extends Helicopter
{
	//attributes
	public int noRotors;
	
	//default constructor
	public Multirotor()
	{
	}
	
	//parametrized constructor
	/**
	 * 
	 * @param brand
	 * @param price
	 * @param hp
	 * @param noCylinders
	 * @param creationYear
	 * @param capacity
	 * @param noRotors
	 */
	public Multirotor(String brand,double price,int hp,int noCylinders, int creationYear, int capacity,int noRotors)
	{
		super(brand,price,hp,noCylinders,creationYear,capacity);
		this.noRotors = noRotors;
	}
	
	//copy constructor
	/**
	 * 
	 * @param multirotor
	 */
	public Multirotor(Multirotor multirotor)
	{
		super(multirotor);
		this.noRotors = multirotor.noRotors;
	}

	//setters
	/**
	 * 
	 * @param noRotors to set no of rotors
	 */
	public void setnoRotors(int noRotors)
	{
		this.noRotors = noRotors;
	}

	//getters
	/**
	 * 
	 * @return noRotors
	 */
	public int getnoRotors()
	{
		return noRotors;
	}

	public String toString()
	{
		return "\nMultirotor :" + super.toString() + ". It has got " + noRotors + " no. of rotors";
	}
	
	public boolean equals(Multirotor multirotor)
	{
		return super.equals(multirotor) && this.noRotors==multirotor.noRotors;
	}
	
}
