<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">🚀 Kotlin - Práctica de Profundización</h1>
<h3 align="center">📋 Ejercicios Avanzados de Kotlin</h3>

<p align="center">
  Colección de ejercicios prácticos implementados en <strong>Kotlin</strong> que exploran características avanzadas del lenguaje.<br>
  Incluye gestión de tareas y sistema hospitalario con POO, colecciones y funciones de extensión.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este repositorio contiene **dos ejercicios prácticos** desarrollados en **Kotlin** como parte del curso **Construcción de Aplicaciones Móviles** del programa de Ingeniería de Sistemas y Computación, bajo la guía del docente **Carlos Andrés Florez V.**

Cada ejercicio está diseñado para aplicar y demostrar diferentes características avanzadas de Kotlin, desde manejo de colecciones hasta programación orientada a objetos con herencia y funciones de extensión.

---

## 📚 **Ejercicios Incluidos**

### **📋 Ejercicio 2: Sistema de Gestión de Tareas**
Sistema de gestión de tareas que implementa:
- ✅ `enum class` para niveles de prioridad
- ✅ `sealed class` para estados de tareas
- ✅ `data class` para modelado de datos
- ✅ Operaciones avanzadas con listas (filter, groupBy, maxByOrNull)
- ✅ Destructuring declarations

### **🏥 Ejercicio 3: Sistema de Gestión Hospitalaria**
Sistema hospitalario completo que implementa:
- ✅ Herencia con clases `open` y constructores
- ✅ `data class` para composición de objetos
- ✅ Funciones de extensión personalizadas
- ✅ Encapsulación y getters controlados
- ✅ Operaciones complejas con colecciones (groupBy, mapValues, sumOf)

---

## ✨ **Características Principales**

### **🎚️ Ejercicio 2 - Gestión de Tareas**

#### **Modelado de Datos**
- **Enum Class Prioridad:** BAJA(1), MEDIA(2), ALTA(3), CRÍTICA(4)
- **Sealed Class EstadoTarea:**
  - ⏳ Pendiente
  - 🔄 EnProgreso (con % de avance)
  - ✅ Completada (con fecha)
  - ❌ Cancelada (con motivo)
- **Data Class Tarea:** título, descripción?, prioridad, estado

#### **Operaciones Implementadas**
1. 📋 Mostrar todas las tareas con formato descriptivo
2. 🔥 Filtrar tareas ALTA/CRÍTICA no canceladas
3. 📊 Agrupar y contar por estado
4. ⚡ Obtener tarea pendiente prioritaria
5. 🎯 Destructuring de propiedades

---

### **🏥 Ejercicio 3 - Sistema Hospitalario**

#### **Modelado de Datos**
- **Enums:** Género (MASCULINO, FEMENINO, OTRO) y Especialidad (6 tipos)
- **Data Class Dirección:** calle, ciudad, códigoPostal
- **Clase Base Persona:** nombre, identificación, género, correo?
- **Clase Médico:** + especialidad, salario, añoIngreso
- **Clase Paciente:** + teléfono, dirección

#### **Operaciones Implementadas**
- ➕ Agregar médicos y pacientes
- ❌ Eliminar por identificación
- 💰 Calcular salarios totales por especialidad
- ⏰ Obtener médico más antiguo
- 🔍 **Funciones de extensión:**
  - `List<Medico>.filtrarPorEspecialidad()`
  - `List<Paciente>.filtrarPorCiudad()`
- 📊 Generar estadísticas del hospital

---

## 💡 **Conceptos de Kotlin Aplicados**

<table>
<tr>
<td width="50%">

### **Ejercicio 2**
- ✅ Enum classes con propiedades
- ✅ Sealed classes jerárquicas
- ✅ Smart cast automático
- ✅ Null safety (`String?`)
- ✅ Data classes
- ✅ Lambdas y `it`
- ✅ Method chaining
- ✅ Destructuring
- ✅ `filter`, `groupBy`, `maxByOrNull`
- ✅ String templates

</td>
<td width="50%">

### **Ejercicio 3**
- ✅ Herencia con `open class`
- ✅ Constructores primarios
- ✅ Override de métodos
- ✅ Funciones de extensión
- ✅ Encapsulación (private)
- ✅ Data classes compuestas
- ✅ `removeIf`, `minByOrNull`
- ✅ `groupBy`, `mapValues`, `sumOf`
- ✅ Listas inmutables con `toList()`
- ✅ String formatting

</td>
</tr>
</table>

---

## 🛠️ **Stack Tecnológico**

### **Lenguaje & Runtime**
<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img width="8" />
  <img src="https://img.shields.io/badge/JDK-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
</div>

### **IDE**
<div align="center">
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" />
</div>

---

## 📁 **Estructura del Proyecto**

```
kotlin-practica-profundizacion/
├── .idea/                          # Configuración de IntelliJ
├── out/                            # Archivos compilados (.class)
├── src/
│   ├── ejercicio2/
│   │   └── GestionTareas.kt       # Sistema de gestión de tareas
│   └── ejercicio3/
│       └── SistemaHospitalario.kt # Sistema de gestión hospitalaria
├── .gitignore
├── kotlin-practica-profundizacion.iml
└── README.md
```

---

## 🚀 **Cómo Ejecutar**

### **Opción 1: Desde IntelliJ IDEA (Recomendado)**

#### **Ejercicio 2:**
1. Abre el proyecto en IntelliJ IDEA
2. Navega a `src/ejercicio2/GestionTareas.kt`
3. Click en el **▶️ verde** al lado de `fun main()`
4. O presiona **Shift + F10**

#### **Ejercicio 3:**
1. Navega a `src/ejercicio3/SistemaHospitalario.kt`
2. Click en el **▶️ verde** al lado de `fun main()`
3. O presiona **Shift + F10**

### **Opción 2: Compilación Manual desde Terminal**

```bash
# Compilar Ejercicio 2
kotlinc src/ejercicio2/GestionTareas.kt -include-runtime -d Ejercicio2.jar
java -jar Ejercicio2.jar

# Compilar Ejercicio 3
kotlinc src/ejercicio3/SistemaHospitalario.kt -include-runtime -d Ejercicio3.jar
java -jar Ejercicio3.jar
```

### **Opción 3: Probar en Línea**
Copia el código en: [https://play.kotlinlang.org/](https://play.kotlinlang.org/)

---

## 📊 **Salidas de los Programas**

### **📋 Ejercicio 2 - Gestión de Tareas**

```
======================================================================
SISTEMA DE GESTIÓN DE TAREAS
======================================================================

📋 TODAS LAS TAREAS:
----------------------------------------------------------------------
📌 Implementar autenticación [CRITICA] -> 🔄 EN PROGRESO - Avance: 75%
📌 Diseñar base de datos [ALTA] -> ✅ COMPLETADA - Finalizada el 2025-02-15
📌 Escribir documentación [MEDIA] -> ⏳ PENDIENTE - Aún no iniciada
...

📊 CONTEO DE TAREAS POR ESTADO:
----------------------------------------------------------------------
  En Progreso: 2 tarea(s)
  Completada: 1 tarea(s)
  Pendiente: 2 tarea(s)
  Cancelada: 1 tarea(s)

⚡ TAREA PENDIENTE CON MAYOR PRIORIDAD:
----------------------------------------------------------------------
📌 Optimizar consultas SQL [CRITICA] -> ⏳ PENDIENTE - Aún no iniciada
```

### **🏥 Ejercicio 3 - Sistema Hospitalario**

```
🏥 SISTEMA DE GESTIÓN HOSPITALARIA
======================================================================

➕ AGREGANDO MÉDICOS:
----------------------------------------------------------------------
✅ Médico agregado: Carlos Pérez
✅ Médico agregado: Ana López
...

======================================================================
ESTADÍSTICAS DEL HOSPITAL: Hospital Universitario del Quindío
======================================================================
Total de médicos: 5
Total de pacientes: 4

MÉDICOS POR ESPECIALIDAD:
  • CARDIOLOGIA: 2
  • PEDIATRIA: 1
  • NEUROLOGIA: 1
  • MEDICINA_GENERAL: 1

💰 TOTAL DE SALARIOS POR ESPECIALIDAD:
----------------------------------------------------------------------
  CARDIOLOGIA: $17,500,000
  PEDIATRIA: $7,200,000
  NEUROLOGIA: $8,800,000
  MEDICINA_GENERAL: $6,500,000

⏰ MÉDICO CON MÁS ANTIGÜEDAD:
----------------------------------------------------------------------
  Juan Gómez
  Año de ingreso: 2012
  Antigüedad: 13 años

🔍 FILTRAR MÉDICOS POR ESPECIALIDAD (CARDIOLOGÍA):
----------------------------------------------------------------------
  • Dr(a). Carlos Pérez - CARDIOLOGIA (Ingreso: 2015, Salario: $8500000.0)
  • Dr(a). Juan Gómez - CARDIOLOGIA (Ingreso: 2012, Salario: $9000000.0)
```

---

## 📖 **Guía de Aprendizaje**

### **🎓 Ejercicio 2 - Enfoque en Colecciones**

#### **1. Sealed Classes**
```kotlin
sealed class EstadoTarea {
    object Pendiente : EstadoTarea()
    data class EnProgreso(val porcentaje: Int) : EstadoTarea()
}
```
**Ventajas:**
- ✅ When exhaustivo sin `else`
- ✅ Smart cast automático
- ✅ Jerarquía de tipos controlada

#### **2. Operaciones con Listas**
```kotlin
// Filtrar + encontrar máximo
val tareaPrioritaria = tareas
    .filter { it.estado is EstadoTarea.Pendiente }
    .maxByOrNull { it.prioridad.nivel }

// Agrupar y contar
val porEstado = tareas.groupBy { 
    when (it.estado) {
        is EstadoTarea.Pendiente -> "Pendiente"
        // ...
    }
}
```

#### **3. Destructuring**
```kotlin
// En variable
val (titulo, _, prioridad) = tarea

// En lambda
tareas.forEach { (titulo, _, prioridad, _) ->
    println("$titulo - $prioridad")
}
```

---

### **🎓 Ejercicio 3 - Enfoque en POO**

#### **1. Herencia**
```kotlin
open class Persona(val nombre: String)

class Medico(
    nombre: String,
    val especialidad: Especialidad
) : Persona(nombre)
```

#### **2. Funciones de Extensión**
```kotlin
fun List<Medico>.filtrarPorEspecialidad(esp: Especialidad) =
    this.filter { it.especialidad == esp }

// Uso
listaMedicos.filtrarPorEspecialidad(Especialidad.CARDIOLOGIA)
```

#### **3. Operaciones Complejas**
```kotlin
// Agrupar + transformar + sumar
medicos
    .groupBy { it.especialidad }
    .mapValues { (_, lista) -> 
        lista.sumOf { it.salario }
    }
```

---

## 🎯 **Objetivos de Aprendizaje Alcanzados**

<table>
<tr>
<td>

### **✅ Ejercicio 2**
- Modelar estados finitos con sealed classes
- Aplicar null safety correctamente
- Usar operaciones funcionales en listas
- Implementar destructuring
- Encadenar transformaciones

</td>
<td>

### **✅ Ejercicio 3**
- Diseñar jerarquías de clases
- Implementar herencia en Kotlin
- Crear funciones de extensión
- Encapsular datos privados
- Componer objetos con data classes

</td>
</tr>
</table>

---

## 📚 **Recursos de Referencia**

- 📘 [Documentación Oficial de Kotlin](https://kotlinlang.org/docs/)
- 📗 [Kotlin Collections](https://kotlinlang.org/docs/collections-overview.html)
- 📕 [Sealed Classes](https://kotlinlang.org/docs/sealed-classes.html)
- 📙 [Extension Functions](https://kotlinlang.org/docs/extensions.html)
- 🎮 [Kotlin Playground](https://play.kotlinlang.org/)

---

## 🎓 **Información Académica**

**Curso:** Construcción de Aplicaciones Móviles  
**Programa:** Ingeniería de Sistemas y Computación  
**Universidad:** Universidad del Quindío  
**Docente:** Carlos Andrés Florez V.  
**Fecha:** Febrero 2026

---

## 👨‍💻 **Desarrollador**

<div align="center">

**Santiago Arbelaez Contreras**  
Junior Full Stack Developer  
Estudiante de Ingeniería de Sistemas – Universidad del Quindío

<br>

<a href="https://github.com/santiagoarbelaezc">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
</a>
<img width="10" />
<a href="https://www.linkedin.com/in/santiago-arbelaez-contreras-9830b5290/">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" />
</a>
<img width="10" />
<a href="https://portfolio-santiagoa.web.app/portfolio">
  <img src="https://img.shields.io/badge/Portfolio-6C63FF?style=for-the-badge&logo=sparkles&logoColor=white" />
</a>

</div>

---

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=90&section=footer&animation=fadeIn" />
</div>
