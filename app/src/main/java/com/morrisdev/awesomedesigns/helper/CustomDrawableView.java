package com.morrisdev.awesomedesigns.helper;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by mac on 6/26/18.
 */

public class CustomDrawableView extends View {
    Paint paint;

    public CustomDrawableView(Context context) {
        super(context);
    }

    void init(){
        paint =  new Paint();
    }


}
