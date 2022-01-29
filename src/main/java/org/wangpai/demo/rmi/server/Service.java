package org.wangpai.demo.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.wangpai.demo.rmi.common.Expose;
import org.wangpai.demo.rmi.common.Request;
import org.wangpai.demo.rmi.common.Response;

public class Service extends UnicastRemoteObject implements Expose {
    protected Service() throws RemoteException {
        super();
    }

    @Override
    public Response call(Request request) throws RemoteException {
        System.out.println("------ 接收到客户端的数据 -------");
        System.out.println(request.getData());
        System.out.println("---------------------------");
        return () -> "Hello, Client.";
    }
}
