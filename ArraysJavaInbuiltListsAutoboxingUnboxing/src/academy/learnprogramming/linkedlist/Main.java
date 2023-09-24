/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author katy
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer = customer;
        
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer "+customer.getName()+ " is "+ customer.getBalance());
        
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        
        for(int i=0; i<intList.size(); i++){
            System.out.println(i+": "+intList.get(i));
        }
        
        intList.add(1, 2);
        
        for(int i=0; i<intList.size(); i++){
            System.out.println(i+": "+intList.get(i));
        }
        
        System.out.println("**************************");
        
        LinkedList<Song> playlist = new LinkedList<Song>();
        ArrayList<Album> albums = new ArrayList<Album>();
        
        Album album1 = new Album("50 most Piano classics");
        album1.addASong("Aria", "3:45");
        album1.addASong("Jesus, Joy of Man's Desiring", "4:04");
        album1.addASong("Prelude No.1 in C Major", "2:09");
        album1.addASong("Minuet in G Major from Anna Magdalena", "3:07");
        album1.addASong("Prelude No.22 in B-Flat minor", "1:45");
        album1.addASong("Siciliano", "2:18");
        album1.addASong("III. Rondo a la Turca", "2:23");
        
        Album album2 = new Album("Coffee House Classical Guitar");
        album2.addASong("A wonderful Life", "3:09");
        album2.addASong("Marvel At The Sky", "2:03");
        album2.addASong("Hügel des Nordens", "2:06");
        album2.addASong("Rosarium", "2:25");
        album2.addASong("Wayside", "2:13");
        album2.addASong("La Mestis", "2:00");
        album2.addASong("In Madeira", "1:45");
        album2.addASong("Morgensonne", "2:26");
        
        albums.add(album1);
        albums.add(album2);
        
        Random r = new Random();
        int index = r.nextInt((album1.getSongs().size())+(album2.getSongs().size()));
        for(int i=0; i<index; i++){
            index = r.nextInt(albums.size());
            if(index == 0){
                index = r.nextInt(album1.getSongs().size());
                if(album1.getASong(index) != null){
                    playlist.add(album1.getASong(index));
                }
            }else{
                index = r.nextInt(album2.getSongs().size());
                if(album1.getASong(index) != null){
                    playlist.add(album2.getASong(index));
                }
            }
        }
        
        
        
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        
        int choice = 0;
        showMenu();
        while(choice !=1){
            System.out.println("Choose an action :");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Closing playlist...");
                    break;
                case 2:
                    System.out.println("Skiping to next song");
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing \""+listIterator.next().getTitle()+"\"");
                    }else{
                        System.out.println("You have reached the end of the playlist.");
                    }
                    
                    break;
                case 3:
                    System.out.println("Skiping to previous song");
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing \""+listIterator.previous().getTitle()+"\"");
                    }else{
                        System.out.println("You have reached the top of the playlist.");
                    }
                    
                    break;
                case 4:
                    System.out.println("Replaying song");
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing \""+ listIterator.previous().getTitle()+"\"");
                            goingForward = false;
                        }else{
                            System.out.println("You have reached the top of the playlist.");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing \""+ listIterator.next().getTitle()+"\"");
                            goingForward = true;
                        }else{
                            System.out.println("You have reached the end of the playlist.");
                        }
                    }
                    break;
                case 5:
                    for(int i=0; i<playlist.size(); i++){
                        System.out.println((i+1)+". "+playlist.get(i).getTitle()+" | "+playlist.get(i).getDuration());
                    }
                    break;
                case 6:
                    showMenu();
                    break;
            }
        }  
    }
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Quit");
        System.out.println("2. Skip forward to next song");
        System.out.println("3. Skip backwards to previous song");
        System.out.println("4. Replay song");
        System.out.println("5. List songs in the playlist");
        System.out.println("6. Show Menu");
    }
}
