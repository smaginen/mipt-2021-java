package com.smagin.ami.java.sec01;

public class RandomSequence  implements IntSequence{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
