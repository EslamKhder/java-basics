package main.p2.old;

public class MP3Player implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Player with mp3");
        } else {
            System.out.println("Not supported");
        }
    }
}
