package com;

class Base   
{  
    protected  void getInfo()  
    {  
        System.out.println("method of Base class");  
    }  
}  
   
public class Main extends Base  
{  
    protected final void getInfo()  
    {  
        System.out.println("method of Derived class");  
    }  
    public static void main(String[] args)  
    {  
        Base obj = new Base();  
        obj.getInfo();  
    }  
}  