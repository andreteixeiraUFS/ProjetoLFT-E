/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoComando extends PComando
{
    private PEnquantoEst _enquantoEst_;
    private PComando _comando_;

    public AEnquantoComando()
    {
        // Constructor
    }

    public AEnquantoComando(
        @SuppressWarnings("hiding") PEnquantoEst _enquantoEst_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setEnquantoEst(_enquantoEst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoComando(
            cloneNode(this._enquantoEst_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoComando(this);
    }

    public PEnquantoEst getEnquantoEst()
    {
        return this._enquantoEst_;
    }

    public void setEnquantoEst(PEnquantoEst node)
    {
        if(this._enquantoEst_ != null)
        {
            this._enquantoEst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquantoEst_ = node;
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
            + toString(this._enquantoEst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquantoEst_ == child)
        {
            this._enquantoEst_ = null;
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
        if(this._enquantoEst_ == oldChild)
        {
            setEnquantoEst((PEnquantoEst) newChild);
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
