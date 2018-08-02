package py4j.examples._3_5_JavaCallPy.Gateway;

import py4j.GatewayServer;

/**
 * @author by Wangshuo5 on 2018/7/24
 */
public class ExampleClientApplication {
    public static void main(String[] args) {
        GatewayServer.turnLoggingOff();
        GatewayServer server = new GatewayServer();
        server.start();
        IHello hello = (IHello) server.getPythonServerEntryPoint(new Class[] { IHello.class });
        try {
            hello.sayHello();
            hello.sayHello(2, "Hello World");
        } catch (Exception e) {
            e.printStackTrace();
        }
        server.shutdown();
    }
}
