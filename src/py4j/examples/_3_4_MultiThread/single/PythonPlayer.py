class PythonPlayer(object):

    def start(self, player):
        return player.firstPing(self)

    def firstPong(self, player):
        return player.secondPing(self)

    def secondPong(self, player):
        return "Success"

    class Java:
        implements = ["py4j.examples._3_4_MultiThread.single.PongPlayer"]

# Start the JVM with "java -cp py4j.jar py4j.examples._3_4_MultiThread.single.SingleThreadApplication"
from py4j.clientserver import ClientServer, JavaParameters, PythonParameters
gateway = ClientServer(
    java_parameters=JavaParameters(),
    python_parameters=PythonParameters())
ping_player = gateway.jvm.py4j.examples._3_4_MultiThread.single.PingPlayer()
pong_player = PythonPlayer()
print(pong_player.start(ping_player))