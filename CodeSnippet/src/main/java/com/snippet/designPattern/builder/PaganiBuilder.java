package com.snippet.designPattern.builder;

import java.util.ArrayList;

public class PaganiBuilder extends AbstractCarBuilder
{
    private PaganiModel pagani = new PaganiModel();

    @Override
    public void setSequence(ArrayList<String> sequence)
    {
        this.pagani.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel()
    {
        return this.pagani;
    }
}
