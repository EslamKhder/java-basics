package main.p2;

public class main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "file1");
        audioPlayer.play("mp4", "file1");
        audioPlayer.play("vlc", "file1");
    }
}
