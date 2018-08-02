package py4j.examples._2_GetStarted;

import py4j.GatewayServer;

/**
 * @author by Wangshuo5 on 2018/7/20
 */
public class StackEntryPoint {
    private Stack stack;

    public StackEntryPoint() {
        stack = new Stack();
        stack.push("Initial Item");
    }

    public Stack getStack() {
        return stack;
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new StackEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}
