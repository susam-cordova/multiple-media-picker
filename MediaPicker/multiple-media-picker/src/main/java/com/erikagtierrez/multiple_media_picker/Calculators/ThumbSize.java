package com.erikagtierrez.multiple_media_picker.Calculators;

import android.content.Context;
import android.content.res.Resources;

import static com.erikagtierrez.multiple_media_picker.Calculators.DisplaySize.getDefaultDisplayWidthDp;
import static com.erikagtierrez.multiple_media_picker.Calculators.DisplaySize.toPx;

public class ThumbSize {

    public static int getThumbSizeDp() {
        return 130;
    }

    public static int getThumbSizePx(Resources resources) {
        return Math.round(toPx(getThumbSizeDp(), resources));
    }

    public static int countThumbRows(Context context, Resources resources) {
        float width = getDefaultDisplayWidthDp(context, resources);
        int thumbSizeDp = getThumbSizeDp();
        return Math.round(width / thumbSizeDp);
    }

}
