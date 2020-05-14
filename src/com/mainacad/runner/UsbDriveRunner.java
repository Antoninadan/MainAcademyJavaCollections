package com.mainacad.runner;

import com.mainacad.service.usbdrive.UsbDrive;
import com.mainacad.service.usbdrive.UsbDriveComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class UsbDriveRunner {
    public static void main(String[] args) {
        TreeSet<UsbDrive> ts=new TreeSet<>(new UsbDriveComparator());
        ts.add(new UsbDrive(8,"Kingstion"));
        ts.add(new UsbDrive(16,"Transdent"));
        ts.add(new UsbDrive(4,"Apach"));

        Iterator<UsbDrive> itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
