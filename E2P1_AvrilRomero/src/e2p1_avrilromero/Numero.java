/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_avrilromero;

/**
 *
 * @author rodge
 */
class Numero {

    String num;
    int base;

    public Numero(int numN, int baseN) {
        this.base = baseN;
        this.num = decToBase(numN);

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public char numToChar(int num) {
        char caracter = '"';
        if (num >= 0 && num <= 9) {
            caracter = (char) (num + 48);
        } else if (num >= 10 && num <= 35) {
            caracter = (char) (num + 87);
        }
        return caracter;
    }

    public int charToNum(char c) {
        int num = 0;
        if ((int) c >= 0 && (char) c <= 9) {
            num = (int) (c - 48);
        } else if (num >= 10 && num <= 35) {
            num = (int) (num - 87);
        }
        return num;
    }

    public String decToBase(int num) {
        String base2 = "";
        int rem = num / base;
        int sobrante = num % base;

        if (rem == 1) {
            base2 = (numToChar(rem)) + base2;
        } else {
            while (rem > base) {
                base2 = (numToChar(sobrante)) + base2;
                sobrante = rem % base;
                rem = rem / base;
            }
            base2 = (numToChar(sobrante)) + base2;
            base2 = (numToChar(rem)) + base2;
        }
        return base2;
    }

    public int baseToDec(String cadena) {
        int decimal = 0;
        for (int i = 0; i < cadena.length(); i++) {
            int temporal = cadena.charAt(cadena.length() - 1);
            double exponente = Math.pow((double) temporal, (double) i);
            decimal += exponente;
        }
        return decimal;
    }
}
