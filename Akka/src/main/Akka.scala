package main

import akka.actor._
import actores.Gerente
import actores.Asesor
import actores.Consultor

class MainActor extends Actor {

	override def preStart():Unit={

			val gerente = context.actorOf(Props(new Gerente("Rodrigo",1000000)))
					val asesor = context.actorOf(Props(new Asesor("Andrés")))
					val consultor = context.actorOf(Props(new Consultor("Roberto")))

					asesor ! "trabajar"
					consultor ! "trabajar"
					gerente ! "trabajar"
	}

	def receive={
	case 1 =>println("blabla")
	}
}

object Akka
{
	def main(args: Array[String]) {
		val system = ActorSystem("HelloSystem")
				val ac = system.actorOf(Props[MainActor])
	}
}