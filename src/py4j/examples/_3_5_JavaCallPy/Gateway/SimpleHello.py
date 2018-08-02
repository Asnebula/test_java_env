class SimpleHello(object):

    def sayHello(self, int_value=None, string_value=None):
        print(int_value, string_value)
        return "Said hello to {0}".format(string_value)

    class Java:
        implements = ["py4j.examples._3_5_JavaCallPy.Gateway.IHello"]

# Make sure that the python code is started first.
# Then execute: java -cp py4j.jar py4j.examples._3_5_JavaCallPy.Gateway.SingleThreadClientApplication
from py4j.java_gateway import JavaGateway, CallbackServerParameters
simple_hello = SimpleHello()
gateway = JavaGateway(
    callback_server_parameters=CallbackServerParameters(),
    python_server_entry_point=simple_hello)

# Output is cmd as follows:
# None None
# 2 Hello World
