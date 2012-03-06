package bootstrap.liftweb

import net.liftweb._
import http._
import com.something.lift.MyRest

class Boot {

  def boot {
    LiftRules.statelessDispatchTable.append(MyRest)
  }

}