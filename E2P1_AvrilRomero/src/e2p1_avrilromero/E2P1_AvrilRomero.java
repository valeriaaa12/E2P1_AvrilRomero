/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2p1_avrilromero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    ArrayList<Numero> lista = new ArrayList<>();
    Numero num1;
    Numero num2;
    int resultado = 0;

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
                            AgregarNumero(lista);
                        }
                        break;
                        case 2: {
                            ImprimirLista(lista);
                            System.out.println("Ingresse el indice del numero que desea eliminar");
                            int num = Leer.nextInt();
                            EliminarLista(lista, num);
                        }
                        break;
                        case 3: {
                            seguir = false;
                            System.out.println("------------------------------");
                            System.out.println("Ha salido del submenu");
                        }
                        break;
                    }
                }
            } else if (e.getSource() == boton2) {
                boolean seguir2 = true;
                while (seguir2) {
                    System.out.println("-Menu Operaciones-");
                    System.out.println("1.Sumar Numeros");
                    System.out.println("2.Restar Numeros");
                    System.out.println("3.Multiplicar Numeros");
                    System.out.println("4.Menu Principal");
                    int opcion = Leer.nextInt();
                    switch (opcion) {
                        case 1: {
                            System.out.println("Ingrese el indice del primer numero: ");
                            int indice1 = Leer.nextInt();
                            if (indice1 <= 0 || indice1 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            System.out.println("Ingrese el indice del segundo numero: ");
                            int indice2 = Leer.nextInt();
                            if (indice2 <= 0 || indice2 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            num1 = lista.get(indice1 - 1);
                            num2 = lista.get(indice2 - 1);
                            resultado = num1.baseToDec(num1.getNum(), num1.getBase()) + num2.baseToDec(num2.getNum(), num2.getBase());
                            int base1;
                            if (num1.getBase() > num2.getBase()) {
                                base1 = num1.getBase();
                            } else {
                                base1 = num2.getBase();
                            }
                            Numero result = new Numero(resultado, base1);
                            System.out.println("El resultado de " + result.toString() + " con base " + base1 + " : " + resultado);

                        }
                        break;

                        case 2: {
                            System.out.println("Ingrese el indice del primer numero: ");
                            int indice1 = Leer.nextInt();
                            if (indice1 <= 0 || indice1 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            System.out.println("Ingrese el indice del segundo numero: ");
                            int indice2 = Leer.nextInt();
                            if (indice2 <= 0 || indice2 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            num1 = lista.get(indice1 - 1);
                            num2 = lista.get(indice2 - 1);
                            resultado = num1.baseToDec(num1.getNum(), num1.getBase()) - num2.baseToDec(num2.getNum(), num2.getBase());
                            int base1;
                            if (num1.getBase() > num2.getBase()) {
                                base1 = num1.getBase();
                            } else {
                                base1 = num2.getBase();
                            }
                            if (resultado < 0) {
                                System.out.println("El resultado es un valor negativo ");
                                Numero result = new Numero(resultado, base1);
                                System.out.println("El resultado de: " + result.toString() + " con base " + base1 + " : " + resultado);
                            } else {
                                Numero result = new Numero(resultado, base1);
                                System.out.println("El resultado de: " + result.toString() + " con base " + base1 + " : " + resultado);
                            }
                        }
                        break;
                        case 3: {
                            System.out.println("Ingrese el indice del primer numero: ");
                            int indice1 = Leer.nextInt();
                            if (indice1 <= 0 || indice1 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            System.out.println("Ingrese el indice del segundo numero: ");
                            int indice2 = Leer.nextInt();
                            if (indice2 <= 0 || indice2 > lista.size()) {
                                System.out.println("Indice no valido");
                                break;
                            }
                            num1 = lista.get(indice1 - 1);
                            num2 = lista.get(indice2 - 1);
                            resultado = num1.baseToDec(num1.getNum(), num1.getBase()) * num2.baseToDec(num2.getNum(), num2.getBase());
                            int base1;
                            if (num1.getBase() > num2.getBase()) {
                                base1 = num1.getBase();
                            } else {
                                base1 = num2.getBase();
                            }
                            Numero result = new Numero(resultado, base1);
                            System.out.println("El resultado de: " + result.toString() + " con base " + base1 + " : " + resultado);

                        }
                        break;
                        case 4: {
                            seguir2 = false;
                            System.out.println("Salio del submenu");
                        }
                        break;
                    }
                }
            } else if (e.getSource() == boton3) {
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(escuchador);

        boton2.addActionListener(escuchador);

        boton3.addActionListener(
                (event) -> System.exit(0));

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

    public ArrayList<Numero> AgregarNumero(ArrayList<Numero> lista) {
        System.out.println("Ingrese su numero : ");
        int dec = sc.nextInt();
        System.out.println("Ingrese su base: ");
        int base = Leer.nextInt();
        boolean valid = Validacion(dec, base);
        if (valid == true) {
            Numero n = new Numero(dec, base);
            lista.add(n);
            String decimal = n.decToBase(dec);
            System.out.println("El numero ha sido agregado exitosamente!");
        } else {
            System.out.println("Los numeros deben ser mayor que 1 con una base entre 2 y 35");
        }
        return lista;
    }

    public static void ImprimirLista(ArrayList<Numero> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Lista de numeros");
            System.out.print((i + 1) + " .");
            System.out.print(lista.get(i).getNum() + " con una base " + lista.get(i).getBase());
            System.out.println("");
        }
    }

    public static ArrayList<Numero> EliminarLista(ArrayList<Numero> lista, int listanum) {
        boolean found = false;
        for (int i = 0; i < lista.size(); i++) {
            if (listanum - 1 == i) {
                System.out.println("Ha eliminado el numero exitosamente!");
                lista.remove(i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("El numero que quiere eliminar no se encuentra");
        }
        return lista;
    }

}
