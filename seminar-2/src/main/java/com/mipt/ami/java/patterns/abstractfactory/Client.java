package com.mipt.ami.java.patterns.abstractfactory;

public class Client {
    private UDPMediaContent udpMediaContent;
    private TCPMediaContent tcpMediaContent;

    public void makeMediaFactoryWork(AbstractMediaFactory abstractMediaFactory){
        udpMediaContent = abstractMediaFactory.createUdpObject();
        tcpMediaContent = abstractMediaFactory.createTcpObject();
    }
}
