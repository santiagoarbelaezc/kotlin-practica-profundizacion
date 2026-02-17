/**
 * Documento 2 - Programación Funcional
 * Ejercicio de refactorización y funciones de ámbito
 */

// ============================================
// 1. REFACTORIZACIÓN DE CÓDIGO IMPERATIVO A FUNCIONAL
// ============================================

fun refactorizacionEjemplos() {
    println("=== FRAGMENTO A - Refactorización ===")
    val nombres = listOf("ana", "CARLOS", " beatriz ", "DAVID", "elena")

    // Versión funcional
    val resultado = nombres
        .map { it.trim().lowercase() }
        .filter { it.length > 4 }
        .map { it.replaceFirstChar { c -> c.uppercase() } }

    println("Nombres originales: $nombres")
    println("Resultado (nombres con más de 4 letras): $resultado")

    println("\n=== FRAGMENTO B - Refactorización ===")
    data class Estudiante(val nombre: String, val nota: Double, val materia: String)

    val estudiantes = listOf(
        Estudiante("Ana", 4.5, "Matemáticas"),
        Estudiante("Luis", 3.2, "Programación"),
        Estudiante("María", 4.8, "Matemáticas"),
        Estudiante("Pedro", 2.9, "Programación"),
        Estudiante("Sofía", 3.7, "Matemáticas")
    )

    // Versión funcional - Promedio por materia (solo aprobados)
    val promediosPorMateria = estudiantes
        .filter { it.nota >= 3.0 }                 // Solo aprobados
        .groupBy { it.materia }                    // Agrupar por materia
        .mapValues { (_, lista) ->                 // Calcular promedio por grupo
            lista.map { it.nota }.average()
        }

    println("Estudiantes: $estudiantes")
    println("Promedios por materia (solo aprobados): $promediosPorMateria")
}

// ============================================
// 2. FUNCIONES DE ÁMBITO - GESTIÓN DE USUARIOS
// ============================================

// Modelo de datos
data class Usuario(
    var nombre: String = "",
    var email: String = "",
    var edad: Int = 0,
    var activo: Boolean = false,
    var roles: MutableList<String> = mutableListOf()
)

data class PerfilUsuario(
    val usuario: Usuario,
    val fechaCreacion: String,
    val ultimoAcceso: String
)

fun funcionesAmbitoEjemplos() {
    println("\n\n=== APLICACIÓN DE GESTIÓN DE USUARIOS ===\n")

    // 1. USO DE apply - Para configurar e inicializar objetos
    println("1. USO DE apply - Inicialización de usuario:")

    val nuevoUsuario = Usuario().apply {
        nombre = "Juan Pérez"
        email = "juan.perez@example.com"
        edad = 28
        activo = true
        roles.add("Usuario")
        roles.add("Editor")
    }
    println("Usuario creado: $nuevoUsuario")

    // 2. USO DE let - Para ejecutar código con objetos no nulos
    println("\n2. USO DE let - Validación de email:")

    val emailIngresado: String? = "maria@example.com"

    emailIngresado?.let { email ->
        // Solo se ejecuta si emailIngresado no es nulo
        if (email.contains("@")) {
            println("✓ Email válido: $email")
            val usuario = Usuario().apply {
                nombre = "María García"
                this.email = email
                edad = 25
                activo = true
            }
            println("Usuario creado con email: ${usuario.email}")
        } else {
            println("✗ Email inválido")
        }
    } ?: println("✗ No se proporcionó email")

    // 3. USO DE also - Para acciones adicionales sin modificar el objeto
    println("\n3. USO DE also - Logging y auditoría:")

    val usuarioConAuditoria = Usuario().apply {
        nombre = "Carlos Ramírez"
        email = "carlos@example.com"
        edad = 35
        activo = true
        roles.add("Administrador")
    }.also {
        // Logging sin modificar el objeto
        println("📝 Auditoría: Usuario '${it.nombre}' creado en el sistema")
        println("📝 Roles asignados: ${it.roles.joinToString(", ")}")
        println("📝 Estado: ${if (it.activo) "Activo" else "Inactivo"}")
    }

    println("Usuario final: ${usuarioConAuditoria.nombre}")

    // 4. USO DE with - Para agrupar operaciones sobre el mismo objeto
    println("\n4. USO DE with - Generar reporte de usuario:")

    val usuarioReporte = Usuario().apply {
        nombre = "Ana Martínez"
        email = "ana@example.com"
        edad = 30
        activo = true
        roles.add("Usuario")
        roles.add("Moderador")
    }

    with(usuarioReporte) {
        println("╔═══════════════════════════════════╗")
        println("║      REPORTE DE USUARIO          ║")
        println("╠═══════════════════════════════════╣")
        println("║ Nombre: $nombre")
        println("║ Email: $email")
        println("║ Edad: $edad años")
        println("║ Estado: ${if (activo) "✓ Activo" else "✗ Inactivo"}")
        println("║ Roles: ${roles.joinToString(", ")}")
        println("║ Privilegios: ${if (roles.contains("Administrador")) "Completos" else "Limitados"}")
        println("╚═══════════════════════════════════╝")
    }

    // 5. USO DE run - Para configurar y calcular un resultado
    println("\n5. USO DE run - Crear perfil completo y validar:")

    val perfilCompleto = Usuario().apply {
        nombre = "Luis Torres"
        email = "luis@example.com"
        edad = 22
        activo = true
        roles.add("Usuario")
    }.run {
        // Configurar y retornar un nuevo objeto PerfilUsuario
        val perfil = PerfilUsuario(
            usuario = this,
            fechaCreacion = "2024-02-16",
            ultimoAcceso = "2024-02-16 10:30:00"
        )

        // Validar y retornar mensaje
        if (edad >= 18 && activo) {
            println("✓ Perfil válido creado para: $nombre")
            perfil
        } else {
            println("✗ Perfil no válido: Usuario debe ser mayor de edad y estar activo")
            null
        }
    }

    perfilCompleto?.let {
        println("Perfil creado exitosamente:")
        println("  - Usuario: ${it.usuario.nombre}")
        println("  - Fecha creación: ${it.fechaCreacion}")
        println("  - Último acceso: ${it.ultimoAcceso}")
    }
}

// ============================================
// 3. EJEMPLO INTEGRADO - COMBINANDO TODAS LAS FUNCIONES
// ============================================

fun sistemaRegistroEjemplo() {
    println("\n\n=== EJEMPLO INTEGRADO - SISTEMA DE REGISTRO ===\n")

    fun registrarUsuario(nombre: String, email: String?, edad: Int): String {
        return email?.let { emailValidado ->
            // let: Solo continúa si email no es nulo
            Usuario().apply {
                // apply: Configurar propiedades
                this.nombre = nombre
                this.email = emailValidado
                this.edad = edad
                this.activo = edad >= 18
                roles.add("Usuario")
            }.also {
                // also: Logging sin modificar
                println("📝 Registrando usuario: ${it.nombre}")
            }.run {
                // run: Validar y retornar resultado
                if (activo) {
                    with(this) {
                        // with: Generar mensaje usando propiedades
                        "✓ Usuario '$nombre' registrado exitosamente con email $email"
                    }
                } else {
                    "✗ Registro rechazado: El usuario debe ser mayor de edad"
                }
            }
        } ?: "✗ Registro rechazado: Email no proporcionado"
    }

    // Pruebas del sistema
    println(registrarUsuario("Pedro Sánchez", "pedro@example.com", 25))
    println(registrarUsuario("Laura Gómez", "laura@example.com", 17))
    println(registrarUsuario("Diego Ruiz", null, 30))
}

// ============================================
// FUNCIÓN MAIN - PUNTO DE ENTRADA
// ============================================

fun main() {
    println("========================================")
    println("   DOCUMENTO 2 - PROGRAMACIÓN FUNCIONAL")
    println("========================================")

    // Ejecutar todos los ejemplos
    refactorizacionEjemplos()
    funcionesAmbitoEjemplos()
    sistemaRegistroEjemplo()

    println("\n========================================")
    println("   FIN DEL PROGRAMA")
    println("========================================")
}