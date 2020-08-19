package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args){
        Video video = new Video(); // default constructor : created by the compiler
        video.setVideoName("Baahubali: The Beginning");
        video.setRating(5);
        video.setCheckOut(true);
        System.out.println(
                            "Video Name: " + video.getVideoName() + ", " +
                            "Video Rating: " + video.getRating() + ", " +
                            "Is Video Available: " + video.isCheckOut() + "."
        );
    }
}
