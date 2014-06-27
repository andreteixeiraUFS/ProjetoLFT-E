/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ATermoExplogica extends PExplogica
{
    private PTermoExpl _termoExpl_;

    public ATermoExplogica()
    {
        // Constructor
    }

    public ATermoExplogica(
        @SuppressWarnings("hiding") PTermoExpl _termoExpl_)
    {
        // Constructor
        setTermoExpl(_termoExpl_);

    }

    @Override
    public Object clone()
    {
        return new ATermoExplogica(
            cloneNode(this._termoExpl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoExplogica(this);
    }

    public PTermoExpl getTermoExpl()
    {
        return this._termoExpl_;
    }

    public void setTermoExpl(PTermoExpl node)
    {
        if(this._termoExpl_ != null)
        {
            this._termoExpl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoExpl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoExpl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoExpl_ == child)
        {
            this._termoExpl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoExpl_ == oldChild)
        {
            setTermoExpl((PTermoExpl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}