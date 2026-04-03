package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         GooglePageTitleTest test = new GooglePageTitleTest();
        
        try {
            test.testGooglePageTitle();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
