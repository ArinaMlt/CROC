package com.company.MusicCarriers;

import com.company.Composition;

/**
 * существует несколько носителей музыкальных композиций (пластинка, сд, флешка и т.д)
 */
public abstract class MusicCarrier {
    private Composition composition;

    public MusicCarrier(Composition composition) {
        this.composition = composition;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }
    public String Author(){
        return "title - "+composition.getTitle()+"\n     performer - "+composition.getArtistName();
    }
    public abstract String getName();
}
