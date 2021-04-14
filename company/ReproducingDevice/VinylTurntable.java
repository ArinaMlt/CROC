package com.company.ReproducingDevice;

import com.company.MusicCarriers.MusicCarrier;
import com.company.MusicCarriers.VinylRecord;

public class VinylTurntable extends ReproducingDevice{
    public VinylTurntable(MusicCarrier musicCarrier) {
        super(musicCarrier);
    }

    @Override
    public String NameReproducingDevice() {
        return "vinyl turntable";
    }
    @Override
    public String Play(MusicCarrier musicCarrier) {
        if(musicCarrier instanceof VinylRecord){
        return super.Play(musicCarrier);}
        else {
            return "--> Error!!!";
        }
    }
}
