
//Creamos la clase
object HolaScala {
        //Luego definimos la funcion main de tipo Unit
        def main(args: Array[String]): Unit = {
            print("///////////////// Hola MUNDO")
            println("Hola mundoski!")

            print("//////////////// CONDICIONAL")

            val j = 10
            println(if(j == 10) "j vale 10" else "j no vale 10")


            print("//////////////// BUCLE")
        var k = 0;

        while (k < 5) {
        
          //Igual que en java
          println("k vale " + k)
          k = k + 1
          
        }


        print("/////////////////// PROGRAMACION FUNCIONAL")
        val persona = new Persona("Pepito", Some("Arnulfo"), "Pérez")
        persona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

        val otraPersona = new Persona("Juan", None, "Gutiérrez")
        otraPersona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"





    }







  


  



}