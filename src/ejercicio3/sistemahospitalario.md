<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">🏥 Kotlin - Sistema de Gestión Hospitalaria</h1>
<h3 align="center">🧬 Herencia, Funciones de Extensión y Operaciones con Colecciones</h3>

<p align="center">
  Ejercicio práctico en <strong>Kotlin</strong> que modela un sistema hospitalario completo.<br>
  Aplica herencia con <code>open class</code>, encapsulación, funciones de extensión y operaciones avanzadas sobre colecciones.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este ejercicio implementa un sistema de gestión hospitalaria en **Kotlin**, donde médicos y pacientes heredan de una clase base `Persona`. El hospital encapsula sus listas con acceso controlado y expone operaciones como calcular salarios por especialidad, encontrar el médico más antiguo y filtrar registros mediante funciones de extensión.

---

## ✨ **Características Implementadas**

- ✅ `enum class` para `Genero` y `Especialidad`
- ✅ `data class Direccion` para composición de objetos
- ✅ `open class Persona` como clase base heredable
- ✅ `class Medico` y `class Paciente` con herencia y `override toString()`
- ✅ Funciones de extensión: `List<Medico>.filtrarPorEspecialidad()` y `List<Paciente>.filtrarPorCiudad()`
- ✅ Encapsulación con listas `private` y getters que retornan copias inmutables con `toList()`
- ✅ `removeIf` para eliminar por condición
- ✅ `groupBy`, `mapValues` y `sumOf` para salarios por especialidad
- ✅ `minByOrNull` para encontrar el médico más antiguo
- ✅ `String.format` para formato de moneda

---

## 💡 **Conceptos de Kotlin Aplicados**

- ✅ Herencia con `open class` y constructores primarios
- ✅ Llamada al constructor padre con `: Persona(...)`
- ✅ Override de métodos con `override fun toString()`
- ✅ Funciones de extensión sobre listas tipadas
- ✅ `this` dentro de funciones de extensión
- ✅ `ignoreCase = true` en comparaciones de strings
- ✅ Encapsulación `private` con getters controlados
- ✅ `removeIf`, `minByOrNull`, `groupBy`, `mapValues`, `sumOf`
- ✅ Null safety con `String?` y verificación con `!= null`
- ✅ `String.format("%,.0f", ...)` para formato numérico

---

## 📊 **Salida del Programa**

```
🏥 SISTEMA DE GESTIÓN HOSPITALARIA
======================================================================

➕ AGREGANDO MÉDICOS:
----------------------------------------------------------------------
✅ Médico agregado: Carlos Pérez
✅ Médico agregado: Ana López
...

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

## 🚀 **Cómo Ejecutar**

### **Opción 1: IntelliJ IDEA (Recomendado)**
1. Abre el archivo `SistemaHospitalario.kt` en `src/ejercicio3/`
2. Haz clic en el **▶️ verde** junto a `fun main()`
3. O presiona **Shift + F10**

### **Opción 2: Terminal**
```bash
kotlinc src/ejercicio3/SistemaHospitalario.kt -include-runtime -d SistemaHospitalario.jar
java -jar SistemaHospitalario.jar
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
