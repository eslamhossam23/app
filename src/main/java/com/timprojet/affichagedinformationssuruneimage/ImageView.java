package com.timprojet.affichagedinformationssuruneimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Havoc on 0005-05-11-2016.
 */

public class ImageView extends View {
    public Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cheopspyramid);
    public Paint paint = new Paint();
    public Bitmap resizedImage;
//    public int width = bitmap.getWidth();
//    public int height = bitmap.getHeight();
//    public int[] pixels = new int[width * height];
    public ImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
//        bitmap.getPixels(pixels, 0, bitmap.getWidth(), 0,0, width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        resizedImage = Bitmap.createScaledBitmap(bitmap, this.getWidth(), this.getHeight(), true);
        canvas.drawBitmap(resizedImage, 0, 0, paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
