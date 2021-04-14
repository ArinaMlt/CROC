package com.company.ReproducingDevice;

import com.company.Composition;
import com.company.MusicCarriers.MusicCarrier;

/**
 * существуют несколько звуковоспроизводящих устройств (виниловая вертушка, сд, универсальный плеер и т.д.)
 */
public abstract class ReproducingDevice {
    private MusicCarrier musicCarrier;

    public MusicCarrier getMusicCarrier() {
        return musicCarrier;
    }

    public void setMusicCarrier(MusicCarrier musicCarrier) {
        this.musicCarrier = musicCarrier;
    }

    public ReproducingDevice(MusicCarrier musicCarrier) {
        this.musicCarrier = musicCarrier;
    }
    public String Play(MusicCarrier musicCarrier){
        Composition composition = musicCarrier.getComposition();
            return "Reproducing device: "+NameReproducingDevice()+"\n"+
                    "Music carrier: "+musicCarrier.getName()+"\n"+
                    "Song: \n     "+musicCarrier.Author();
    }
    public abstract String NameReproducingDevice();
}
