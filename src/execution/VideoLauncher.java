/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/08/20
 *  Time: 3:43 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.VideoStore;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore myVideoStore = new VideoStore();
        final String movieName = "Sooryavansham";
        myVideoStore.addVideo(movieName);
        myVideoStore.doCheckout(movieName);
        myVideoStore.doReturn(movieName);
        myVideoStore.receiveRating(movieName, 4);
    }
}