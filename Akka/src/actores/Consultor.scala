package actores

import akka.actor._

class Consultor(nombre:String) extends Actor
{
	def receive = {
	case "trabajar" => println("Termino consultor")
	case _ =>println("No entendi")
	}
}