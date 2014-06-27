/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoFatorA extends PFatorA
{
    private TParenEsq _parenEsq_;
    private PExplogica _explogica_;
    private TParenDir _parenDir_;

    public AExpressaoFatorA()
    {
        // Constructor
    }

    public AExpressaoFatorA(
        @SuppressWarnings("hiding") TParenEsq _parenEsq_,
        @SuppressWarnings("hiding") PExplogica _explogica_,
        @SuppressWarnings("hiding") TParenDir _parenDir_)
    {
        // Constructor
        setParenEsq(_parenEsq_);

        setExplogica(_explogica_);

        setParenDir(_parenDir_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoFatorA(
            cloneNode(this._parenEsq_),
            cloneNode(this._explogica_),
            cloneNode(this._parenDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoFatorA(this);
    }

    public TParenEsq getParenEsq()
    {
        return this._parenEsq_;
    }

    public void setParenEsq(TParenEsq node)
    {
        if(this._parenEsq_ != null)
        {
            this._parenEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenEsq_ = node;
    }

    public PExplogica getExplogica()
    {
        return this._explogica_;
    }

    public void setExplogica(PExplogica node)
    {
        if(this._explogica_ != null)
        {
            this._explogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explogica_ = node;
    }

    public TParenDir getParenDir()
    {
        return this._parenDir_;
    }

    public void setParenDir(TParenDir node)
    {
        if(this._parenDir_ != null)
        {
            this._parenDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parenEsq_)
            + toString(this._explogica_)
            + toString(this._parenDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parenEsq_ == child)
        {
            this._parenEsq_ = null;
            return;
        }

        if(this._explogica_ == child)
        {
            this._explogica_ = null;
            return;
        }

        if(this._parenDir_ == child)
        {
            this._parenDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parenEsq_ == oldChild)
        {
            setParenEsq((TParenEsq) newChild);
            return;
        }

        if(this._explogica_ == oldChild)
        {
            setExplogica((PExplogica) newChild);
            return;
        }

        if(this._parenDir_ == oldChild)
        {
            setParenDir((TParenDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}