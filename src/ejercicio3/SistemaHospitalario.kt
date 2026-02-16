package ejercicio3

// ============================================================================
// ENUMS
// ============================================================================
enum class Genero {
    MASCULINO,
    FEMENINO,
    OTRO
}

enum class Especialidad {
    MEDICINA_GENERAL,
    PEDIATRIA,
    CARDIOLOGIA,
    NEUROLOGIA,
    TRAUMATOLOGIA,
    DERMATOLOGIA
}

// ============================================================================
// DATA CLASS DIRECCIÓN
// ============================================================================
// Representa dirección con todos sus componentes
data class Direccion(
    val calle: String,
    val ciudad: String,
    val codigoPostal: String
)

// ============================================================================
// CLASE BASE PERSONA (open = puede heredarse)
// ============================================================================
// Agrupa propiedades comunes de médicos y pacientes
open class Persona(
    val nombre: String,
    val identificacion: String,
    val genero: Genero,
    val correo: String?  // Puede ser null
)

// ============================================================================
// CLASE MÉDICO (hereda de Persona)
// ============================================================================
// Constructor primario llama a constructor de la clase padre con super
class Medico(
    nombre: String,
    identificacion: String,
    genero: Genero,
    correo: String?,
    val especialidad: Especialidad,
    val salario: Double,
    val anioIngreso: Int
) : Persona(nombre, identificacion, genero, correo) {

    // Método para calcular antigüedad
    fun calcularAntiguedad(): Int {
        return 2025 - anioIngreso
    }

    // Override de toString para mejor visualización
    override fun toString(): String {
        return "Dr(a). $nombre - $especialidad (Ingreso: $anioIngreso, Salario: $$salario)"
    }
}

// ============================================================================
// CLASE PACIENTE (hereda de Persona)
// ============================================================================
class Paciente(
    nombre: String,
    identificacion: String,
    genero: Genero,
    correo: String?,
    val telefono: String,
    val direccion: Direccion
) : Persona(nombre, identificacion, genero, correo) {

    override fun toString(): String {
        return "$nombre - Tel: $telefono - ${direccion.ciudad}"
    }
}

// ============================================================================
// FUNCIONES DE EXTENSIÓN
// ============================================================================

// Función de extensión sobre List<Medico>
// Permite: listaMedicos.filtrarPorEspecialidad(Especialidad.CARDIOLOGIA)
fun List<Medico>.filtrarPorEspecialidad(especialidad: Especialidad): List<Medico> {
    // 'this' se refiere a la lista sobre la que se llama la función
    return this.filter { it.especialidad == especialidad }
}

// Función de extensión sobre List<Paciente>
// Permite: listaPacientes.filtrarPorCiudad("Pereira")
fun List<Paciente>.filtrarPorCiudad(ciudad: String): List<Paciente> {
    return this.filter { it.direccion.ciudad.equals(ciudad, ignoreCase = true) }
}

// ============================================================================
// CLASE HOSPITAL
// ============================================================================
class Hospital(val nombre: String) {
    // Listas mutables privadas (encapsulación)
    private val medicos: MutableList<Medico> = mutableListOf()
    private val pacientes: MutableList<Paciente> = mutableListOf()

    // ========================================================================
    // MÉTODOS PARA AGREGAR Y ELIMINAR
    // ========================================================================

    fun agregarMedico(medico: Medico) {
        medicos.add(medico)
        println("✅ Médico agregado: ${medico.nombre}")
    }

    fun eliminarMedico(identificacion: String): Boolean {
        // removeIf: elimina elementos que cumplan condición
        val eliminado = medicos.removeIf { it.identificacion == identificacion }
        if (eliminado) {
            println("❌ Médico eliminado (ID: $identificacion)")
        } else {
            println("⚠️ No se encontró médico con ID: $identificacion")
        }
        return eliminado
    }

    fun agregarPaciente(paciente: Paciente) {
        pacientes.add(paciente)
        println("✅ Paciente agregado: ${paciente.nombre}")
    }

    fun eliminarPaciente(identificacion: String): Boolean {
        val eliminado = pacientes.removeIf { it.identificacion == identificacion }
        if (eliminado) {
            println("❌ Paciente eliminado (ID: $identificacion)")
        } else {
            println("⚠️ No se encontró paciente con ID: $identificacion")
        }
        return eliminado
    }

    // ========================================================================
    // CALCULAR TOTAL DE SALARIOS POR ESPECIALIDAD
    // ========================================================================
    fun calcularSalariosPorEspecialidad(): Map<Especialidad, Double> {
        // groupBy agrupa médicos por especialidad
        // mapValues transforma los valores del mapa
        // sumOf suma una propiedad de cada elemento
        return medicos
            .groupBy { it.especialidad }
            .mapValues { (_, listaMedicos) ->
                listaMedicos.sumOf { it.salario }
            }
    }

    // ========================================================================
    // OBTENER MÉDICO CON MÁS ANTIGÜEDAD
    // ========================================================================
    fun obtenerMedicoMasAntiguo(): Medico? {
        // minByOrNull busca el elemento con el valor mínimo
        // (año menor = más antiguo)
        return medicos.minByOrNull { it.anioIngreso }
    }

    // ========================================================================
    // GETTERS PARA ACCESO CONTROLADO
    // ========================================================================
    fun obtenerMedicos(): List<Medico> = medicos.toList()  // Copia inmutable
    fun obtenerPacientes(): List<Paciente> = pacientes.toList()

    // ========================================================================
    // MÉTODOS DE REPORTE
    // ========================================================================
    fun mostrarEstadisticas() {
        println("\n" + "=".repeat(70))
        println("ESTADÍSTICAS DEL HOSPITAL: $nombre")
        println("=".repeat(70))
        println("Total de médicos: ${medicos.size}")
        println("Total de pacientes: ${pacientes.size}")
        println()

        // Distribución por especialidad
        val porEspecialidad = medicos.groupBy { it.especialidad }
        println("MÉDICOS POR ESPECIALIDAD:")
        porEspecialidad.forEach { (especialidad, lista) ->
            println("  • $especialidad: ${lista.size}")
        }
    }
}

// ============================================================================
// FUNCIÓN MAIN - PRUEBAS
// ============================================================================
fun main() {
    println("🏥 SISTEMA DE GESTIÓN HOSPITALARIA")
    println("=".repeat(70))

    // Crear hospital
    val hospital = Hospital("Hospital Universitario del Quindío")

    // ========================================================================
    // AGREGAR MÉDICOS
    // ========================================================================
    println("\n➕ AGREGANDO MÉDICOS:")
    println("-".repeat(70))

    hospital.agregarMedico(
        Medico("Carlos Pérez", "1001", Genero.MASCULINO, "carlos@hospital.com",
            Especialidad.CARDIOLOGIA, 8500000.0, 2015)
    )
    hospital.agregarMedico(
        Medico("Ana López", "1002", Genero.FEMENINO, null,
            Especialidad.PEDIATRIA, 7200000.0, 2018)
    )
    hospital.agregarMedico(
        Medico("Juan Gómez", "1003", Genero.MASCULINO, "juan@hospital.com",
            Especialidad.CARDIOLOGIA, 9000000.0, 2012)
    )
    hospital.agregarMedico(
        Medico("María Rodríguez", "1004", Genero.FEMENINO, "maria@hospital.com",
            Especialidad.NEUROLOGIA, 8800000.0, 2017)
    )
    hospital.agregarMedico(
        Medico("Pedro Martínez", "1005", Genero.MASCULINO, null,
            Especialidad.MEDICINA_GENERAL, 6500000.0, 2020)
    )

    // ========================================================================
    // AGREGAR PACIENTES
    // ========================================================================
    println("\n➕ AGREGANDO PACIENTES:")
    println("-".repeat(70))

    hospital.agregarPaciente(
        Paciente("Lucía Hernández", "2001", Genero.FEMENINO, "lucia@email.com",
            "3201234567", Direccion("Calle 15 #20-30", "Pereira", "660001"))
    )
    hospital.agregarPaciente(
        Paciente("Roberto Silva", "2002", Genero.MASCULINO, null,
            "3159876543", Direccion("Av. 30 de Agosto", "Pereira", "660002"))
    )
    hospital.agregarPaciente(
        Paciente("Carmen Díaz", "2003", Genero.FEMENINO, "carmen@email.com",
            "3112345678", Direccion("Carrera 7 #10-20", "Armenia", "630001"))
    )
    hospital.agregarPaciente(
        Paciente("Diego Torres", "2004", Genero.MASCULINO, "diego@email.com",
            "3208765432", Direccion("Calle 50 #25-15", "Pereira", "660003"))
    )

    // ========================================================================
    // ESTADÍSTICAS GENERALES
    // ========================================================================
    hospital.mostrarEstadisticas()

    // ========================================================================
    // CALCULAR SALARIOS POR ESPECIALIDAD
    // ========================================================================
    println("\n💰 TOTAL DE SALARIOS POR ESPECIALIDAD:")
    println("-".repeat(70))

    val salariosPorEspecialidad = hospital.calcularSalariosPorEspecialidad()
    salariosPorEspecialidad.forEach { (especialidad, total) ->
        // String.format para formato de moneda
        println("  $especialidad: $${String.format("%,.0f", total)}")
    }

    // ========================================================================
    // MÉDICO MÁS ANTIGUO
    // ========================================================================
    println("\n⏰ MÉDICO CON MÁS ANTIGÜEDAD:")
    println("-".repeat(70))

    val medicoAntiguo = hospital.obtenerMedicoMasAntiguo()
    if (medicoAntiguo != null) {
        println("  ${medicoAntiguo.nombre}")
        println("  Año de ingreso: ${medicoAntiguo.anioIngreso}")
        println("  Antigüedad: ${medicoAntiguo.calcularAntiguedad()} años")
    }

    // ========================================================================
    // USAR FUNCIONES DE EXTENSIÓN
    // ========================================================================
    println("\n🔍 FILTRAR MÉDICOS POR ESPECIALIDAD (CARDIOLOGÍA):")
    println("-".repeat(70))

    // Usar función de extensión
    val cardiologos = hospital.obtenerMedicos()
        .filtrarPorEspecialidad(Especialidad.CARDIOLOGIA)

    cardiologos.forEach { println("  • $it") }

    println("\n🔍 FILTRAR PACIENTES POR CIUDAD (PEREIRA):")
    println("-".repeat(70))

    // Usar función de extensión
    val pacientesPereira = hospital.obtenerPacientes()
        .filtrarPorCiudad("Pereira")

    pacientesPereira.forEach { println("  • $it") }

    // ========================================================================
    // ELIMINAR REGISTROS
    // ========================================================================
    println("\n🗑️ ELIMINANDO REGISTROS:")
    println("-".repeat(70))

    hospital.eliminarMedico("1005")  // Eliminar Pedro Martínez
    hospital.eliminarPaciente("2002")  // Eliminar Roberto Silva
    hospital.eliminarMedico("9999")  // Intentar eliminar ID inexistente

    // ========================================================================
    // ESTADÍSTICAS FINALES
    // ========================================================================
    hospital.mostrarEstadisticas()

    println("\n" + "=".repeat(70))
    println("FIN DEL PROGRAMA")
    println("=".repeat(70))
}