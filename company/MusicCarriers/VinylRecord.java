package com.company.MusicCarriers;

import com.company.Composition;

public class VinylRecord extends MusicCarrier{
    public VinylRecord(Composition composition) {
        super(composition);
    }

    @Override
    public String getName() {
        return "vinyl record";
    }
}
