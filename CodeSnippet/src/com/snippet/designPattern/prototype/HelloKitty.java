package com.snippet.designPattern.prototype;

import java.util.ArrayList;

public class HelloKitty implements Cloneable
{
    private String context;
    private String sub;
    private ArrayList<String> list;

    /**
     * 深拷贝；
     * 调用该方法不会执行构造函数；
     * 成员变量不可使用final关键字修饰；
     *
     * @return
     */
    @Override
    public HelloKitty clone()
    {
        HelloKitty helloKitty = null;
        try
        {
            helloKitty = (HelloKitty)super.clone();
            // 深拷贝
            helloKitty.list = (ArrayList<String>)this.list.clone();
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }

        return helloKitty;
    }

    public String getContext()
    {
        return context;
    }

    public void setContext(String context)
    {
        this.context = context;
    }

    public String getSub()
    {
        return sub;
    }

    public void setSub(String sub)
    {
        this.sub = sub;
    }

    public ArrayList<String> getList()
    {
        return list;
    }

    public void setList(ArrayList<String> list)
    {
        this.list = list;
    }

    public void addListValues(String s)
    {
        if (this.list == null)
        {
            this.list = new ArrayList<String>();
        }

        this.list.add(s);
    }
}
