package org.wangpai.demo.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Expose extends Remote {
    Response call(Request request) throws RemoteException;
}
