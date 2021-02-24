/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htrefftz
 */
public class Main {
    public static void main(String [] args) {
        Lexer lexer = new Lexer();
        Parser parser = new Parser(lexer);
        // Invocar el método que procesa el símbolo inicial de la gramática
        parser.A();
        if(parser.nextToken == Lexer.EOF) {
            System.out.println("Si es una frase válida");
        } else {
            System.out.println("Sobran caracteres");
        }
    }
}
