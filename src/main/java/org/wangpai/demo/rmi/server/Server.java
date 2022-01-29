package org.wangpai.demo.rmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import org.wangpai.demo.rmi.common.Protocol;

public class Server {
    public static void start() throws RemoteException, AlreadyBoundException {
        var registry = LocateRegistry.createRegistry(Protocol.SERVER_PORT);
        var service = new Service();
        registry.bind(Protocol.SERVICE_URL, service);
    }

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        start();
    }
}
