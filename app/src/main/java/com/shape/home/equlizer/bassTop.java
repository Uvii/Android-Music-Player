package com.shape.home.equlizer;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class bassTop extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(106.85f, 35.2f);			quadTo(110.4f, 44.45f, 110.4f, 55.2f);			quadTo(110.4f, 78.1f, 94.2f, 94.25f);			quadTo(83.9f, 104.55f, 70.85f, 108.3f);			quadTo(63.45f, 110.4f, 55.2f, 110.4f);			quadTo(46.95f, 110.4f, 39.55f, 108.3f);			quadTo(26.5f, 104.55f, 16.15f, 94.25f);			quadTo(0f, 78.1f, 0f, 55.2f);			quadTo(0f, 44.45f, 3.6f, 35.2f);			quadTo(7.55f, 24.75f, 16.15f, 16.2f);			quadTo(32.35f, 0f, 55.2f, 0f);			quadTo(78.05f, 0f, 94.2f, 16.2f);			quadTo(102.8f, 24.75f, 106.85f, 35.2f);			moveTo(104.05f, 36.3f);			quadTo(100.2f, 26.4f, 92.1f, 18.3f);			quadTo(76.8f, 3f, 55.2f, 3f);			quadTo(33.6f, 3f, 18.25f, 18.3f);			quadTo(10.15f, 26.4f, 6.4f, 36.3f);			quadTo(3f, 45.05f, 3f, 55.2f);			quadTo(3f, 76.85f, 18.25f, 92.1f);			quadTo(28.05f, 101.85f, 40.4f, 105.4f);			quadTo(47.4f, 107.4f, 55.2f, 107.4f);			quadTo(63f, 107.4f, 70f, 105.4f);			quadTo(82.35f, 101.85f, 92.1f, 92.1f);			quadTo(107.4f, 76.85f, 107.4f, 55.2f);			quadTo(107.4f, 45.05f, 104.05f, 36.3f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFFd35d69); 		public Path0 S0 = new Path0();		public static float Ht = 110.4F; 		public static float Wh = 110.4F;  		public bassTop(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFFd35d69);			P0.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final bassTop viewImg = new bassTop(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static bassTop getShape(){		   final bassTop viewImg = new bassTop(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 