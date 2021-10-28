package net.thexcoders.design_patterns.singleton;

public class Singleton {
    // Single instance all over the project
    // No constructor ( private )
    // Single instance ( static variable )

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() { // static instance -> static method
        if (instance == null) {
            instance = new Singleton(); // private constructor can be called within the class itself
        }
        return instance;
    }

}
