package org.example.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class MusicPlayerService {
  Queue<SongNode> playList;
  List<SongNode> songList;
  int songCounter;
  Random random;

  public MusicPlayerService() {
    songList = new LinkedList<>();
    playList = new LinkedList<>();

    songCounter = 0;

    random = new Random();
  }

  public boolean addSong(int id, String name, String singerName) {
    if (songList.contains(id)) {
      return false;
    }

    SongNode newSong = new SongNode(id, name, singerName);
    songList.add(newSong);
    songCounter += 1;

    return true;
  }

  public void playRandomSong() {
    int randomSong = random.nextInt(songCounter);

    SongNode songNode = songList.get(randomSong);

    // Remove the song from position
    songList.remove(songNode);

    // Add it to the last so that it's not replayed
    songList.add(songNode);

    // Add song to the queue
    playList.add(songNode);

    // decrement the counter as now the last counter points to the song tht is already added to q
    songCounter -= 1;

    System.out.println("Currently playing " + songNode.name + " by " + songNode.singerName);
  }

  public void playSong(int id, boolean addToQueue) {
    SongNode song = null;
    for (int i=0; i<songCounter; ++i) {
      if (songList.get(i).id == id) {
        song = songList.get(i);

        songList.remove(song);
        songList.add(song);
        songCounter -= 1;

        if (addToQueue) {
          playList.add(song);
          System.out.println("Found song, added to queue " + song.name + " by " + song.singerName);
        } else {
          System.out.println("Found song, currently playing " + song.name + " by " + song.singerName);
        }

        return;
      }
    }

    for (int i=songCounter; i < songList.size(); ++i) {
      if (songList.get(i).id == id) {
        song = songList.get(i);

        if (addToQueue) {
          playList.add(song);
          System.out.println("Added to queue " + song.name + " by " + song.singerName);
        } else {
          System.out.println("Currently playing " + song.name + " by " + song.singerName);
        }

        return;
      }
    }

  }

  public void closeMusicPlayer() {
    System.out.println("Closing music player");
    songCounter = songList.size();
    playList.clear();
  }

}
