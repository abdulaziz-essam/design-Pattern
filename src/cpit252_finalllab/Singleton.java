
package cpit252_finalllab;

import java.io.File;



    public final class Singleton {
    private static Singleton instance;
    public String value;

//    user will send path
    private Singleton(String value) {
     
        File f=new File(value);
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

