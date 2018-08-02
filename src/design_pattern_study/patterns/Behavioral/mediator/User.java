package design_pattern_study.patterns.Behavioral.mediator;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
