package com.snippet.designPattern.prototype;

import java.util.ArrayList;

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
            // 浅拷贝
            Mail cloneMail = mail.clone();
            cloneMail.setReceiver("client" + i);

            sendMail(cloneMail);
        }

        System.out.println();

        // 深拷贝
        HelloKitty helloKitty = new HelloKitty();
        ArrayList<String> list = new ArrayList<String>();
        list.add("kitty");
        helloKitty.setList(list);

        HelloKitty cloneHelloKitty = helloKitty.clone();
        cloneHelloKitty.addListValues("shit");

        System.out.println("helloKitty1.list = " + helloKitty.getList());
        System.out.println("helloKitty2.list = " + cloneHelloKitty.getList());
    }

    private static void sendMail(Mail mail)
    {
        System.out.println("send mail to " + mail.getReceiver() + ", sub is " + mail.getSub() + ", context is " + mail.getContext() + ", tail is " + mail.getTail());
    }
}
