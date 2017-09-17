package com.shape.home.playlist;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class songDrager extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(0f, 44f);			lineTo(0f, 0f);			lineTo(30f, 0f);			lineTo(30f, 44f);			lineTo(0f, 44f);	}}class Path1 extends Path{  	public Path1() {			moveTo(0f, 0f);			lineTo(30f, 0f);			lineTo(30f, 42f);			lineTo(0f, 42f);			lineTo(0f, 0f);	}}class Path2 extends Path{  	public Path2() {			moveTo(8.7f, 23f);			lineTo(8.7f, 21f);			lineTo(21.3f, 21f);			lineTo(21.3f, 23f);			lineTo(8.7f, 23f);	}}class Path3 extends Path{  	public Path3() {			moveTo(11.2f, 27.35f);			lineTo(11.2f, 25.35f);			lineTo(19.2f, 25.35f);			lineTo(19.2f, 27.35f);			lineTo(11.2f, 27.35f);	}}class Path4 extends Path{  	public Path4() {			moveTo(11.2f, 18.65f);			lineTo(11.2f, 16.65f);			lineTo(19.2f, 16.65f);			lineTo(19.2f, 18.65f);			lineTo(11.2f, 18.65f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFF292440); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF2d2846); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0x4dffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0x4dffffff); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0x4dffffff); 		public Path4 S4 = new Path4();		public static float Ht = 44F; 		public static float Wh = 30F;  		public songDrager(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFF292440);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF2d2846);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0x4dffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0x4dffffff);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0x4dffffff);			P4.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final songDrager viewImg = new songDrager(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static songDrager getShape(){		   final songDrager viewImg = new songDrager(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 