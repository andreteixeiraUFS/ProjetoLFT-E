/* Universidade Federal de Sergipe
 Linguagens Formais e Tradutores
 Projeto Compilador - Parte Lexica 
 Alunos: Andre Teixeira */
package projetolft;


import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Scanner;
import projetolft.lexer.*;
import projetolft.node.*;

public class Main_Lexer {
	
		
    public static void main(String[] args) throws IOException {

 /*Para testar diretamente no eclipse usar linhas comentadas a baixo
  * ou adicionar o caminho do .txt teste nos argumentos da execucao
  * */
    	//args = new String[1];
    	//args[0]="C://workspace//ProjetoLFT-E//ProjetoLFT//teste.txt";
   
    	if (args.length==0){
    		args = new String[1];
    		Scanner ent = new Scanner(System.in);
    		System.out.println("\n\nDigite o caminho do arquivo de codigo fonte Portugol ");
			System.out.println("Exemplo de caminho: C:\\Users\\Fulano\\Documentos\\codigo.txt ");
    		args[0]= ent.nextLine();
    		ent.close();
    	}
    			
        int linha = 0, coluna = 0;
        for (String arg : args) {
            try {
               MyLexer lex = new MyLexer(new PushbackReader(new FileReader(args[0]), 1024));


                while (true) {
                    Token tok = lex.next();
                    String name = tok.getClass().getSimpleName();

                    if (name.equals("EOF")) {
                    	
                    	throw new ArithmeticException();
                     
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

            } catch (LexerException e) { //erros
                System.out.println("\nErro lexico na Linha: " + linha + " Coluna: " + (coluna+1) + ", O compilador nao pode continuar");
                System.out.println ("Detalhes: "+e.getMessage());
            } catch (ArithmeticException f){
            	System.out.println("\nAnalise lexica concluida com sucesso!");
            }
            System.out.println("\n");
        }
   
        

    }

}
