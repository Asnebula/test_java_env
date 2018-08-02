package design_pattern_study.patterns.Behavioral.template;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    //抽象方法放到了一个具体方法里！不同实现类调用该方法实现多态
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
