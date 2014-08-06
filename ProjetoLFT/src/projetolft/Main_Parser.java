/* Universidade Federal de Sergipe
 Linguagens Formais e Tradutores
 Projeto Compilador - Parte Sintatica 
 Alunos: Andre Teixeira */

package projetolft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Scanner;

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

		/*
		 * Para testar diretamente no eclipse usar linhas comentadas a baixo ou
		 * adicionar o caminho do .txt teste nos argumentos da execucao
		 */
		//args = new String[1];
		//args[0] = "C://workspace//ProjetoLFT-E//ProjetoLFT//teste.txt";

		if (args.length == 0) {
			args = new String[1];
			Scanner ent = new Scanner(System.in);
			System.out
					.println("\n\nDigite o caminho do arquivo de codigo fonte Portugol ");
			System.out
					.println("Exemplo de caminho: C:\\Users\\Fulano\\Documentos\\codigo.txt ");
			args[0] = ent.nextLine();
			ent.close();
		}

		System.out.println("           Analisador sintatico\n");
		System.out.println("Codigo de entrada: " + args[0]);

		for (String arg : args) {
			try {
				Parser p = new Parser(new MyLexer(new PushbackReader(
						new FileReader(args[0]), 1024)));

				// Parse the input.
				Start tree = p.parse();
				String name = p.getClass().getSimpleName();

				if (name.equals("Parser")) {
					throw new ArithmeticException();
				}

			} catch (ParserException e) {
				System.out.println("\nErro sintatico detectado!");
				System.out.println("Detalhes: Linha,Coluna " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Arquivo de entrada nao encontrado");
			} catch (LexerException e) {
				System.out
						.println("\nErro lexico, O compilador nao pode continuar");
				System.out.println("Detalhes: Linha,Coluna " + e.getMessage());
			} catch (ArithmeticException f) {
				System.out
						.println("\nA Estrutura Lexica e Sintatica do codigo esta OK!");
			}
		}

	}
}
