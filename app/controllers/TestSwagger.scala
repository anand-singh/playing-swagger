package controllers

import play.api.mvc.{Action, Controller}
import com.wordnik.swagger.annotations.{ApiResponse, ApiResponses, ApiOperation, Api}

/**
 * Created by anand on 11/1/15.
 */
@Api(value = "/hello", description = "Landing Page")
object TestSwagger extends Controller {

  /*
     * It is Get method and returns a greeting Hello Guest
     * */
  @ApiOperation(value = "Get hello msg",
    notes = "Returns a cat",
    httpMethod = "GET")
  @ApiResponses(Array(
    new ApiResponse(code = 405, message = "Invalid input"),
    new ApiResponse(code = 404, message = "Hello not found")))
  def getHello(id: Int) = Action { implicit request =>
    Ok("Hello Guest!")
  }

}
