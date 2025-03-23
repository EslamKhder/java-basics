package main.p2;

import main.p2.adapter.MediaAdapter;
import main.p2.old.MP3Player;
import main.p2.old.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mediaPlayer = new MP3Player();
            mediaPlayer.play("mp3", fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter();
            mediaPlayer.play("mp4", fileName);
        }  else if (audioType.equalsIgnoreCase("vlc")) {
            mediaPlayer = new MediaAdapter();
            mediaPlayer.play("vlc", fileName);
        }
    }
}
