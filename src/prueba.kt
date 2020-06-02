fun main(args: Array<String>) {
    val menu = """
        -- Bienvenido a Recipe Marker --
        
        por favor, selecciona la opción deseada
        
            1. Hacer una receta.
            2. Ver mis recetas.
            3. Salir.
            
    """.trimIndent()

    var op: String?
    do {
        println(menu)
        print("Selección: ")
        op = readLine()
        when(op) {
            "1" -> println("Crear")
            "2" -> println("Ver")
            else -> println("Opcion No valida")
        }
    } while (op?.compareTo("3") ?: -1 != 0 )

    println("Hasta pronto")
}