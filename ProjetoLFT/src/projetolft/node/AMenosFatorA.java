/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AMenosFatorA extends PFatorA
{
    private TMenos _menos_;
    private PFatorA _fatorA_;

    public AMenosFatorA()
    {
        // Constructor
    }

    public AMenosFatorA(
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PFatorA _fatorA_)
    {
        // Constructor
        setMenos(_menos_);

        setFatorA(_fatorA_);

    }

    @Override
    public Object clone()
    {
        return new AMenosFatorA(
            cloneNode(this._menos_),
            cloneNode(this._fatorA_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosFatorA(this);
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PFatorA getFatorA()
    {
        return this._fatorA_;
    }

    public void setFatorA(PFatorA node)
    {
        if(this._fatorA_ != null)
        {
            this._fatorA_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorA_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menos_)
            + toString(this._fatorA_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._fatorA_ == child)
        {
            this._fatorA_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._fatorA_ == oldChild)
        {
            setFatorA((PFatorA) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}