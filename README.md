# ComponenteVisual
Componente visual que sirve como apoyo visual para el usuario al momento de rellanar campos

##  Capturas de pantalla

![Captura 1](capturas/Captura%20de%20pantalla%20(1).png)
![Captura 2](capturas/Captura%20de%20pantalla%20(2).png)
![Captura 3](capturas/Captura%20de%20pantalla%20(3).png)
![Captura 4](capturas/Captura%20de%20pantalla%20(4).png)
![Captura 5](capturas/Captura%20de%20pantalla%20(5).png)
![Captura 6](capturas/Captura%20de%20pantalla%20(6).png)


##  Breve explicación del componente

`Compenentevisual_2` es un componente visual personalizado basado en `JLabel` que actúa como un ícono interactivo. Su propósito es proporcionar una sugerencia visual al usuario, mostrando un mensaje tipo *tooltip* al pasar el cursor encima. Este componente es útil en interfaces gráficas donde se requiera ofrecer ayuda contextual de forma intuitiva.

---

##  Métodos y propiedades más relevantes

// Se actualiza el texto visible
public void setTextoInicial(String textoInicial) { ... }

// Define el mensaje de ayuda
public void setTextoTooltip(String textoTooltip) { ... }

// Define el color de fondo al mostrar ayuda
public void setColorFondoTooltip(Color colorFondoTooltip) { ... }

// Evento cuando el mouse entra
public void mouseEntered(MouseEvent e) {
    this.setBackground(colorFondoTooltip);
    this.setText(textoTooltip);
    ...
}

// Evento cuando el mouse sale
public void mouseExited(MouseEvent e) {
    this.setBackground(Color.darkGray);
    this.setText(" " + textoInicial + " ");
    ...
}

## Intrucciones de uso

Al tener tu frame donde se requiera nuestro componente, desplazate a la paleta de elementos y da clic derecho, se mostrara un menu desplegable.
Selecciona la opcion de palette manager o administrador de paleta
Selecciona Add from JAR o Añadir desde JAR
Ahora busca la ubicacion de nuestro archivo JAR, aceptas y listo, quedo añadido a tu paleta como acceso directo

## Miembros del equipo

Poblete Hernandez Jhonatan Ivan 🤓
Perez Ramirez Omar Konk 🥸

## Video demostrativo

https://youtu.be/XDklru3ZMkA

