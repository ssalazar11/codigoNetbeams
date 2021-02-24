/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htref
 */
public class Parser {
    Lexer lexer;
    int nextToken;
    
    public Parser(Lexer lexer) {
        this.lexer = lexer;
        // Se lee el primer token, para tomar la primera decisión
        // Es un LookAhead de 1
        nextToken = lexer.nextToken();
    }
    
    public void A() {
        if(nextToken == Lexer.a) {
            recognize(Lexer.a);
            A();
            recognize(Lexer.a);
        } else if (nextToken == Lexer.b) {
            recognize(Lexer.b);
            B();
        } else {
            System.out.println("Syntax Error");
            System.exit(0);
        }
    }
    
    public void B() {
        if(nextToken == Lexer.c) {
            recognize(Lexer.c);
        } else {
            System.out.println("Syntax Error, expecting " + Lexer.c);
            System.exit(0);            
        }
    }
    
    public void recognize(int token) {
        if(nextToken == token) {
            nextToken = lexer.nextToken();
        } else {
            System.out.println("Syntax error: expecting " + token + " found: " + nextToken);
            System.exit(0);
        }
    }
}
