package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service nishant
 */
@RemoteServiceRelativePath("greetMe")
public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
}
