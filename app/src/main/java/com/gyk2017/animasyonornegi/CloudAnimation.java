package com.gyk2017.animasyonornegi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class CloudAnimation extends View {
	private Bitmap cloudPic;
	private Bitmap cloud;
	private int x = 0;
	private int y = 0;
	private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
	private Rect background = new Rect();

	public CloudAnimation(Context context) {
		super(context);
		
		// Loading the cloud image 
		cloudPic = BitmapFactory.decodeResource(getResources(), R.drawable.cloud);
		
		// Storing a rescaled image 
		cloud = Bitmap.createScaledBitmap(cloudPic, 160, 200, false);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		// ******** Another way to set the background color ********
		background.set(0, 0, canvas.getWidth(), canvas.getHeight());
		
		// Paint flag that enables antialiasing when drawing
		Paint myPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		myPaint.setStyle(Paint.Style.FILL);
		myPaint.setColor(Color.WHITE);
		canvas.drawRect(background, myPaint);
		// ******** Another way to set the background color ********
		
		
		// The background can be set to white using this code as well
		// canvas.drawColor(Color.WHITE);
		
		
		drawCloud(x,y,canvas);
		
		if(x < canvas.getWidth())
			x +=10;
		else {
			y +=10;
			x = 0;
		}
			
		invalidate();
	}

	private void drawCloud(int x2, int y2, Canvas canvas) {
		// TODO Auto-generated method stub
		
		canvas.drawBitmap(cloud, x2, y2, paint);	
	}
	
}
