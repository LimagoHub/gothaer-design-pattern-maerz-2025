package singleton;

import java.lang.ref.SoftReference;

public class Singleton {

    private static SoftReference<Singleton> instance = null ;

    public static synchronized Singleton getInstance() {
        if (instance.get() == null) {
            instance = new SoftReference<Singleton>(new Singleton());
        }
        return instance.get();
    }

    private Singleton() {
    }

    public void log( String message ) {
        System.out.println(message);
    }
}
