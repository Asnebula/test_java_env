package py4j.examples._3_4_MultiThread.multi;

/**
 * @author by Wangshuo5 on 2018/7/23
 */
public class PingPlayer {
    public String firstPing(PongPlayer player) {
        return player.firstPong(this);
    }

    public String secondPing(PongPlayer player) {
        return player.secondPong(this);
    }

}
