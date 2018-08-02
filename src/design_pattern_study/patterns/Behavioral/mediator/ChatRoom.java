package design_pattern_study.patterns.Behavioral.mediator;

import java.util.Date;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+"["+user.getName()+"] :"+message);
    }
}
