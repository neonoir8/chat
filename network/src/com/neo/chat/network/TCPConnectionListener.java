package com.neo.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value);
    void onDisconnection(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception e);
}
