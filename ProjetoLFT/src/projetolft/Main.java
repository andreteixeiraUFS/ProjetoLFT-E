/* Universidade Federal de Sergipe
 Linguagens Formais e Tradutores
 Projeto Compilador - Parte Lexica 
 Alunos: Andre Teixeira */
package projetolft;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Scanner;

import projetolft.lexer.*;
import projetolft.node.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
    	String leitor = null;

	
		/*
		 * 
		 * 
		 * Lembrar de indicar caminho do arquivo teste como argumento no
		 * eclipse!!!
		 */
    	// leitor = "C:\\workspace\\ProjetoLFT-E\\ProjetoLFT\\teste.txt";
		leitor = args[0];
   
        int linha = 0, coluna = 0;
        for (String arg : args) {
            try {
                //leitor = new FileReader(arg);
                MyLexer lex = new MyLexer(new PushbackReader(new FileReader(
						leitor)));


                while (true) {
                    Token tok = lex.next();
                    String name = tok.getClass().getSimpleName();

                    if (name.equals("EOF")) {
                        break;
                    } else {
                        name = name.substring(1, name.length()); //retirar T
                        name = name + "'" + tok.getText() + "'\n ";
                        linha = tok.getLine();
                        coluna = tok.getPos();
                    }

                    if (tok instanceof TBlanks) { //ignorar brancos
                        System.out.print(tok.getText());
                    } else {
                        System.out.print(name);
                    }
                }

            } catch (LexerException e) { //erros comuns
                System.out.println("Erro lexico na Linha: " + linha + " Coluna: " + coluna + ", O compilador nao pode continuar");
            } catch (IOException f) { //erros fins
                System.out.println("Erro lexico na Linha: " + linha + ", O compilador nao pode continuar");
            }
            System.out.println("\n");
        }
   
        System.out.println("Compilado com Sucesso");

    }

}
