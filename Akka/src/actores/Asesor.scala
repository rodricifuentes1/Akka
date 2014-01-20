package actores

import akka.actor._

class Asesor(nombre:String) extends Actor {

  def receive={
    case "trabajar" => println("Termino asesor")
    case _ =>println("No entendi")
  }
  
}