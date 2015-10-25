package models

case class Vehicle_Details extends model(
			
			Registration_Number: String, 
			Date_Of_First_Registration:String,
			Vehicle_Make: String,
			Year_Of_Manufacture:String,
			Cylinder_Capacity:String,
			CO2_Emission:String,
			Fuel_type:String,
			Vehicle_State:String,
			Vehicle_Color:String,
			Vehicle_Type_Approval:String,
			Wheel_Plan:String,
			Revenue_Weight:String
			
			)

object Vehicle_Details {

  var vehicles = Set(
    		
Vehicle_Details("W888YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W877ZQA","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W877YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W977YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W277YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W877YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W877YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W677YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W577YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available"),
Vehicle_Details("W477YCP","30 March 2000","honda","2000","1850cc","Not Available","PETROL","Tax not due","SILVER","Not Avaiable","2 AXLE RIGID BODY","Not 			Available")

 )

  def findAll = vehicles.toList.sortBy(_.Registration_Number)

  def findByRegistration_Number(Registration_Number: String) = vehicles.find(_.Registration_Number == Registration_Number)
}
