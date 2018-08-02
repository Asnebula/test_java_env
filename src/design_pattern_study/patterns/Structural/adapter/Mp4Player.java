package design_pattern_study.patterns.Structural.adapter;

import design_pattern_study.patterns.Structural.adapter.iterf.AdvancedMediaPlayer;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name: "+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
