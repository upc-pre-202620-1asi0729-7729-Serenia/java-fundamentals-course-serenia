# Guion · Lección 6: Buenas prácticas y depuración (8 min)

**Objetivo:** aprender a leer mensajes de error del compilador, corregir los 3 fallos más típicos de principiantes y conocer cómo seguir aprendiendo.
**Editor:** Replit / OnlineGDB (`starter-files/lesson-6`).
**Recurso visual:** lupa de detective sobre líneas de código marcadas con subrayado rojo y la consola con trazas de error.

| Tiempo | Pantalla / Texto en pantalla | Narración (voz en off) |
|---|---|---|
| 0:00 – 1:15 | Pantalla con texto de error en rojo en la consola. Texto: **"El compilador no te odia: te ayuda"** | "A todos los programadores del mundo, desde el que recién empieza hasta el que trabaja en la NASA, les salen errores en la pantalla todos los días. Equivocarse es completamente normal. El compilador no está molesto contigo: es solo un asistente estricto que te avisa exactamente en qué línea no entendió lo que quisiste decir. Hoy aprenderemos a ser detectives de nuestro propio código." |
| 1:15 – 3:00 | Se abre `CodigoError.java`. Se da clic a Run. Aparece: `error: ';' expected`. Se soluciona en vivo. | "Vamos a nuestro archivo de práctica. Le damos 'Run' y salta el primer mensaje: 'error: semicolon expected' en la línea 4. Este es el clásico punto y coma olvidado. Java te dice la línea exacta donde se quedó esperando el cierre de la instrucción. Lo agregamos al final, ejecutamos de nuevo y pasamos al siguiente reto." |
| 3:00 – 4:45 | Se resalta la línea con `int edad = "15";`. Mensaje de error: `incompatible types`. Se remueven las comillas. | "Segundo error común: confusión de tipos. En la línea 7 declaramos un `int` para guardar la edad, pero le pusimos comillas dobles. Recuerda: para Java las comillas significan texto, así que no puede meter una palabra dentro de una caja de números enteros. Le quitamos las comillas dejando solo el número 15, y problema resuelto." |
| 4:45 – 6:00 | Se resalta `system.out.println`. Mensaje: `package system does not exist`. Se cambia la 's' por mayúscula. | "Tercer error: mayúsculas y minúsculas. Java es muy sensible con esto. Si escribes `system` con 's' minúscula, no sabrá qué es, porque la clase original se llama `System` con 'S' mayúscula. Es como escribir mal el apellido de alguien. Cambiamos esa letra a mayúscula, corremos el programa y… ¡código limpio y funcionando al 100%!" |
| 6:00 – 7:15 | Ícono ⏸️ en pantalla grande. Texto: **"Pausa y practica: caza los errores por tu cuenta"** | "Ahora es tu turno de ser el detective. Abre el archivo de depuración del enlace en la descripción, lee las pistas en los comentarios y corrige el código hasta que la consola muestre el mensaje de éxito sin ningún aviso rojo." |
| 7:15 – 8:00 | Pantalla final con mapa de ruta de aprendizaje y enlace al formulario de retroalimentación. | "¡Has completado el curso introductorio de Java! Aprendiste qué es programar, variables, decisiones, bucles, métodos, Programación Orientada a Objetos y cómo solucionar errores. En la descripción tienes el enlace para enviar tu proyecto final y seguir practicando. ¡Mucho éxito en tu camino como desarrollador!" |

**Notas de producción**
* Mostrar primeros planos de los mensajes de la consola cuando sale un error antes de explicar la solución.
* Mantener una actitud motivadora para quitarle el miedo al error de compilación.
