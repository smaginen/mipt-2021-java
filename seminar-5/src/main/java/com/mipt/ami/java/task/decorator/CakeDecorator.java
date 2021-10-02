package com.mipt.ami.java.task.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class CakeDecorator {

    private Function<Cake, Cake> decorator;

    public CakeDecorator(Function<Cake, Cake>... decorations) {
        reduceDecorations(decorations);
    }    
//todo eliminate null
    public Cake decorate(Cake cake) {
        return null;
    }

    private void reduceDecorations(Function<Cake, Cake>... decorations) {

    }
}
