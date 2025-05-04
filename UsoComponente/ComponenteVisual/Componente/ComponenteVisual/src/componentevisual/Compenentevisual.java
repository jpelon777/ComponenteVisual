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

public class Compenentevisual extends JLabel implements MouseListener {
    
    
    private String textoInicial = " " + "?" + " ";
    private String textoTooltip = " Aquí debes de colocar una contraseña ";
    private Color colorFondoTooltip = Color.YELLOW;  

    public Compenentevisual() {
        this.setText(textoInicial);
        this.setOpaque(true);
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
        this.setFont(new Font("Arial", Font.PLAIN, 14));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        addMouseListener(this);
    }

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
    public void mouseEntered(MouseEvent e) {
        this.setBackground(colorFondoTooltip); 
        this.setForeground(Color.black);
        this.setFont(new Font("Tahoma", Font.PLAIN, 10));
        this.setText(textoTooltip);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
        this.setText(textoInicial);
        this.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
}


