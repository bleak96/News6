package com.example.asus.news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.example.asus.news.fragments.RecyclerViewFragment;

public class TouchListener implements RecyclerView.OnItemTouchListener{
    private GestureDetector gestureDetector;

    public TouchListener(Context context, final RecyclerView recyclerView, final RecyclerViewFragment.OnClickListener onClickListener) {

        gestureDetector = new GestureDetector(context , new GestureDetector.SimpleOnGestureListener() {

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (null != onClickListener && null != child) {
                    onClickListener.onClick(child, recyclerView.getChildLayoutPosition(child));
                }

                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (null != onClickListener && null != child) {
                    onClickListener.onLongClick(child, recyclerView.getChildLayoutPosition(child));
                }
            }
        });
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent motionEvent) {

    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return false;

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
