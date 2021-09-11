package com.mipt.ami.java.patterns.abstractfactory;

public class VideoFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTcpObject() {
        return new TCPVideoContent();
    }

    @Override
    public UDPMediaContent createUdpObject() {
        return new UDPVideoContent();
    }
}
