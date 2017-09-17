package com.shape.notification;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class nextBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(50f, 64f);			lineTo(0f, 64f);			lineTo(0f, 0f);			lineTo(50f, 0f);			lineTo(50f, 64f);	}}class Path1 extends Path{  	public Path1() {			moveTo(48f, 15f);			lineTo(48f, 49f);			quadTo(48f, 62f, 35f, 62f);			lineTo(15f, 62f);			quadTo(2f, 62f, 2f, 49f);			lineTo(2f, 15f);			quadTo(2f, 2f, 15f, 2f);			lineTo(35f, 2f);			quadTo(48f, 2f, 48f, 15f);	}}class Path2 extends Path{  	public Path2() {			moveTo(46f, 15f);			lineTo(46f, 49f);			quadTo(46f, 60f, 35f, 60f);			lineTo(15f, 60f);			quadTo(4f, 60f, 4f, 49f);			lineTo(4f, 15f);			quadTo(4f, 4f, 15f, 4f);			lineTo(35f, 4f);			quadTo(46f, 4f, 46f, 15f);	}}class Path3 extends Path{  	public Path3() {			moveTo(18.7f, 23.2f);			quadTo(19.3f, 22.65f, 20.05f, 22.65f);			quadTo(20.8f, 22.65f, 21.3f, 23.2f);			lineTo(28.25f, 29.85f);			quadTo(30.6f, 31.85f, 28.25f, 33.8f);			lineTo(21.3f, 40.8f);			quadTo(20.8f, 41.35f, 20.05f, 41.35f);			quadTo(19.3f, 41.35f, 18.7f, 40.8f);			quadTo(18.25f, 40.3f, 18.2f, 39.7f);			lineTo(18.2f, 24.2f);			lineTo(18.25f, 24.2f);			quadTo(18.35f, 23.65f, 18.7f, 23.2f);	}}class Path4 extends Path{  	public Path4() {			moveTo(29.85f, 23.8f);			quadTo(29.85f, 23.4f, 30.15f, 23.1f);			quadTo(30.45f, 22.8f, 30.85f, 22.8f);			quadTo(31.25f, 22.8f, 31.55f, 23.1f);			lineTo(31.85f, 23.8f);			lineTo(31.85f, 40.25f);			lineTo(31.55f, 40.95f);			quadTo(31.25f, 41.25f, 30.85f, 41.25f);			lineTo(30.15f, 40.95f);			quadTo(29.85f, 40.65f, 29.85f, 40.25f);			lineTo(29.85f, 23.8f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x0054497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0x00d35d69); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0x00352e4d); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFF000000); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0xFF000000); 		public Path4 S4 = new Path4();		public static float Ht = 64F; 		public static float Wh = 50F;  		public nextBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x0054497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0x00d35d69);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0x00352e4d);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFF000000);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0xFF000000);			P4.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final nextBtn viewImg = new nextBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static nextBtn getShape(){		   final nextBtn viewImg = new nextBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 