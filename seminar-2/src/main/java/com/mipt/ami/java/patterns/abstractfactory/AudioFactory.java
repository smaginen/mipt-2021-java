package com.mipt.ami.java.patterns.abstractfactory;

public class AudioFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTcpObject() {
        return new TCPAudioContent();
    }

    @Override
    public UDPMediaContent createUdpObject() {
        return new UDPAudioContent();
    }
}
