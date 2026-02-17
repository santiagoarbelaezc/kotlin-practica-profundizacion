<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">📋 Kotlin - Sistema de Gestión de Tareas</h1>
<h3 align="center">🔖 Sealed Classes, Enums y Operaciones con Colecciones</h3>

<p align="center">
  Ejercicio práctico en <strong>Kotlin</strong> que modela un sistema de tareas con prioridades y estados.<br>
  Aplica <code>sealed class</code>, <code>enum class</code>, <code>data class</code> y operaciones funcionales sobre listas.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este ejercicio implementa un sistema de gestión de tareas en **Kotlin**, donde cada tarea tiene un nivel de prioridad definido por un `enum` y un estado representado por una `sealed class`. Se aplican operaciones funcionales encadenadas sobre una `MutableList` para filtrar, agrupar y analizar las tareas.

---

## ✨ **Características Implementadas**

- ✅ `enum class Prioridad` con propiedad `nivel: Int` (BAJA, MEDIA, ALTA, CRÍTICA)
- ✅ `sealed class EstadoTarea` con subclases `object` y `data class`
- ✅ `data class Tarea` con propiedad nullable `descripcion: String?`
- ✅ `when` exhaustivo con smart cast sobre sealed class
- ✅ Filtrado de tareas urgentes no canceladas con `filter`
- ✅ Agrupación y conteo por estado con `groupBy`
- ✅ Búsqueda de tarea prioritaria con `maxByOrNull`
- ✅ Destructuring de `data class` en variables y en lambdas con `_`

---

## 💡 **Conceptos de Kotlin Aplicados**

- ✅ `enum class` con propiedades personalizadas
- ✅ `sealed class` con subtipos `object` y `data class`
- ✅ Smart cast automático dentro de ramas `is`
- ✅ Null safety con `String?` y operador `?.`
- ✅ `MutableList` y `mutableListOf`
- ✅ `filter`, `groupBy`, `maxByOrNull`, `forEach`
- ✅ Destructuring declarations con `val (a, b, c) = objeto`
- ✅ Uso de `_` para ignorar propiedades en destructuring
- ✅ Encadenamiento de funciones (method chaining)
- ✅ `it` como referencia implícita en lambdas

---

## 📊 **Salida del Programa**

```
======================================================================
SISTEMA DE GESTIÓN DE TAREAS
======================================================================

📋 TODAS LAS TAREAS:
----------------------------------------------------------------------
📌 Implementar autenticación [CRITICA] -> 🔄 EN PROGRESO - Avance: 75%
📌 Diseñar base de datos [ALTA] -> ✅ COMPLETADA - Finalizada el 2025-02-15
📌 Escribir documentación [MEDIA] -> ⏳ PENDIENTE - Aún no iniciada
📌 Configurar CI/CD [ALTA] -> 🔄 EN PROGRESO - Avance: 40%
📌 Actualizar dependencias [BAJA] -> ❌ CANCELADA - Razón: Pospuesto para siguiente sprint
📌 Optimizar consultas SQL [CRITICA] -> ⏳ PENDIENTE - Aún no iniciada

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

---

## 🚀 **Cómo Ejecutar**

### **Opción 1: IntelliJ IDEA (Recomendado)**
1. Abre el archivo `GestionTareas.kt` en `src/ejercicio2/`
2. Haz clic en el **▶️ verde** junto a `fun main()`
3. O presiona **Shift + F10**

### **Opción 2: Terminal**
```bash
kotlinc src/ejercicio2/GestionTareas.kt -include-runtime -d GestionTareas.jar
java -jar GestionTareas.jar
```

### **Opción 3: En línea**
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

## 👨‍💻 **Desarrollador**

<div align="center">

**Santiago Arbelaez Contreras**  
Junior Full Stack Developer  
Estudiante de Ingeniería de Sistemas – Universidad del Quindío

<br>

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
