package bootstrap.liftweb

import net.liftweb._
import http._
import code.BasicRestExample

class Boot {

  def boot {
    LiftRules.statelessDispatch.append(BasicRestExample)
  }

}