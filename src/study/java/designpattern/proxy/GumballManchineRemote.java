package study.java.designpattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

import study.java.designpattern.status.State;

public interface GumballManchineRemote extends Remote {
	public int getCount() throws RemoteException ;
	public String getLocation() throws RemoteException ;
	public State getState() throws RemoteException ;
}
