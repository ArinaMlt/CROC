package com.company.MusicCarriers;

import com.company.Composition;

public class USB extends MusicCarrier{
    public USB(Composition composition) {
        super(composition);
    }

    @Override
    public String getName() {
        return "USB";
    }
}
