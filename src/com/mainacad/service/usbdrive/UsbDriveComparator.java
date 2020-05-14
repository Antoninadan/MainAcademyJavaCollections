package com.mainacad.service.usbdrive;

import java.util.Comparator;

public class UsbDriveComparator implements Comparator<UsbDrive> {
    @Override
    public int compare(UsbDrive a, UsbDrive b) {
        if (a.capacity > b.capacity) {
            return -1;
        } else if (a.capacity < b.capacity) {
            return 1;
        } else return 0;
    }
}
