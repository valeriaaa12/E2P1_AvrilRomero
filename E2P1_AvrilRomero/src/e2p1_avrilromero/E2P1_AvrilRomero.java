/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2p1_avrilromero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rodge
 */
public class E2P1_AvrilRomero extends JFrame {

    /**
     * @param args the command line arguments
     */
    //valor base: entre 2-35
    //valor de numero: mayor a 1
    static JButton boton1 = new JButton("1.Numeros");
    static JButton boton2 = new JButton("2.Operaciones");
    static JButton boton3 = new JButton("Salida");
    static JLabel titulo = new JLabel("Ingrese una opcion: ");
    static JPanel panel = new JPanel();
    static Scanner Leer = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public E2P1_AvrilRomero() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBackground(Color.BLACK);
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(195, 50, 200, 100);
        panel.add(titulo);
        boton1.setBounds(175, 150, 150, 50);
        boton1.setForeground(Color.WHITE);
        boton1.setBackground(Color.gray);
        panel.add(boton1);
        boton2.setBounds(175, 250, 150, 50);
        boton2.setForeground(Color.WHITE);
        boton2.setBackground(Color.gray);
        panel.add(boton2);
        boton3.setBounds(175, 350, 150, 50);
        boton3.setForeground(Color.WHITE);
        boton3.setBackground(Color.gray);
        panel.add(boton3);
        ActionListener escuchador = (ActionEvent e) -> {
            if (e.getSource() == boton1) {
                boolean seguir = true;
                while (seguir) {
                    System.out.println("-Menu Numeros-");
                    System.out.println("1.Agregar Numero");
                    System.out.println("2.Eliminar Numero");
                    System.out.println("3.Menu Principal");
                    System.out.println("Ingrese una opcion: ");
                    int op = Leer.nextInt();
                    switch (op) {
                        case 1: {
                            System.out.println("Ingrese su numero en decimal: ");
                            int dec = sc.nextInt();
                            System.out.println("Ingrese su base: ");
                            int base = Leer.nextInt();
                            boolean valid = Validacion(dec, base);
                            if (valid == true) {
                                Numero n = new Numero(dec, base);
                                System.out.println(n.getNum());
                            } else {
                                System.out.println("Los valores deben ser correctos");
                            }

                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {
                            seguir = false;
                        }
                        break;
                    }
                }
            } else if (e.getSource() == boton2) {

            } else if (e.getSource() == boton3) {
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(escuchador);
        boton2.addActionListener(escuchador);
        boton3.addActionListener((event) -> System.exit(0));

    }

    public static void main(String[] args) {
        E2P1_AvrilRomero ventana = new E2P1_AvrilRomero();
        ventana.setVisible(true);
    }

    public static boolean Validacion(int num, int base) {
        boolean valid = false;
        if (base >= 2 && base <= 35 && num > 1) {
            valid = true;
        }
        return valid;
    }

}
