import scala.collection.mutable.{Set,ListMap}

object Ejercicio {

    def main(args: Array[String]): Unit = {

           val numeros = List(4, 8, 15, 16, 23, 42);
           val dobles = numeros.map{ x => 2*x}
           println(dobles)

    }
}