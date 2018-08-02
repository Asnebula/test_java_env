class PythonPlayer(object):

    def start(self, player):
        return player.firstPing(self)

    def firstPong(self, player):
        return player.secondPing(self)

    def secondPong(self, player):
        return "Success"

    class Java:
        implements = ["py4j.examples._3_4_MultiThread.multi.PongPlayer"]

# Start the JVM with "java -cp ../../../../../out/artifacts/test_java_env_jar/test_java_env.jar py4j.examples._3_4_MultiThread.multi.ExampleApplication"
from py4j.java_gateway import JavaGateway, CallbackServerParameters
gateway = JavaGateway(
    callback_server_parameters=CallbackServerParameters())
ping_player = gateway.jvm.py4j.examples._3_4_MultiThread.multi.PingPlayer()
pong_player = PythonPlayer()
print(pong_player.start(ping_player))

# 目前是通过IntelliJ的project strcture来打出jar包，此处还要解决““Invalid signature file” when attempting to run a .jar”
# File->Project Structure->Add New (Artifacts)->jar->From Modules With Dependencies on the Create Jar From Module Window:
# Select you main class
# JAR File from Libraries Select copy to the output directory and link via manifest
# 参见https://stackoverflow.com/questions/999489/invalid-signature-file-when-attempting-to-run-a-jar