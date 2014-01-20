package actores

import akka.actor._

class Gerente(nombre:String, sueldo:Double) extends Actor
{
	def receive={
	case "trabajar" => sender ! 1
	case _ =>println("No entendi")
	}
}