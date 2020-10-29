// -----------------------------------------------------
// 
// Written by: Samdarshi & Meet Vora 
// -----------------------------------------------------

package second;
import first.Airplane;
//class Helicopter inherited from Airplane
public class Helicopter extends Airplane
{
	/**
	 * Hellicopter Class is sub-class of Airplane and has the following addtional attributes
	 * (int)noCylinder
	 * (int)creationYear
	 * (int)capacity
	 */
	//attributes
	public int noCylinders;
	public int creationYear;
	public int capacity;
	
	//default constructor
	public Helicopter()
	{
	}

	//parametrized constructor
	/**
	  * @param brand
	  * @param price
	  * @param hp
	  * @param noCylinders
	  * @param creationYear
	  * @param capacity
	  */

	public Helicopter(String brand,double price,int hp,int noCylinders, int creationYear, int capacity)
	{
		super(brand,price,hp);
		this.noCylinders = noCylinders;
		this.creationYear = creationYear;
		this.capacity = capacity;
	}
	
	//copy constructor
	/**
	 * 
	 * @param helicopter
	 */
	public Helicopter(Helicopter helicopter)
	{
		super(helicopter);
		this.noCylinders = helicopter.noCylinders;
		this.creationYear = helicopter.creationYear;
		this.capacity = helicopter.capacity;
	}
	
	//setters
	/**
	 * 
	 * @param noCylinders to set the number of cylinders
	 */
	public void setnoCylinders(int noCylinders)
	{
		this.noCylinders = noCylinders;
	}
	
	/**
	 * 
	 * @param capacity to set the capacity
	 */
	public void setcapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	/**
	 * 
	 * @param creationYear to set the year of creation
	 */
	public void setcreationYear(int creationYear)
	{
		this.creationYear = creationYear;
	}
	
	//getters
	/**
	 * 
	 * @return noCylinders
	 */
	public int getnoCylinders()
	{
		return noCylinders;
	}
	
	/**
	 * 
	 * @return creationYear
	 */
	public int getcreationYear()
	{
		return creationYear;
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
		return "\n Helicopter : " + super.toString() + " It has " + noCylinders + " cylinders and it was created in " + creationYear + " . Passenger Capacity : " + capacity ;
	}
	

	public boolean equals(Helicopter helicopter)
	{
		return (super.equals(helicopter) && this.noCylinders==helicopter.noCylinders && this.creationYear==helicopter.creationYear && this.capacity==helicopter.capacity);
	}
}
