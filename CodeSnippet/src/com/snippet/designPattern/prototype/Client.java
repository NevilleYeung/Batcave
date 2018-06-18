package com.snippet.designPattern.prototype;

/**
 * 原型模式
 * 创建型
 *
 */
public class Client
{
    private static int COUNT = 6;

    public static void main(String[] args)
    {
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("hellokitty");

        for (int i = 0; i < COUNT; i++)
        {
            Mail cloneMail = mail.clone();
            cloneMail.setReceiver("client" + i);

            sendMail(cloneMail);
        }
    }

    private static void sendMail(Mail mail)
    {
        System.out.println("send mail to " + mail.getReceiver() + ", sub is " + mail.getSub() + ", context is " + mail.getContext() + ", tail is " + mail.getTail());
    }
}
