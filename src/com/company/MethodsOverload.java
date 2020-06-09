package com.company;

 public class MethodsOverload {
    public static void main(String[] args) {
        action((char) 1);
        action(1.0);
        action(Double.valueOf("5"));
        action(1L);
    }
    static void action(Object var)  { System.out.println(var.getClass() + " расширен до Object"); }
    static void action(Number var)  { System.out.println(var.getClass() + " расширен до Number");  }
    static void action(Integer var) { System.out.println(var.getClass() + " автоупакован Integer"); }
    static void action(short var)   { System.out.println(var + " расширен до short");}
    static void action(float var)   { System.out.println(var + " расширен до float");}
    static void action(double var)  { System.out.println(var + " расширен до double"); }
    static void action(int... var)  { System.out.println(var.getClass() + " переменное число аргументов"); }
}
