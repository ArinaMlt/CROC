package com.company.MusicCarriers;

import com.company.Composition;

public class CD extends MusicCarrier{
    public CD(Composition composition) {
        super(composition);
    }

    @Override
    public String getName() {
        return "CD";
    }
}
