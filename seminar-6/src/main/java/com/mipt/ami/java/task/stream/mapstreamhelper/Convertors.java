package com.mipt.ami.java.task.stream.mapstreamhelper;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public final class Convertors {

    private Convertors() {
        throw new AssertionError("Cannot be instantiated");
    }

    // converter for lists
    public static <P, Q> List<Q> list(List<P> source, Function<P, Q> f) {
        
        if(source == null || f == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        
        return //todo add logic;
    }

    // converter for arrays
    public static <P, Q> Q[] array(P[] source, Function<P, Q> f, IntFunction<Q[]> generator) {
        
        if(source == null || f == null || generator == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        
        return //to do
                .toArray(generator);
    }
}
