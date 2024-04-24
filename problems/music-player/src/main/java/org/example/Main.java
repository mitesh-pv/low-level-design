package org.example;

import org.example.service.MusicPlayerService;

public class Main {

  public static void main(String[] args) {
    MusicPlayerService musicPlayer = new MusicPlayerService();

    musicPlayer.addSong(1, "abc", "ABC");
    musicPlayer.addSong(2, "pqr", "PQR");
    musicPlayer.addSong(3, "xyz", "XYZ");
    musicPlayer.addSong(4, "rtu", "RTY");
    musicPlayer.addSong(5, "iop", "IOP");
    musicPlayer.addSong(6, "qqw", "QQW");

    musicPlayer.playRandomSong();
    musicPlayer.playRandomSong();
    musicPlayer.playRandomSong();

    musicPlayer.playSong(2, true);

    musicPlayer.closeMusicPlayer();
  }
}