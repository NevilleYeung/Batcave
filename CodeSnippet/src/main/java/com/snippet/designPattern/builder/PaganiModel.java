package com.snippet.designPattern.builder;

public class PaganiModel extends AbstractCarModel
{

    @Override
    protected void start()
    {
        System.out.println("Pagani start....");
    }

    @Override
    protected void stop()
    {
        System.out.println("Pagani stop....");
    }

    @Override
    protected void alarm()
    {
        System.out.println("Pagani alarm....");
    }
}
