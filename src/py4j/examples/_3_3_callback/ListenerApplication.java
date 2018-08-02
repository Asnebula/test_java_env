package py4j.examples._3_3_callback;

import py4j.GatewayServer;

import java.util.ArrayList;
import java.util.List;

/**
 *  Implementing Java interfaces from Python (_3_3_callback)
 *  This is the Java Server
 */
public class ListenerApplication {

    List<ExampleListener> listeners = new ArrayList<ExampleListener>();

    public void registerListener(ExampleListener listener) {
        listeners.add(listener);
    }

    public void notifyAllListeners() {
        for (ExampleListener listener: listeners) {
            Object returnValue = listener.notify(this);
            System.out.println(returnValue);
        }
    }

    @Override
    public String toString() {
        return "<ListenerApplication> instance";
    }

    public static void main(String[] args) {
        ListenerApplication application = new ListenerApplication();
        GatewayServer server = new GatewayServer(application);
        server.start(true);
    }
}

//Run JAVA code first
//in the java console, output is as follows:
/*
Hello from python!
A Return Value

Process finished with exit code 0*/
