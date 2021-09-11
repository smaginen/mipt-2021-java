package com.mipt.ami.java.patterns.abstractfactory;

public  abstract class AbstractMediaFactory {
    public abstract TCPMediaContent createTcpObject();
    public abstract UDPMediaContent createUdpObject();
}
