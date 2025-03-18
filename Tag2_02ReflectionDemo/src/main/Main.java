package main;

import tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Class clazz ;

        // 1 Variante
        clazz = Schwein.class;

        Schwein piggy = new Schwein();

        // 2 Variante
        clazz = piggy.getClass();

        // 3 Variante
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println("_".repeat(20));
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("_".repeat(20));
        System.out.println("_".repeat(20));
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("_".repeat(20));

        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        object = clazz.getConstructor(String.class).newInstance("Miss Piggy");
        System.out.println(object);

        Method m = clazz.getMethod("fuettern");
        m.invoke(object);

        System.out.println(object);

        Method declMethod = clazz.getDeclaredMethod("setGewicht", int.class);
        declMethod.setAccessible(true);
        declMethod.invoke(object, -100);

        System.out.println(object);
    }
}