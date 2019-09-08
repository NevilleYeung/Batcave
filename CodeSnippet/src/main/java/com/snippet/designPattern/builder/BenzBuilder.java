package com.snippet.designPattern.builder;

import java.util.ArrayList;

public class BenzBuilder extends AbstractCarBuilder
{
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence)
    {
        this.benz.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel()
    {
        return this.benz;
    }
}
