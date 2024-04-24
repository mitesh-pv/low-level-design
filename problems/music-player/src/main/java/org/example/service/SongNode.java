package org.example.service;

public class SongNode {
  int id;
  String name;
  String singerName;
  SongNode left;
  SongNode right;

  public SongNode(int id, String name, String singerName) {
    this.id = id;
    this.name = name;
    this.singerName = singerName;

    this.left = this.right = null;
  }

  public SongNode() {
    this.id = Integer.MAX_VALUE;
    this.name = this.singerName = null;
  }
}
