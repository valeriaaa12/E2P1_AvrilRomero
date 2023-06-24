/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_avrilromero;

import java.util.ArrayList;

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
        int num1 = 0;
        if ((int) c >= 48 && (int) c <= 57) {
            num1 = (c - 48);
        } else if ((int) c >= 97 && (int) c <= 122) {
            num1 = (c - 87);
        }
        return num1;
    }

    public String decToBase(int num) {
        String base2 = "";
        int rem = num;
        if (rem == 0) {
            base2 = "0";
        } else {
            while (rem > 0) {
                int sobrante = rem % base;
                base2 = numToChar(sobrante) + base2;
                rem = rem / base;
            }
        }
        return base2;
    }

    public int baseToDec(String num,int base) {
         int decimal = 0;
        for (int i = 0; i < num.length(); i++) {
            decimal += charToNum(num.charAt(i))*Math.pow((double) base, (double) (num.length() - i-1 ));
        }
        return decimal;
    }

    @Override
    public String toString() {
        return  num ;
    }
    

}
