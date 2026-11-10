# Guion · Lección 4: Entrada por consola y métodos (10 min)

**Objetivo:** interactuar con el usuario mediante la clase `Scanner` y encapsular lógica en métodos reutilizables con parámetros y retorno.
**Editor:** OnlineGDB (`starter-files/lesson-4`).
**Recurso visual:** analogía de una máquina expendedora (entra una moneda y un código, sale una bebida) para explicar métodos con parámetros y retorno.

| Tiempo | Pantalla / Texto en pantalla | Narración (voz en off) |
|---|---|---|
| 0:00 – 1:20 | Demostración: la consola pregunta "¿Cómo te llamas?" y el narrador escribe su respuesta. Texto: **"Programas interactivos"** | "Hasta este momento nosotros escribíamos los datos directamente dentro del código antes de darle 'Run'. Pero las aplicaciones reales interactúan con nosotros: te piden tu correo, tu contraseña o los números que quieres sumar. Hoy vamos a hacer que tu programa escuche lo que escribes en el teclado." |
| 1:20 – 3:30 | En OnlineGDB se resalta `import java.util.Scanner;`. Se escribe `Scanner lector = new Scanner(System.in);`. | "Para recibir datos usamos una herramienta que viene con Java llamada `Scanner`. Primero la importamos arriba del archivo. Luego creamos nuestro lector y usamos `lector.nextLine()` para leer una frase completa de texto, o `lector.nextInt()` para leer un número entero. Observa: el programa se detiene y espera a que nosotros escribamos en la consola antes de continuar." |
| 3:30 – 6:00 | Se dibuja una caja con entrada y salida. Luego en el código se define: `public static int sumar(int a, int b)`. | "Ahora hablemos de orden. A medida que un programa crece, no queremos tener cientos de líneas amontonadas en un solo sitio. Un método es un bloque de código con un nombre que hace una tarea específica. Piensa en una licuadora: le metes frutas (parámetros), hace su trabajo y te devuelve un jugo (retorno). Aquí creamos un método `sumar` que recibe dos números y nos devuelve el resultado con la palabra `return`." |
| 6:00 – 7:30 | El narrador invoca `sumar(numero1, numero2)` dentro del `main` y muestra el resultado en pantalla. | "Mira qué limpio queda nuestro `main`: le pedimos al usuario dos números con el `Scanner`, llamamos a nuestro método `sumar` pasándole esos valores y mostramos el resultado. Si mañana quisiéramos sumar otros diez números, solo volvemos a llamar al método sin tener que reinventar la rueda." |
| 7:30 – 8:45 | Ícono ⏸️ en pantalla grande. Texto: **"Pausa y practica: crea una calculadora básica"** | "Hora de practicar. Abre OnlineGDB desde el enlace abajo. En el código incompleto, crea un método que reciba dos números y devuelva la multiplicación. Luego pide los números con `Scanner` e imprime el resultado. Ponle pausa al video y pruébalo." |
| 8:45 – 10:00 | Tarjeta con resumen: `Scanner` para entrada, métodos para reutilizar. | "Con esto tu código ya es interactivo y modular. En la próxima sesión llegamos al corazón de Java: la Programación Orientada a Objetos, donde aprenderemos a modelar personajes, mascotas y objetos reales dentro de nuestro código." |

**Notas de producción**
* Mostrar claramente la ventana interactiva inferior de OnlineGDB donde el usuario debe hacer clic para tipear los números.
* Señalar con flechas en postproducción el viaje que hacen los datos desde el teclado hacia las variables del método.
