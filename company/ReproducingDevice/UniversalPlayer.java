package com.company.ReproducingDevice;

import com.company.MusicCarriers.MusicCarrier;
import com.company.MusicCarriers.USB;

public class UniversalPlayer extends ReproducingDevice{
    public UniversalPlayer(MusicCarrier musicCarrier) {
        super(musicCarrier);
    }

    @Override
    public String NameReproducingDevice() {
        return "universal player";
    }
    @Override
    public String Play(MusicCarrier musicCarrier) {
        if(musicCarrier instanceof USB){
        return super.Play(musicCarrier);}
        else {
            return "--> Error!!!";
        }
    }
}
