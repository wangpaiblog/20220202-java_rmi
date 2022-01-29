package org.wangpai.demo.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import org.wangpai.demo.rmi.common.Expose;
import org.wangpai.demo.rmi.common.Protocol;
import org.wangpai.demo.rmi.common.Request;

public class Client {
    public static void remoteCall() throws MalformedURLException, NotBoundException, RemoteException {
        System.out.println("************ 连接远程服务端 ***********");
        // 此处强制转换时，不能转换成类 Service
        var service = (Expose) Naming.lookup(Protocol.SERVER_BASE_URL + Protocol.SERVICE_URL);
        System.out.println("************ 远程服务端连接成功 ***********");

        System.out.println("************ 开始远程调用 ***********");
        var response = service.call((Request) () -> "Hello, I'm a client.");
        System.out.println("************** 远程调用结束 ********************");

        System.out.println("------ 接收到服务端的数据 -------");
        System.out.println(response.getData());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        remoteCall();
    }
}
