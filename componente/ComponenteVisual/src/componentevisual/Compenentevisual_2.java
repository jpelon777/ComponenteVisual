/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentevisual;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Compenentevisual_2 extends JLabel implements MouseListener {
    
    private String textoInicial = "?" ; // El signo de interrogacion es una sugerencia basica para representar dudas
    private String textoTooltip = " Aquí debes de colocar una contraseña "; // Este es el mensaje que se mostrara al poner el puntero encima
    private Color colorFondoTooltip = Color.YELLOW;  // Esto representa el fondo del mensaje, el usuario la puede modificar

    public Compenentevisual_2() { //Aqui establecemos la apariencia predefinida de nuestro componente
        this.setText(" " + textoInicial+ " ");
        this.setOpaque(true);
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
        this.setFont(new Font("Arial", Font.PLAIN, 14));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        addMouseListener(this);
    }

    // Metodos getters y setters para hacer modificaciones
    public String getTextoInicial() {
        return textoInicial;
    }

    public void setTextoInicial(String textoInicial) {
        this.textoInicial = textoInicial;
        setText(textoInicial);
    }

    public String getTextoTooltip() {
        return textoTooltip;
    }

    public void setTextoTooltip(String textoTooltip) {
        this.textoTooltip = textoTooltip;
    }

    public Color getColorFondoTooltip() {
        return colorFondoTooltip;
    }

    public void setColorFondoTooltip(Color colorFondoTooltip) {
        this.colorFondoTooltip = colorFondoTooltip;
    }

    @Override
    public void mouseEntered(MouseEvent e) { // Cambios que se realizan al colocar encima el puntero del mouse
        this.setBackground(colorFondoTooltip); 
        this.setForeground(Color.black);
        this.setFont(new Font("Tahoma", Font.PLAIN, 10));
        this.setText(textoTooltip);
    }

    @Override
    public void mouseExited(MouseEvent e) { // El componente regresara a su estado original al quitar el puntero
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
        this.setText(" " + textoInicial+ " ");
        this.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
}


