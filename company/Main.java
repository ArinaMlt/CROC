package com.company;

import com.company.MusicCarriers.CD;
import com.company.MusicCarriers.MusicCarrier;
import com.company.MusicCarriers.USB;
import com.company.MusicCarriers.VinylRecord;
import com.company.ReproducingDevice.ReproducingDevice;
import com.company.ReproducingDevice.UniversalPlayer;
import com.company.ReproducingDevice.VinylTurntable;

import java.util.Scanner;

public class Main {
    /**
     * "Музыкальная система"
     *
     * существуют несколько звуковоспроизводящих устройств (виниловая вертушка, сд, универсальный плеер и т.д.)
     * существует несколько носителей музыкальных композиций (пластинка, сд, флешка и т.д)
     * существуют несколько песен, у которых есть имя исполнителя (группы) и название
     * Звуковоспроизводящее устройство должно выводить в консоль информацию о том, что за устройство воспроизводит песню,
     *   ее исполнителя и название. В случае, если устройство не может воспроизвести музыку с требуемого носителя выводить
     *   соответствующее сообщение
     */
    public static void main(String[] args) {

        Composition Rosamund = new Composition("Welcome home","Marc Canham");
        Composition Mozart = new Composition("Ave verum corpus","Mozart");
        Composition Maluma = new Composition("Parce","Maluma");

        MusicCarrier cd = new CD(Rosamund); //запись песни на диск
        MusicCarrier vinyl = new VinylRecord(Mozart);//запись песни на винил
        MusicCarrier usb = new USB(Maluma);//запись песни на usb

        ReproducingDevice recordCD = new com.company.ReproducingDevice.CD(cd);//создаем проигрывающее устройство
        ReproducingDevice recordCD1 = new com.company.ReproducingDevice.VinylTurntable(cd);
        ReproducingDevice recordUniversal = new UniversalPlayer(usb);
        ReproducingDevice recordVinyl = new VinylTurntable(vinyl);


        System.out.println(recordCD.Play(cd)+"\n");
        System.out.println(recordCD1.Play(cd)+"\n");
        System.out.println(recordVinyl.Play(vinyl)+"\n");
        System.out.println(recordUniversal.Play(usb)+"\n");

        }


}
