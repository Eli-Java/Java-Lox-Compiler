package com.craftinginterpreters.lox;

import com.craftinginterpreters.lox.TokenType;

//tokenType distinguishes between string "123" and int 123
//lexeme is a word in the programming language akin to a word in grammar
//the literal is the actual val. eg if we read int 123. "123" the string we read,
//will be stored in the lexeme and its int value will be stored in the literal
//the tokentype will be NUMBER and line will contain the line on which "123" occurs
public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;
    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }
    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
