package com.nohimys.pansilmaluwadeshana.models;

/**
 * Created by Nohim Sandeepa on 12/11/2016.
 */
public class TrackListItem {
    private String trackName;
    private String trackLink;

    public TrackListItem(){

    }

    public TrackListItem(String trackName, String trackLink){
        this.trackLink = trackLink;
        this.trackName = trackName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getTrackLink() {
        return trackLink;
    }
}
