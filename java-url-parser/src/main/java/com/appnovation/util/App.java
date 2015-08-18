package com.appnovation.util;

import java.net.URL;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        URL exampleURL = new URL("http://docs.oracle.com:80/javase/7/docs/api/java/net/URL.html?name=ClassURL");
		
		System.out.println("Protocol = " + exampleURL.getProtocol());
		System.out.println("Host = " + exampleURL.getHost());
		System.out.println("Port = " + exampleURL.getPort());
		System.out.println("Path = " + exampleURL.getPath());
		System.out.println("Query = " + exampleURL.getQuery());
    }
}