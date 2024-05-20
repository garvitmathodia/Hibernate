package com.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Song {

	@Id
	@Column(name = "songId")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //my database will take care of primary key id..
	private int songId;
	@Column(name = "songName")
	private String songName;
	@Column(name = "singer")
	private String singer;
	
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", singer=" + singer + "]";
	}
	
	
}
