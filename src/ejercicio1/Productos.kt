//esta es una clase producto con sus variables de objeto
data class Producto(
    val nombre: String,
    val precio: Double,
    val cantidad: Int
)

// Función de extensión sobre Producto la cual sirve para devolver el valor total de un producto
//Es una función que se agrega a una clase sin modificarla
fun Producto.valorTotal(): Double {
    return precio * cantidad
}
// Función de extensión sobre List<Producto>
//Esto agrega un método a cualquier lista de productos
fun List<Producto>.resumen(): String {
// Se obtiene la cantidad de productos usando 'this.size'
    val n = this.size

//sumOf = suma resultados
//{ it.valorTotal() } = para cada producto calcula su total
//it = cada elemento de la lista (Producto)

    val totalGeneral = this.sumOf { it.valorTotal() }
// se le pasa la lista p a una funcion que junta el nombre, cantidad, precio y total por una funcion lambda
    val detalleProductos = this.joinToString("\n") { p ->
        //el $ y $$ se refiere a la interpolación de variables y si se desea imprimir un signo de dolar solo hace
        //falta el $$ para que se muestre como si fuera un valor por eso alguno lleva $ y otro $$
        "* ${p.nombre}: $${p.precio} x ${p.cantidad} = $${p.valorTotal()}"
    }

    return """
    //$n cantidad de productos
        Inventario ($n productos):
        //$detalleProductos detalle general de productos
        $detalleProductos
        //$${totalGeneral} total general de productos
        Total inventario: $${totalGeneral}
    """.trimIndent()
    //Si no usara trimIndent(), el string tendría espacios al inicio y elimina esos espacios comunes
}

// Función que aplica un descuento a un producto
fun aplicarDescuento(producto: Producto, porcentaje: Double = 10.0): Producto {
    // Calcula el nuevo precio aplicando el porcentaje
    val nuevoPrecio = producto.precio * (1 - porcentaje / 100)

    // Retorna una copia del producto con el precio modificado
    return producto.copy(precio = nuevoPrecio)
}

fun main() {
    val p1 = Producto("Laptop", 2500.0, 2)
    val p2 = Producto("Mouse", 80.0, 5)
    val p3 = Producto("Teclado", 150.0, 3)
    val p4 = Producto("Monitor", 900.0, 1)
    val p5 = Producto("Audifonos", 200.0, 4)

    val inventario = listOf(
        p1,
        aplicarDescuento(p2),
        p3,
        p4,
        aplicarDescuento(p5, 20.0)
    )

    println(inventario.resumen())

}

//Salida del codigo
////5 cantidad de productos
//        Inventario (5 productos):
//* Laptop: $2500.0 x 2 = $5000.0
//* Mouse: $72.0 x 5 = $360.0
//* Teclado: $150.0 x 3 = $450.0
//* Monitor: $900.0 x 1 = $900.0
//* Audifonos: $160.0 x 4 = $640.0 detalle general de productos
//        * Laptop: $2500.0 x 2 = $5000.0
//* Mouse: $72.0 x 5 = $360.0
//* Teclado: $150.0 x 3 = $450.0