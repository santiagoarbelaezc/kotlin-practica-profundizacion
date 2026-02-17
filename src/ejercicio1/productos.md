<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">🛒 Kotlin - Sistema de Gestión de Productos</h1>
<h3 align="center">📦 Ejercicio con Funciones de Extensión y Data Classes</h3>

<p align="center">
  Ejercicio práctico implementado en <strong>Kotlin</strong> que modela un inventario de productos.<br>
  Aplica funciones de extensión, <code>data class</code>, lambdas y operaciones con colecciones.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este ejercicio implementa un sistema de inventario de productos en **Kotlin**, diseñado para practicar características clave del lenguaje como funciones de extensión, `data class`, operaciones sobre listas y el uso de `trimIndent()` para formateo de strings multilínea.

---

## ✨ **Características Implementadas**

- ✅ `data class Producto` con nombre, precio y cantidad
- ✅ Función de extensión `Producto.valorTotal()` para calcular el valor total por producto
- ✅ Función de extensión `List<Producto>.resumen()` para generar un resumen del inventario
- ✅ Función `aplicarDescuento()` que retorna una copia modificada del producto con `copy()`
- ✅ Uso de `sumOf`, `joinToString` y string templates con `$` y `$$`
- ✅ Uso de `trimIndent()` para limpiar indentación en strings multilínea

---

## 💡 **Conceptos de Kotlin Aplicados**

- ✅ `data class` y método `copy()`
- ✅ Funciones de extensión sobre clases y listas
- ✅ Lambdas con `it` y parámetros nombrados (`p ->`)
- ✅ `sumOf` para acumulación numérica
- ✅ `joinToString` para formatear colecciones
- ✅ Interpolación de strings con `$variable` y `$$` para el símbolo `$`
- ✅ `trimIndent()` para strings multilínea limpios
- ✅ Parámetros con valor por defecto (`porcentaje: Double = 10.0`)

---

## 📊 **Salida del Programa**

```
Inventario (5 productos):
* Laptop: $2500.0 x 2 = $5000.0
* Mouse: $72.0 x 5 = $360.0
* Teclado: $150.0 x 3 = $450.0
* Monitor: $900.0 x 1 = $900.0
* Audifonos: $160.0 x 4 = $640.0
Total inventario: $7350.0
```

---

## 🚀 **Cómo Ejecutar**

### **Opción 1: IntelliJ IDEA (Recomendado)**
1. Abre el archivo `Productos.kt`
2. Haz clic en el **▶️ verde** junto a `fun main()`
3. O presiona **Shift + F10**

### **Opción 2: Terminal**
```bash
kotlinc Productos.kt -include-runtime -d Productos.jar
java -jar Productos.jar
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

**Juan David Gutierrez**  
Estudiante de Ingeniería de Sistemas – Universidad del Quindío

</div>

---

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=90&section=footer&animation=fadeIn" />
</div>