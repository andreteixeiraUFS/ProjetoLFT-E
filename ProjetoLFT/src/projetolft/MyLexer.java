package projetolft;



import projetolft.lexer.Lexer;
import projetolft.lexer.LexerException;
import projetolft.node.*;

public class MyLexer extends Lexer {

    private int count;
    public TComentadoA comment;
    private StringBuffer text;

    public MyLexer(java.io.PushbackReader in) {

        super(in);
    }

    public void filter() throws LexerException {
        if (state.equals(State.COMENTADO)) {
            if (comment == null) {
                comment = (TComentadoA) token;
                text = new StringBuffer(comment.getText());
                count = 1;
                token = null;
            } else {
                text.append(token.getText());
                if (token instanceof TComentadoA) {
                    count++;
                } else if (token instanceof TComentadoFinal) {
                    count--;
                }
                if (token instanceof EOF) {
                    throw new LexerException(null, "token coment�rio desbalanceado");
                }
                if (count != 0) {
                    token = null;
                } else {
                    //Final de um aninhamento
                    //System.out.print(text.toString());
                    comment.setText(text.toString());
                    token = comment;
                    state = State.NORMAL;
                    comment = null;
                }
            }
        }
    }
}