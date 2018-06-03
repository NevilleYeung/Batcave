package com.snippet.designPattern.builder;

import java.util.ArrayList;

public abstract class AbstractCarBuilder
{

    public abstract void setSequence(ArrayList<String> sequence);
    public abstract AbstractCarModel getCarModel();
}
