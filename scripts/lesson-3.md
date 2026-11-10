# Guion · Lección 3: Decisiones y bucles (11 min)

**Objetivo:** controlar el flujo de un programa mediante condicionales `if-else` y automatizar tareas repetitivas con bucles `for` y `while`.
**Editor:** JDoodle (`starter-files/lesson-3`).
**Recurso visual:** un camino con bifurcación (flecha izquierda o derecha) y una pista de carreras circular (vueltas con contador).

| Tiempo | Pantalla / Texto en pantalla | Narración (voz en off) |
|---|---|---|
| 0:00 – 1:30 | Escena de juego: "¿Quieres abrir la puerta roja o azul?". Texto: **"¿Cómo decide un programa?"** | "Hasta ahora nuestro código se ha ejecutado en línea recta, de arriba a abajo. Pero los programas reales son interesantes porque toman caminos diferentes según lo que suceda: si tu personaje tiene vida sigue jugando, y si llega a cero aparece la pantalla de fin de juego. Hoy aprenderemos a darle ese cerebro a tu código." |
| 1:30 – 4:00 | Editor JDoodle abierto con `TextoAventura.java`. Se escribe la estructura `if (energia >= 50)`. | "Para tomar decisiones usamos la palabra `if`, que en inglés significa 'si condicional'. Decimos: 'Si la energía es mayor o igual a 50, permite cruzar el puente'. Y con `else`, le decimos qué hacer en caso contrario. Mira cómo las llaves agrupan las acciones de cada decisión. Si cambio la variable `energia` a 20 y le doy a ejecutar, Java automáticamente se salta el primer bloque y ejecuta el segundo." |
| 4:00 – 6:15 | Animación de repetición. Luego en JDoodle se escribe un bucle `for (int i = 5; i >= 1; i--)`. | "¿Y qué pasa si queremos hacer algo varias veces? Por ejemplo, una cuenta regresiva para despegar un cohete. Escribir cinco veces `println` sería aburrido y poco eficiente. Para eso existen los bucles. El bucle `for` tiene tres partes: dónde empieza el contador, hasta cuándo se repite y cómo cambia en cada vuelta. Le damos ejecutar… ¡y cuenta del 5 al 1 en una milésima de segundo!" |
| 6:15 – 7:45 | Explicación visual del bucle `while`. Comparación con recolectar gemas hasta llegar a 3. | "También tenemos el bucle `while`, que significa 'mientras'. Este se repite mientras una condición siga siendo verdadera. Es como decir: 'mientras no tengas 3 llaves, sigue buscando en el mapa'. Cada vez que encuentras una llave, sumas uno hasta que la condición se cumple y el bucle termina." |
| 7:45 – 9:15 | Ícono ⏸️ en pantalla grande. Texto: **"Pausa y practica: sobrevive al laberinto"** | "Es tu turno. Abre el enlace de JDoodle de la descripción. Tienes un reto con un `if-else` donde debes evaluar si el jugador tiene una llave dorada para abrir un cofre. Luego, usa un bucle para simular 3 intentos de salto. ¡Pausa el video y pon a prueba tu lógica!" |
| 9:15 – 11:00 | Resumen en pantalla: diagrama de decisión `if` y flecha circular de bucle `for`. | "Con las decisiones y los bucles ya puedes crear juegos de texto interactivos y automatizar cálculos complejos. En el próximo video daremos un paso más: aprenderemos a pedirle datos al usuario en vivo y a organizar nuestro código en bloques llamados métodos." |

**Notas de producción**
* En JDoodle, seleccionar el tema oscuro y verificar que el botón de ejecución esté visible sin desplazarse.
* Enfatizar la sangría (indentación) dentro de las llaves para que los estudiantes se acostumbren a escribir código limpio.
