package py4j.examples._3_5_JavaCallPy.ClientServer;

import py4j.ClientServer;

/**
 * @author by Wangshuo5 on 2018/7/24
 */
public class SingleThreadClientApplication {
    public static void main(String[] args) {
        ClientServer clientServer = new ClientServer(null);
        // We get an entry point from the Python side
        IHello hello = (IHello) clientServer.getPythonServerEntryPoint(new Class[] { IHello.class });
        // Java calls Python without ever having been called from Python
        System.out.println(hello.sayHello());
        System.out.println(hello.sayHello(2, "Hello World"));
        clientServer.shutdown();
    }
}

/*
Output in Run console as follows
    Said hello to None
    Said hello to Hello World*/
