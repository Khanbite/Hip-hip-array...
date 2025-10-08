/*
Name: Khani Lyan
Date: 10/2/2025
Description: This program takes an array of songs, shuffles them, and prints out the shuffled playlist.
*/

public class ShufflePlaylist {
    public static void main(String[] args) {
        String[] playlist = {"Shake It Off – Taylor Swift", "I Love You – Barney", "Baby Shark – Pinkfong", "Never Gonna Give You Up – Rick Astley", "Axel F (Crazy Frog) – Crazy Frog", "Gangnam Style – PSY", "What Does the Fox Say? – Ylvis"};
        String[] shuffledList = shuffle(playlist);

        System.out.println("Shuffled Playlist:");
        for (String song : shuffledList) {
            System.out.println(song + " ");
        }
        System.out.println();
    }
    public static String[] shuffle(String[] songs) {
        for (int x = 0; x < songs.length - 1; x++) {
            int j = (int) (Math.random()
            * songs.length);

            String temp = songs[x];
            songs [x] = songs[j];
            songs[j] = temp;
        }
        return songs;
    }
}
