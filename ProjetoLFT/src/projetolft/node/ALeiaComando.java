/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaComando extends PComando
{
    private PLeiaEst _leiaEst_;
    private PComando _comando_;

    public ALeiaComando()
    {
        // Constructor
    }

    public ALeiaComando(
        @SuppressWarnings("hiding") PLeiaEst _leiaEst_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setLeiaEst(_leiaEst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaComando(
            cloneNode(this._leiaEst_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaComando(this);
    }

    public PLeiaEst getLeiaEst()
    {
        return this._leiaEst_;
    }

    public void setLeiaEst(PLeiaEst node)
    {
        if(this._leiaEst_ != null)
        {
            this._leiaEst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leiaEst_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leiaEst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leiaEst_ == child)
        {
            this._leiaEst_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leiaEst_ == oldChild)
        {
            setLeiaEst((PLeiaEst) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
