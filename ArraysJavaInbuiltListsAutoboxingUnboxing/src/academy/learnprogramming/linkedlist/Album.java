/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.linkedlist;

import java.util.ArrayList;

/**
 *
 * @author katy
 */
public class Album {
    private String name;
    private ArrayList<Song> songs; 

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }
    
    public void addASong(String title, String duration){
        Song song = new Song(title, duration);
        songs.add(song);
    }
    
    public Song getASong(int index){
        return (index < songs.size())?this.songs.get(index):null;
    }
    
    public boolean hasSong(Song song){
        for(Song s:songs){
            if(song.equals(s)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }
    
    
}
