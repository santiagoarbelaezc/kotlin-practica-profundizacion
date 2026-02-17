<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=120&section=header&animation=fadeIn" />
</div>

<h1 align="center">⚡ Kotlin - Programación Funcional</h1>
<h3 align="center">🔧 Funciones de Ámbito y Refactorización Funcional</h3>

<p align="center">
  Ejercicio práctico en <strong>Kotlin</strong> que explora la programación funcional aplicada a un sistema de gestión de usuarios.<br>
  Incluye refactorización de código imperativo, funciones de ámbito y un ejemplo integrado de registro.<br>
  Proyecto académico - Universidad del Quindío
</p>

---

## 🎯 **Descripción General**

Este ejercicio implementa ejemplos prácticos de **programación funcional en Kotlin**, divididos en tres secciones: refactorización de código imperativo a funcional, uso de las cinco funciones de ámbito del lenguaje, y un sistema de registro de usuarios que las combina todas.

---

## 📚 **Secciones del Ejercicio**

### **🔁 1. Refactorización de Código Imperativo a Funcional**
Transformación de lógica imperativa usando operaciones funcionales:
- ✅ `map`, `filter` y encadenamiento de operaciones sobre listas
- ✅ `groupBy` y `mapValues` para agrupación y transformación
- ✅ `average()` para calcular promedios por grupo
- ✅ Procesamiento de estudiantes filtrados por nota aprobatoria

### **🧰 2. Funciones de Ámbito — Gestión de Usuarios**
Aplicación de las 5 funciones de ámbito de Kotlin sobre `data class Usuario`:

| Función | Uso en el ejercicio |
|--------|----------------------|
| `apply` | Inicializar y configurar propiedades del usuario |
| `let` | Validar y operar sobre valores nullables (`email?`) |
| `also` | Logging y auditoría sin modificar el objeto |
| `with` | Generar reporte de usuario accediendo a sus propiedades |
| `run` | Configurar y retornar un resultado validado (`PerfilUsuario`) |

### **🔗 3. Ejemplo Integrado — Sistema de Registro**
Combinación de todas las funciones de ámbito en una sola función `registrarUsuario()` que encadena `let → apply → also → run → with` para validar, construir, auditar y responder.

---

## 💡 **Conceptos de Kotlin Aplicados**

- ✅ `data class` con valores por defecto
- ✅ `MutableList` como propiedad de clase
- ✅ Funciones de ámbito: `apply`, `let`, `also`, `with`, `run`
- ✅ Null safety con `?.let` y el operador Elvis `?:`
- ✅ `map`, `filter`, `groupBy`, `mapValues`, `average`
- ✅ `joinToString` para formatear listas
- ✅ String templates y operadores ternarios con `if`
- ✅ Encadenamiento de funciones de ámbito

---

## 📊 **Fragmento de Salida del Programa**

```
=== FRAGMENTO A - Refactorización ===
Nombres originales: [ana, CARLOS,  beatriz , DAVID, elena]
Resultado (nombres con más de 4 letras): [Carlos, Beatriz, David, Elena]

1. USO DE apply - Inicialización de usuario:
Usuario creado: Usuario(nombre=Juan Pérez, email=juan.perez@example.com, ...)

2. USO DE let - Validación de email:
✓ Email válido: maria@example.com

3. USO DE also - Logging y auditoría:
📝 Auditoría: Usuario 'Carlos Ramírez' creado en el sistema

4. USO DE with - Generar reporte de usuario:
╔═══════════════════════════════════╗
║      REPORTE DE USUARIO          ║
╠═══════════════════════════════════╣
║ Nombre: Ana Martínez
...

=== EJEMPLO INTEGRADO - SISTEMA DE REGISTRO ===
📝 Registrando usuario: Pedro Sánchez
✓ Usuario 'Pedro Sánchez' registrado exitosamente con email pedro@example.com
✗ Registro rechazado: El usuario debe ser mayor de edad
✗ Registro rechazado: Email no proporcionado
```

---

## 🚀 **Cómo Ejecutar**

### **Opción 1: IntelliJ IDEA (Recomendado)**
1. Abre el archivo `Documento2.kt`
2. Haz clic en el **▶️ verde** junto a `fun main()`
3. O presiona **Shift + F10**

### **Opción 2: Terminal**
```bash
kotlinc Documento2.kt -include-runtime -d Documento2.jar
java -jar Documento2.jar
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

## 👩‍💻 **Desarrolladora**

<div align="center">

**Eliana Hernandez Ortiz**  
Estudiante de Ingeniería de Sistemas – Universidad del Quindío

</div>

---

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:667eea,100:764ba2&height=90&section=footer&animation=fadeIn" />
</div>