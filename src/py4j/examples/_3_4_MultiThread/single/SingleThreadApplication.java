package py4j.examples._3_4_MultiThread.single;

import py4j.ClientServer;
import py4j.GatewayServer;

/**
 * @author by Wangshuo5 on 2018/7/23
 * 通过实验测试得知：现有的web程序先启动，python端后启动也没问题
 * 只不过这期间，回测没有反应
 * 另外可以在后启动的python里调用java 方法是
 * gateway.jvm.包名.类名(),
 * 接下来把这个实例放到一个global全局里面，就可以调Barra了
 */
public class SingleThreadApplication {
    public static void main(String[] args) {
        GatewayServer.turnLoggingOff();
        SingleThreadApplication point = new SingleThreadApplication();
        /*EntryPoint（point）是命令行java -cp **.jar a_java_file_name 这个java文件的入口函数
        * 不指定也没关系，只要这个java程序能正常启动起来*/
        ClientServer clientServer = new ClientServer(point);
        // Wait for Python side to shut down Java side
        /*这句不要也可以写，没关系的*/
        clientServer.startServer(true);

        // Shut down after 5 seconds
        //		ClientServer.startServer(true);
        //		try {
        //			Thread.currentThread().sleep(5000);
        //		} catch (Exception e) {
        //			e.printStackTrace();
        //		}
        //		ClientServer.shutdown();
        //
        //		System.out.println("Stopping");
    }

 /*   public static class SingleThreadShortTimeoutApplication {
        public static void main(String[] args) {
            _2_GetStarted.turnLoggingOff();
            ClientServer ClientServer = new ClientServer.ClientServerBuilder().readTimeout(250)
                    .entryPoint(new StartGateway()).build();
            ClientServer.startServer(true);
        }
    }*/
}
