package com.mipt.ami.java.gc;

import javassist.CannotCompileException;
import javassist.ClassPool;

import java.util.ArrayList;
import java.util.Collection;

public class NoGcTrigger {

    public static void main(String[] args) throws InterruptedException {
//        leakMetaSpace();
        leakObjects();
    }

    private static void leakMetaSpace() throws CannotCompileException {
        ClassPool pool = ClassPool.getDefault();
        for(long l = 0; l < Long.MAX_VALUE; l++) {
            pool.makeClass("com.example.Kitty" + l).toClass();
        }
    }

    public static void leakObjects() throws InterruptedException {
        Collection<Object> objects = new ArrayList<>();
        while(true) {
            objects.add(new byte[2048]);
            Thread.sleep(100);
        }
    }
}