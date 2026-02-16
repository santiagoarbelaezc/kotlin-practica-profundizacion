package ejercicio2

// ============================================================================
// 1. ENUM CLASS - PRIORIDAD
// ============================================================================
// Define 4 niveles de prioridad, cada uno con su valor numérico
// Se usa enum class cuando tienes un conjunto fijo y conocido de valores
enum class Prioridad(val nivel: Int) {
    BAJA(1),
    MEDIA(2),
    ALTA(3),
    CRITICA(4)
}

// ============================================================================
// 2. SEALED CLASS - ESTADO TAREA
// ============================================================================
// Sealed class: restringe la jerarquía a subclases conocidas en tiempo de compilación
// Ventaja: when exhaustivo sin else + smart cast automático
sealed class EstadoTarea {
    // object: singleton, no tiene propiedades
    object Pendiente : EstadoTarea()

    // data class: tiene propiedades, genera equals/hashCode/toString
    data class EnProgreso(val porcentaje: Int) : EstadoTarea()
    data class Completada(val fechaFinalizacion: String) : EstadoTarea()
    data class Cancelada(val motivo: String) : EstadoTarea()
}

// ============================================================================
// 3. DATA CLASS - TAREA
// ============================================================================
// data class genera automáticamente:
// - equals() y hashCode()
// - toString()
// - copy() para copiar con modificaciones
// - componentN() para destructuring
data class Tarea(
    val titulo: String,
    val descripcion: String?,  // ? = puede ser null (null safety)
    val prioridad: Prioridad,
    val estado: EstadoTarea
)

// ============================================================================
// 4. FUNCIÓN MOSTRAR ESTADO
// ============================================================================
// Usa when con sealed class (exhaustivo, no necesita else)
// Smart cast: dentro de cada rama, el tipo es específico automáticamente
fun mostrarEstado(tarea: Tarea) {
    print("📌 ${tarea.titulo} [${tarea.prioridad}] -> ")

    // 'when (val x = ...)' permite crear variable local para usar dentro
    when (val estado = tarea.estado) {
        is EstadoTarea.Pendiente -> {
            println("⏳ PENDIENTE - Aún no iniciada")
        }
        is EstadoTarea.EnProgreso -> {
            // Smart cast: 'estado' es automáticamente EnProgreso aquí
            println("🔄 EN PROGRESO - Avance: ${estado.porcentaje}%")
        }
        is EstadoTarea.Completada -> {
            println("✅ COMPLETADA - Finalizada el ${estado.fechaFinalizacion}")
        }
        is EstadoTarea.Cancelada -> {
            println("❌ CANCELADA - Razón: ${estado.motivo}")
        }
    }
}

// ============================================================================
// 5. FUNCIÓN MAIN - OPERACIONES SOBRE LA LISTA
// ============================================================================
fun main() {
    println("=".repeat(70))
    println("SISTEMA DE GESTIÓN DE TAREAS")
    println("=".repeat(70))

    // MutableList: lista que puede modificarse (add, remove, etc.)
    val tareas: MutableList<Tarea> = mutableListOf(
        Tarea(
            "Implementar autenticación",
            "Sistema de login con JWT",
            Prioridad.CRITICA,
            EstadoTarea.EnProgreso(75)
        ),
        Tarea(
            "Diseñar base de datos",
            "Modelar entidades y relaciones",
            Prioridad.ALTA,
            EstadoTarea.Completada("2025-02-15")
        ),
        Tarea(
            "Escribir documentación",
            null,  // descripción puede ser null
            Prioridad.MEDIA,
            EstadoTarea.Pendiente
        ),
        Tarea(
            "Configurar CI/CD",
            "Pipeline de despliegue automático",
            Prioridad.ALTA,
            EstadoTarea.EnProgreso(40)
        ),
        Tarea(
            "Actualizar dependencias",
            "Revisar versiones de librerías",
            Prioridad.BAJA,
            EstadoTarea.Cancelada("Pospuesto para siguiente sprint")
        ),
        Tarea(
            "Optimizar consultas SQL",
            "Mejorar rendimiento de queries pesadas",
            Prioridad.CRITICA,
            EstadoTarea.Pendiente
        )
    )

    // ========================================================================
    // OPERACIÓN 1: Mostrar estado de todas las tareas
    // ========================================================================
    println("\n📋 TODAS LAS TAREAS:")
    println("-".repeat(70))

    // forEach: itera sobre cada elemento
    // Lambda recibe cada tarea como parámetro
    tareas.forEach { tarea ->
        mostrarEstado(tarea)
    }

    // ========================================================================
    // OPERACIÓN 2: Filtrar tareas de alta prioridad no canceladas
    // ========================================================================
    println("\n🔥 TAREAS DE ALTA PRIORIDAD (ALTA/CRÍTICA) NO CANCELADAS:")
    println("-".repeat(70))

    // filter: crea NUEVA lista con elementos que cumplen condición
    // No modifica la lista original
    val tareasUrgentes = tareas.filter { tarea ->
        // Condición: (ALTA O CRITICA) Y (NO cancelada)
        (tarea.prioridad == Prioridad.ALTA || tarea.prioridad == Prioridad.CRITICA) &&
                tarea.estado !is EstadoTarea.Cancelada  // 'is' verifica tipo
    }

    if (tareasUrgentes.isEmpty()) {
        println("No hay tareas urgentes sin cancelar")
    } else {
        tareasUrgentes.forEach { mostrarEstado(it) }  // 'it' = elemento actual
    }

    // ========================================================================
    // OPERACIÓN 3: Contar tareas por estado usando groupBy
    // ========================================================================
    println("\n📊 CONTEO DE TAREAS POR ESTADO:")
    println("-".repeat(70))

    // groupBy: agrupa elementos según una clave
    // Retorna: Map<String, List<Tarea>>
    // Ejemplo: {"Pendiente": [tarea1, tarea2], "Completada": [tarea3]}
    val tareasPorEstado = tareas.groupBy { tarea ->
        when (tarea.estado) {
            is EstadoTarea.Pendiente -> "Pendiente"
            is EstadoTarea.EnProgreso -> "En Progreso"
            is EstadoTarea.Completada -> "Completada"
            is EstadoTarea.Cancelada -> "Cancelada"
        }
    }

    // Recorrer el mapa con destructuring (clave, valor)
    tareasPorEstado.forEach { (estado, listaTareas) ->
        println("  $estado: ${listaTareas.size} tarea(s)")
    }

    // ========================================================================
    // OPERACIÓN 4: Obtener tarea pendiente con mayor prioridad
    // ========================================================================
    println("\n⚡ TAREA PENDIENTE CON MAYOR PRIORIDAD:")
    println("-".repeat(70))

    // Encadenamiento de funciones (method chaining)
    val tareaPrioritaria = tareas
        .filter { it.estado is EstadoTarea.Pendiente }  // 1. Solo pendientes
        .maxByOrNull { it.prioridad.nivel }              // 2. Máximo por nivel

    // maxByOrNull retorna null si lista vacía → safe call ?.
    if (tareaPrioritaria != null) {
        mostrarEstado(tareaPrioritaria)
    } else {
        println("No hay tareas pendientes")
    }

    // ========================================================================
    // OPERACIÓN 5: Destructuring para mostrar título y prioridad
    // ========================================================================
    println("\n📝 LISTADO SIMPLIFICADO (Título - Prioridad):")
    println("-".repeat(70))

    // Destructuring: extraer propiedades de data class
    // El orden corresponde al orden del constructor
    tareas.forEach { tarea ->
        val (titulo, descripcion, prioridad) = tarea
        // Solo usamos titulo y prioridad (descripcion se ignora)
        println("  • $titulo - [$prioridad]")
    }

    // ALTERNATIVA: Destructuring directo en el parámetro del lambda
    println("\n🎯 DESTRUCTURING EN FOREACH:")
    println("-".repeat(70))

    // _ (underscore) = ignorar esa propiedad
    tareas.forEach { (titulo, _, prioridad, _) ->
        println("  → $titulo tiene prioridad $prioridad")
    }

    println("\n" + "=".repeat(70))
}