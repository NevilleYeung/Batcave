package com.snippet.designPattern.prototype;

/**
 * 原型模式
 * 邮件原型,浅拷贝
 *
 */
public class Mail implements Cloneable
{
    public String receiver;
    public String tail;
    private String context;
    private String sub;

    public Mail(AdvTemplate advTemplate)
    {
        this.context = advTemplate.getContext();
        this.sub = advTemplate.getSubject();
    }

    /**
     * 浅拷贝
     * @return
     */
    @Override
    public Mail clone()
    {
        Mail mail = null;
        try
        {
            mail = (Mail)super.clone();
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }

        return mail;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getTail()
    {
        return tail;
    }

    public void setTail(String tail)
    {
        this.tail = tail;
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
}
