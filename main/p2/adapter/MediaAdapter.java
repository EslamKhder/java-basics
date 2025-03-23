package main.p2.adapter;

import main.p2.newPattern.AdvancedMediaPlayer;
import main.p2.newPattern.Mp4Player;
import main.p2.newPattern.VLCPlayer;
import main.p2.old.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VLCPlayer();
        } else {
            System.out.println("Not supported");
            return;
        }

        advancedMediaPlayer.play(fileName);
    }
}
