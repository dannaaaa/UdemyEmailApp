package com.spartaglobal.UdemyEmailApp;

/**
 * Hello world!
 *
 */
public class EmailApp
{
    public static void main( String[] args )
    {
        Email email1 = new Email("Dana", "Awua");

        email1.setAlternateEmail("dk@gmail.com");
        System.out.println(email1.getAlternateEmail());
    }
}
