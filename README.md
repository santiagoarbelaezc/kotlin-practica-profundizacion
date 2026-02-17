<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">🚀 Kotlin - Práctica de Profundización</h1>
<h3 align="center">📋 Ejercicios Avanzados de Kotlin</h3>

<p align="center">
  Colección de ejercicios prácticos implementados en <strong>Kotlin</strong> que exploran características avanzadas del lenguaje.<br>
  Incluye gestión de productos, tareas, sistema hospitalario y programación funcional.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este repositorio contiene **cuatro ejercicios prácticos** desarrollados en **Kotlin** como parte del curso **Construcción de Aplicaciones Móviles** del programa de Ingeniería de Sistemas y Computación, bajo la guía del docente **Carlos Andrés Florez V.**

---

## 📚 **Ejercicios Incluidos**

### **📦 Ejercicio 1: Sistema de Gestión de Productos**
Sistema de inventario que implementa:
- ✅ `data class Producto` con nombre, precio y cantidad
- ✅ Función de extensión `Producto.valorTotal()`
- ✅ Función de extensión `List<Producto>.resumen()`
- ✅ Función `aplicarDescuento()` con parámetro por defecto y `copy()`
- ✅ `sumOf`, `joinToString` y strings multilínea con `trimIndent()`

### **📋 Ejercicio 2: Sistema de Gestión de Tareas**
Sistema de tareas con estados y prioridades que implementa:
- ✅ `enum class Prioridad` con propiedad `nivel: Int`
- ✅ `sealed class EstadoTarea` con smart cast y `when` exhaustivo
- ✅ `data class Tarea` con null safety (`String?`)
- ✅ `filter`, `groupBy`, `maxByOrNull` y destructuring declarations

### **🏥 Ejercicio 3: Sistema de Gestión Hospitalaria**
Sistema hospitalario completo que implementa:
- ✅ Herencia con `open class Persona` → `Medico` y `Paciente`
- ✅ Funciones de extensión `filtrarPorEspecialidad()` y `filtrarPorCiudad()`
- ✅ Encapsulación con listas `private` y getters con `toList()`
- ✅ `groupBy`, `mapValues`, `sumOf`, `minByOrNull`, `removeIf`

### **⚡ Programación Funcional: Funciones de Ámbito**
Ejercicio de refactorización y funciones de ámbito que implementa:
- ✅ Refactorización de código imperativo a funcional con `map`, `filter`, `groupBy`
- ✅ Las 5 funciones de ámbito: `apply`, `let`, `also`, `with`, `run`
- ✅ Sistema de registro de usuarios combinando todas las funciones de ámbito
- ✅ Null safety con `?.let` y el operador Elvis `?:`

---

## 📁 **Estructura del Proyecto**

```
kotlin-practica-profundizacion/
├── .idea/
├── out/
├── src/
│   ├── ejercicio1/
│   │   └── Productos.kt               # Sistema de gestión de productos
│   ├── ejercicio2/
│   │   └── GestionTareas.kt           # Sistema de gestión de tareas
│   ├── ejercicio3/
│   │   └── SistemaHospitalario.kt     # Sistema de gestión hospitalaria
│   ├── programacionfuncional/
│   │   └── Documento2.kt              # Funciones de ámbito y refactorización
│   └── Main.kt
├── .gitignore
├── kotlin-practica-profundizacion.iml
└── README.md
```

---

## 💡 **Conceptos de Kotlin Aplicados**

### **Modelado de Datos**
`data class` · `enum class` · `sealed class` · `open class` · herencia · `override`

### **Null Safety**
`String?` · `?.let` · operador Elvis `?:` · smart cast con `is`

### **Colecciones**
`filter` · `map` · `groupBy` · `mapValues` · `sumOf` · `maxByOrNull` · `minByOrNull` · `removeIf` · `joinToString` · `average`

### **Funciones**
Funciones de extensión · funciones de ámbito (`apply`, `let`, `also`, `with`, `run`) · parámetros con valor por defecto · lambdas · `it` · destructuring

---

## 🚀 **Cómo Ejecutar**

### **Desde IntelliJ IDEA (Recomendado)**
1. Abre el proyecto en IntelliJ IDEA
2. Navega al archivo del ejercicio que deseas ejecutar
3. Haz clic en el **▶️ verde** junto a `fun main()`
4. O presiona **Shift + F10**

### **Desde Terminal**
```bash
# Ejemplo para cualquier ejercicio
kotlinc src/ejercicio1/Productos.kt -include-runtime -d Ejercicio1.jar
java -jar Ejercicio1.jar
```

### **En línea**
Copia el código en: [https://play.kotlinlang.org/](https://play.kotlinlang.org/)

---

## 🛠️ **Stack Tecnológico**

<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  &nbsp;
  <img src="https://img.shields.io/badge/JDK-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  &nbsp;
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" />
</div>

---

## 🎓 **Información Académica**

**Curso:** Construcción de Aplicaciones Móviles  
**Programa:** Ingeniería de Sistemas y Computación  
**Universidad:** Universidad del Quindío  
**Docente:** Carlos Andrés Florez V.  
**Fecha:** Febrero 2026

---

## 👨‍💻 **Desarrolladores**

<div align="center">

---
**Juan David Gutierrez**
---
**Eliana Hernandez Ortiz**
---

**Santiago Arbelaez Contreras**  
Junior Full Stack Developer  
Estudiante de Ingeniería de Sistemas – Universidad del Quindío

<br>

<a href="https://github.com/santiagoarbelaezc">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
</a>
&nbsp;
<a href="https://www.linkedin.com/in/santiago-arbelaez-contreras-9830b5290/">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" />
</a>
&nbsp;
<a href="https://portfolio-santiagoa.web.app/portfolio">
  <img src="https://img.shields.io/badge/Portfolio-6C63FF?style=for-the-badge&logo=sparkles&logoColor=white" />
</a>

</div>

---

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=90&section=footer&animation=fadeIn" />
</div>
