package net.thexcoders.best_practices.dry;

import java.io.File;

public class NoDry {
    // We enjoy Typing

    // making the code unreadable and full of "copy paste"

    public static void filesReader() {
        System.out.println("reading File");
        File f = new File("./Dry.java");
        if (f.exists()) {
            System.out.println(" ✓ File exists!");
            System.out.println("reading File content...");
        } else {
            System.out.println(" x File not Found!");
        }
        processFile(f);
        System.out.println("reading File");
        f = new File("./NoDry.java");
        if (f.exists()) {
            System.out.println(" ✓ File exists!");
            System.out.println("reading File content...");
        } else {
            System.out.println(" x File not Found!");
        }
        processFile(f);
    }

    private static void processFile(File f) {
    }
}
