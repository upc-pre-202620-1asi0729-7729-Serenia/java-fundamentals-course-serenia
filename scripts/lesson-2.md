# Guion · Lección 2: Variables y tipos de datos (9 min)

**Objetivo:** comprender el concepto de variable en memoria y usar los tipos primitivos más comunes (`int`, `double`, `boolean`) junto con `String`.
**Editor:** Replit (`starter-files/lesson-2`).
**Recurso visual:** cajas etiquetadas con formas distintas según el tipo de objeto que guardan (números, texto, interruptor ON/OFF).

| Tiempo | Pantalla / Texto en pantalla | Narración (voz en off) |
|---|---|---|
| 0:00 – 1:20 | Captura de pantalla de la ficha de un videojuego (nombre, nivel, monedas, vida). Texto: **"¿Dónde guarda datos el juego?"** | "Cuando juegas una partida, el juego recuerda en todo momento tu nombre de usuario, cuántas monedas tienes y si sigues con vida. Si la computadora no pudiera recordar esos datos, tendrías que empezar de cero cada segundo. Para guardar información en la memoria usamos lo que llamamos 'variables'." |
| 1:20 – 3:00 | Animación de 4 cajas con etiquetas: `String`, `int`, `double`, `boolean`. | "Imagina que una variable es una caja con una etiqueta. En Java, las cajas son ordenadas: tienes que avisarle de antemano qué vas a guardar dentro. Si quieres texto, usas `String`. Para números enteros como tu edad o nivel, usas `int`. Para números con decimales, como el precio o el porcentaje, usas `double`. Y para cosas que solo pueden ser verdaderas o falsas, usamos `boolean`, como si fuera un interruptor." |
| 3:00 – 5:00 | En Replit se muestra el archivo `PerfilGamer.java`. Se escribe en vivo: `String alias = "PixelMaster"; int nivel = 1;` | "Vamos a la práctica. En nuestro editor creamos el perfil de un jugador. Escribimos primero el tipo: `String`, luego el nombre de la caja: `alias`, y le asignamos un valor entre comillas con el signo igual. Abajo declaramos `int nivel = 1;` y `double monedas = 250.50;`. Mira cómo podemos combinar texto y variables dentro de un `println` usando el signo de suma para conectarlos." |
| 5:00 – 6:15 | En pantalla se modifica `nivel = nivel + 1;` y se vuelve a ejecutar. | "Las variables se llaman así porque su valor puede cambiar mientras corre el programa. Si nuestro jugador sube de nivel, decimos: `nivel = nivel + 1;`. Fíjate que aquí ya no repetimos la palabra `int`, porque la caja ya fue creada antes; solo estamos cambiando lo que tiene dentro." |
| 6:15 – 7:30 | Ícono ⏸️ en pantalla grande. Texto: **"Pausa y practica: completa tu perfil de jugador"** | "Hora de programar. Pausa el video, abre el starter file de la lección 2 y crea tus propias variables: pon tu apodo, asígnate un puntaje inicial y crea una variable `boolean` llamada `cuentaActiva` en `true`. Imprime todo en consola para comprobar que funcione." |
| 7:30 – 9:00 | Tarjetas de resumen en pantalla con los 4 tipos de datos. | "Hoy dominamos las variables: las cajas donde tus programas guardan información importante. Recuerda: `String` para texto, `int` para enteros, `double` para decimales y `boolean` para sí o no. En la siguiente lección aprenderemos a tomar decisiones según los valores de esas variables." |

**Notas de producción**
* Resaltar con colores los diferentes tipos de datos durante la explicación teórica.
* Mantener el tamaño de fuente en Replit al menos en 18px.
