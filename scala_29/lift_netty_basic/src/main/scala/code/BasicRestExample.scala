package code

import net.liftweb.http._
import net.liftweb.http.rest._
import net.liftweb.json._

object BasicRestExample extends RestHelper {

  serve {
    case Req("someresources" :: id :: Nil, _, _) => JObject(JField("id", JString(id)) :: Nil)
  }

}