package com.erikagtierrez.multiple_media_picker.Calculators;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

public class DisplaySize {

    static public float getDefaultDisplayWidthDp(Context context, Resources resources) {
        Point size = getScreenSize(context);
        return toDp(size.x, resources);
    }

    static public float getHeightDp(Context context, Resources resources) {
        Point size = getScreenSize(context);
        return toDp(size.y, resources);
    }

    static public float toPx(int sizeDp, Resources resources) {
        float density = getDensity(resources);
        return density * sizeDp;
    }

    static public float toDp(int sizePx, Resources resources) {
        float density = getDensity(resources);
        return sizePx / density;
    }

    static private Point getScreenSize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    static private float getDensity(Resources resources) {
        return resources.getDisplayMetrics().density;
    }

}
