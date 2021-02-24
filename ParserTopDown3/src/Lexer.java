/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htref
 */
import java.util.Scanner;

public class Lexer {

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int EOF = 99;
    public static final int ERROR = -1;

    String inputString;
    int currentPos = 0;
    char lookahead;

    public Lexer() {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor entrar una expresión sin espacios: ");
        inputString = in.nextLine();
    }

    public int nextToken() {
        int ret = ERROR;
        if (currentPos == inputString.length()) {
            return EOF;
        }
        lookahead = inputString.charAt(currentPos);
        currentPos++;
        switch (lookahead) {
            case 'a':           
                ret = Lexer.a;
                break;
            case 'b':           
                ret = Lexer.b;
                break;
            case 'c':           
                ret = Lexer.c;
                break;
            default:
                System.out.println("Error de léxico: el símbolo " + lookahead + " no es válido.");
                System.exit(0);
                break;
        }
        return ret;
    }
}
