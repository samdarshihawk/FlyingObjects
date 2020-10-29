// -----------------------------------------------------
// Part: 3
// Written by: Samdarshi Tiwari (40113256) & Meet Vora (40155271)
// -----------------------------------------------------


package second;

//class Quadcopter inherited from Helicopter
public class Quadcopter extends Helicopter
{
	//attributes
	public int maxspeed;
	
	//default constructor
	public Quadcopter()
	{
	}

	//parametrized constructor
	/**
	 * 
	 * @param brand Type String Brand of the Quadcopter
	 * @param price Type double price of the Quadcopter
	 * @param hp Horsepower Type int
	 * @param noCylinders Number of cylineders type int
	 * @param creationYear Manufactured year
	 * @param capacity Passenger capacity type int
	 * @param maxspeed type int maximum speed of the quadcopter
	 */
	public Quadcopter(String brand,double price,int hp,int noCylinders, int creationYear, int capacity,int maxspeed)
	{
		super(brand,price,hp,noCylinders,creationYear,capacity);
		this.maxspeed = maxspeed;
	}
	
	//copy constructor
	/**
	 * 
	 * @param quadcopter
	 */
	public Quadcopter (Quadcopter quadcopter)
	{
		super(quadcopter);
		this.maxspeed = quadcopter.maxspeed;
	}

	//setters
	/**
	 * 
	 * @param maxspeed to set the maxspeed
	 */
	public void setmaxspeed(int maxspeed)
	{
		this.maxspeed = maxspeed;
	}
	
	/**
	 * Accesor method returns max speed 
	 * @return maxspeed maximum speed of the Quadcopter
	 */
	public int getmaxspeed()
	{
		return maxspeed;
	}
	
	@Override
	public String toString()
	{
		return "\nQuadcopter :" + super.toString() + ".The max flying speed is " + maxspeed;
	}
	
	public boolean equals(Quadcopter quadcopter)
	{
		return super.equals(quadcopter) && this.maxspeed==quadcopter.maxspeed;
	}
}
