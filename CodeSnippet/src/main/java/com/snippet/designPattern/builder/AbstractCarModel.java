package com.snippet.designPattern.builder;

import java.util.ArrayList;

public abstract class AbstractCarModel
{

    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();

    final public void run()
    {
        for (String sq: sequence)
        {
            if ("start".equals(sq))
            {
                this.start();
            }
            else if ("stop".equals(sq))
            {
                this.stop();
            }
            else
            {
                this.alarm();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence)
    {
        this.sequence = sequence;
    }
}
