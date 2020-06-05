package com.sud.videotrimmer.interfaces;

import android.net.Uri;

/**
 * Created by sudhirs745@gmail.com
 * (Sr. Android Developer)
 * on
 */
public interface OnTrimVideoListener {

    void getResult(final Uri uri);

    void cancelAction();
}
