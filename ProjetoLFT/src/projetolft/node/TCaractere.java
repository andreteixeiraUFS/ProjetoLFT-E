/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class TCaractere extends Token
{
    public TCaractere()
    {
        super.setText("caractere");
    }

    public TCaractere(int line, int pos)
    {
        super.setText("caractere");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCaractere(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCaractere(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCaractere text.");
    }
}