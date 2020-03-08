package com.example.chillme.model;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyCanvas extends View {
        private Paint brush;
        public Path path,path2,path3,path4;
        public int color;


        public MyCanvas(Context context,int color) {
            super(context);
            Log.d("MYCANVAS","constructor");
            this.color=color;
            init();
        }

        public void init(){
            brush=new Paint();
            brush.setAntiAlias(true);
            brush.setStrokeWidth(10f);
            brush.setColor(color);
            brush.setStyle(Paint.Style.STROKE);
            brush.setStrokeJoin(Paint.Join.ROUND);
            path=new Path();
            path2=new Path();
            path3=new Path();
            path4=new Path();

        }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("MYCANVAS","draw");
        canvas.drawPath(path, brush);
        canvas.drawPath(path2, brush);
        canvas.drawPath(path3, brush);
        canvas.drawPath(path4, brush);
    }




        @Override

        public boolean onTouchEvent(MotionEvent event) {
            Log.d("MYCANVAS","onTouch");
            float hh=getHeight()/2;
            float hw=getWidth()/2;
            float x1= event.getX();
            float y1 = event.getY();
            float x2=hw-(x1-hw);
            float y2=hh-(y1-hh);
            float x3=x1;
            float y3=hh-(y1-hh);
            float x4=hw-(x1-hw);
            float y4=y1;




            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    // Set a new starting point
                    path.moveTo(x1, y1);
                    path2.moveTo(x2,y2);
                    path3.moveTo(x3,y3);
                    path4.moveTo(x4,y4);

                    return true;
                case MotionEvent.ACTION_MOVE:
                    // Connect the points
                    path.lineTo(x1, y1);
                    path2.lineTo(x2,y2);
                    path3.lineTo(x3,y3);
                    path4.lineTo(x4,y4);
                    break;
                default:
                    return false;
            }

            // Makes our view repaint and call onDraw
            invalidate();
            return true;
        }
        private void line(float x1,float y1,float x2,float y2){
            path.moveTo(getWidth()/4+x1,getHeight()/4+y1);
            path.lineTo(getWidth()/4+x2,getHeight()/4+y2);
        }

    }

