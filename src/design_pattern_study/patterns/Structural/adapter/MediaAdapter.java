package design_pattern_study.patterns.Structural.adapter;

import design_pattern_study.patterns.Structural.adapter.iterf.AdvancedMediaPlayer;
import design_pattern_study.patterns.Structural.adapter.iterf.MediaPlayer;

/**
 * 实现“飞虎”
 * @author by Wangshuo5 on 2018/4/24
 */
public class MediaAdapter implements MediaPlayer {

    //包含“虎”的对象
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    //实现“禽”的接口
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
