package com.smartitventures.mylibrary;
import android.app.Activity;

import com.getbouncer.cardscan.ScanActivity;
public class ScanCard {
    public ScanCard(Activity context) {
        ScanActivity.start(context);
    }
}
