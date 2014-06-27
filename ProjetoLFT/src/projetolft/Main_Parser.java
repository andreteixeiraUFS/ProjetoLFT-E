/* Universidade Federal de Sergipe
 Linguagens Formais e Tradutores
 Projeto Compilador - Parte Lexica 
 Alunos: Andre Teixeira */

package projetolft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import projetolft.lexer.LexerException;
import projetolft.node.Start;
import projetolft.parser.Parser;
import projetolft.parser.ParserException;

/**
 * 
 * @author Andre
 */
public class Main_Parser {
	public static void main(String[] args) throws FileNotFoundException,
			ParserException, LexerException {
		String leitor = null;
		
		/*
		 * 
		 * 
		 * Lembrar de indicar caminho do arquivo teste como argumento no
		 * eclipse!!!
		 */
       
		
		// leitor = "C:\\workspace\\ProjetoLFT-E\\ProjetoLFT\\teste.txt";
			leitor = args[0];
		
  System.out.println ("           Analisador sintatico");
  System.out.println ("Codigo de entrada: "+ args[0]);
  
		for (String arg : args) {
			try {
				Parser p = new Parser(new MyLexer(new PushbackReader(new FileReader(leitor))));

				// Parse the input.
				Start tree = p.parse();

			} catch (ParserException e) {
				System.out.println("Erro sintatico detalhes: \n" + e);
			} catch (IOException e) {
             System.out.println("Arquivo de entrada nao encontrado");
			} 
			catch (LexerException e) {
				System.out.println("ERRO: " + e);
			}

		}
		System.out.println("Estrutura Lexica e Sintatica OK!");
	}
}
