package net.thexcoders.best_practices.dry;

import java.io.File;

public class Dry {

    public static File stateLogger(String fileName) {
        System.out.println("reading File");
        File f = new File("./" + fileName);
        if (f.exists()) {
            System.out.println(" ✓ File exists!");
            System.out.println("reading File content...");
            return f;
        }
        System.out.println(" x File not Found!");
        return null;
    }

    public static void filesReader() {
        File f1 = stateLogger("Dry.java");
        processFile(f1);
        File f2 = stateLogger("NoDry.java");
        processFile(f2);
    }

    private static void processFile(File f) {
    }


}
