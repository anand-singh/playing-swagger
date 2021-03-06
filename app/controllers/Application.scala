package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def swagger = Action {
    request =>
      Ok(views.html.swagger())
  }

}
