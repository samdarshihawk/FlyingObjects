// -----------------------------------------------------
// Part: 7
// Written by: Samdarshi Twari (40113256) & Meet Vora (40155271)
// -----------------------------------------------------

package five;

import fourth.UAV;
//class MAV inherited from UAV class
public class MAV extends UAV
{
	//attributes
	public String model;
	public double size;
	
	//default constructor
	public MAV()
	{
	}
	
	//parametrized constructor
	/**
	 * 
	 * @param weight
	 * @param price
	 * @param model
	 * @param size
	 */
	public MAV(double weight,double price,String model,double size)
	{
		super(weight,price);
		this.model = model;
		this.weight = weight;
	}
	
	//copy constructor
	/**
	 * 
	 * @param mav
	 */
	public MAV(MAV mav)
	{
		super(mav);
		this.model = mav.model;
		this.size = mav.size;
	}
	
	//setters
	/**
	 * 
	 * @param model to set the model
	 */
	public void setmodel(String model)
	{
		this.model = model;
	}
	
	/**
	 * 
	 * @param size to set the size
	 */
	public void setsize(double size)
	{
		this.size = size;
	}

	//getters
	/**
	 * 
	 * @return model
	 */
	public String getmodel()
	{
		return model;
	}
	
	/**
	 * 
	 * @return size
	 */
	public double getsize()
	{
		return size;
	}

	@Override
	public String toString()
	{
		return "\n MAV :" + super.toString() + ".It has " + model + " model and size of this MAV is " + size + "cm";
	}
	
	public boolean equals(MAV mav)
	{
		return super.equals(mav) && this.model==mav.model && this.size==mav.size;
	}
	
}
