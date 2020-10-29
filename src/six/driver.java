// -----------------------------------------------------
// Part: 8
// Written by: Samdarshi Tiwari (40113256) & Meet Vora (40155271)
// -----------------------------------------------------
package six;

import first.Airplane;
import five.AgriculturalDrone;
import five.MAV;
import fourth.UAV;
import second.Helicopter;
import second.Quadcopter;
import third.Multirotor;

public class driver 
{
	/**
	 * A static method create a copy of FlyingObjects type array
	 * @param flyObj array to store different types of instances in type FlyingObjects
	 * @return copyFlyObj an array of same size as the referenced one with the same data type 
	 */
	public static FlyingObjects[] copyFlyingObjects(FlyingObjects[] flyObj){
	       FlyingObjects[] copyFlyObj = new FlyingObjects[flyObj.length];
	       for(int i=0;i<copyFlyObj.length;i++){
	           copyFlyObj[i]=flyObj[i];
	       }
	       return copyFlyObj;
	   }


	public static void main(String[] args) 
	{
		FlyingObjects[] flyingObjects =new FlyingObjects[15];//array
		//filling of the arrays
	       Airplane a1= new Airplane("Luftanza",4500,1500);
	       Helicopter h1 =new Helicopter("Air656",3500,787,4,2001,8);
	       Quadcopter q1=new Quadcopter("jeezzz",6000,656,5,2002,4,545);
	       Multirotor m1=new Multirotor("mk",2000,555,3,2003,3,3);
	       UAV u1=new UAV(56, 999.99);
	       AgriculturalDrone ag1=new AgriculturalDrone(54.99,645.99,"Kbc",5);
	       MAV ma1=new MAV( 54,756.99,"yeye", 458.99);
	       MAV ma2=new MAV( 54,756.99,"yeye", 458.99);
	       Airplane a2=new Helicopter("dsdd",54.56,6,6,6,6);
	       flyingObjects[0]=new Airplane("Indigo", 46546.74, 742);
	       flyingObjects[1]=new Helicopter("abc",32.56,9,9,9,9);
	       flyingObjects[2]=new Airplane(a1);
	       flyingObjects[3]=new Helicopter(h1);
	       flyingObjects[4]=a2;
	       flyingObjects[5]=new Quadcopter(q1);
	       flyingObjects[6]=q1;
	       flyingObjects[7]=m1;
	       flyingObjects[8]=u1;
	       flyingObjects[9]=ag1;
	       flyingObjects[10]=ma1;
	       flyingObjects[11]=new Multirotor(m1);
	       flyingObjects[12]=new AgriculturalDrone(ag1);
	       flyingObjects[13]=new MAV(ma1);
		   flyingObjects[14]=new UAV(u1);




		   int index1,index2;
		   index1 = -1;
		   index2 = -1;
		   double min1,min2;
		   min1= min2 = Double.MAX_VALUE; // Assigning highest possible value a double can have
		   FlyingObjects[] copied = copyFlyingObjects(flyingObjects);// calling copyFlyingobject method to create a copy of orginal array
			// iterating thorugh the array and comparing the value with min1 and min2 
		   for(int i = 0; i < copied.length;i++){
			   if(copied[i].getprice()<min1){ // if first value less than min1, min1 takes that value
					min2 = min1;
					min1 = copied[i].getprice();
					index2 = index1;
					index1 = i;
				}
   
				else if(copied[i].getprice() < min2){ //if first value not less than min1, then assign that value to min2
					index2 = i;
					min2 = copied[i].getprice();
   
				}
			}
			// Displaying Second least and least expensive object information below
		System.out.println("2nd least expensive object information: "+flyingObjects[index2]); //Displaying all the information of 2nd least expensive object
         System.out.println("Location: " + index2 +"\n"); // Showing index of 2nd least expensive 
         System.out.println("Least expensive object information: "+flyingObjects[index1]); //Displaying all the information of least expensive object
         System.out.println("Location: " + (index1)); // showing index of least expensive





	       System.out.println("-------------Before copying---------------");
	       for(Object object: flyingObjects){
	           System.out.println(object);
	       }
	       System.out.println();
	       System.out.println("-------------After copying---------------");
	       Object[] copyObjects=copyFlyingObjects(flyingObjects); // copy objects array
	       for(Object object : copyObjects){
	           System.out.println(object);
	       }
	       
	       System.out.println("\n Checking equals method!!");
	       System.out.println(a1.equals(a2));
		   System.out.println(ma1.equals(ma2));

		   Object e = flyingObjects[0];
		   Object z = copied[0];

		   System.out.println("\nThank you for Using this program");
		   System.out.println("Program Terminated!!!!");

	}

}
