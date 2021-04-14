package com.company.ReproducingDevice;

import com.company.MusicCarriers.MusicCarrier;

public class CD extends ReproducingDevice {
    public CD(MusicCarrier musicCarrier) {
        super(musicCarrier);
    }

    @Override
    public String NameReproducingDevice() {
        return "CD";
    }

    @Override
    public String Play(MusicCarrier musicCarrier) {
        if (musicCarrier instanceof com.company.MusicCarriers.CD) {
            return super.Play(musicCarrier);
        } else {
            return "--> Error!!!";
        }
    }
}