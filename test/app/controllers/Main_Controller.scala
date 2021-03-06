package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.Controller
import models.Vehicle_Details
import play.api.i18n.Messages

/**
 * Controller for products HTTP interface.
 */
object Application extends Controller {

 var Registration_Number= request.body.asFormUrlEncoded.get("ctl00$MainContent$txtSearchVrm")
 var Search= request.body.asFormUrlEncoded.get("Search") 	


if(Registration_Number!=null){

def handle = Action { implicit request => 
  request.body.asFormUrlEncoded.get("action").headOption match {
   case Some("Search") => Ok(show(Registration_Number))
    case _ => BadRequest("This action is not allowed")
  }
}

}


/**
   * Displays the vehicle details  with the given Registration number.
   */
  def show(Registration_Number: String) = Action { implicit request =>
    vehicles.findByRegistration_Number(Registration_Number).map { Vehicle_Details =>
      Ok(views.html.show_details(Vehicle_Details))
    }.getOrElse(NotFound)
  }

	}
