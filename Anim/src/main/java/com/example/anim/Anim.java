package com.example.anim;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

public class Anim  {
    public static class DepthTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        if (position < -1) {    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setTranslationX(0);
            page.setScaleX(1);
            page.setScaleY(1);

        } else if (position <= 1) {    // (0,1]
            page.setTranslationX(-position * page.getWidth());
            page.setAlpha(1 - Math.abs(position));
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));

        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class ZoomOutTransformation implements ViewPager.PageTransformer {

    private static final float MIN_SCALE = 0.65f;
    private static final float MIN_ALPHA = 0.3f;

    @Override
    public void transformPage(View page, float position) {

        if (position < -1) {  // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 1) { // [-1,1]

            page.setScaleX(Math.max(MIN_SCALE, 1 - Math.abs(position)));
            page.setScaleY(Math.max(MIN_SCALE, 1 - Math.abs(position)));
            page.setAlpha(Math.max(MIN_ALPHA, 1 - Math.abs(position)));

        } else {  // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class Clock_SpinTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());

        if (Math.abs(position) <= 0.5) {
            page.setVisibility(View.VISIBLE);
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));
        } else if (Math.abs(position) > 0.5) {
            page.setVisibility(View.GONE);
        }


        if (position < -1) {  // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {   // [-1,0]
            page.setAlpha(1);
            page.setRotation(360 * Math.abs(position));

        } else if (position <= 1) {   // (0,1]
            page.setAlpha(1);
            page.setRotation(-360 * Math.abs(position));

        } else {  // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class AntiClockSpinTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());

        if (Math.abs(position) < 0.5) {
            page.setVisibility(View.VISIBLE);
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));
        } else if (Math.abs(position) > 0.5) {
            page.setVisibility(View.GONE);
        }

        if (position < -1) {  // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setRotation(360 * (1 - Math.abs(position)));

        } else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setRotation(-360 * (1 - Math.abs(position)));

        } else {  // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class FidgetSpinTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());

        if (Math.abs(position) < 0.5) {
            page.setVisibility(View.VISIBLE);
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));
        } else if (Math.abs(position) > 0.5) {
            page.setVisibility(View.GONE);
        }


        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setRotation(36000 * (Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position)));

        } else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setRotation(-36000 * (Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position) * Math.abs(position)));

        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class VerticalFlipTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());
        page.setCameraDistance(12000);

        if (position < 0.5 && position > -0.5) {
            page.setVisibility(View.VISIBLE);
        } else {
            page.setVisibility(View.INVISIBLE);
        }


        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setRotationY(180 * (1 - Math.abs(position) + 1));

        } else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setRotationY(-180 * (1 - Math.abs(position) + 1));

        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class HorizontalFlipTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());
        page.setCameraDistance(20000);

        if (position < 0.5 && position > -0.5) {
            page.setVisibility(View.VISIBLE);
        } else {
            page.setVisibility(View.INVISIBLE);
        }


        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setRotationX(180 * (1 - Math.abs(position) + 1));

        } else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setRotationX(-180 * (1 - Math.abs(position) + 1));

        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class PopTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());

        if (Math.abs(position) < 0.5) {
            page.setVisibility(View.VISIBLE);
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));
        } else if (Math.abs(position) > 0.5) {
            page.setVisibility(View.GONE);
        }


    }
}

public static class FadeOutTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());

        page.setAlpha(1 - Math.abs(position));


    }
}

public static class CubeOutRotationTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        if (position < -1) {    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(-90 * Math.abs(position));

        } else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(90 * Math.abs(position));

        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }
    }
}

public static class CubeInDepthTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setCameraDistance(20000);


        if (position < -1) {
            page.setAlpha(0);
        } else if (position <= 0) {
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(90 * Math.abs(position));
        } else if (position <= 1) {
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(-90 * Math.abs(position));
        } else {
            page.setAlpha(0);
        }


        if (Math.abs(position) <= 0.5) {
            page.setScaleY(Math.max(.4f, 1 - Math.abs(position)));
        } else if (Math.abs(position) <= 1) {
            page.setScaleY(Math.max(.4f, 1 - Math.abs(position)));

        }


    }


}

public static class CubeInScalingTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setCameraDistance(20000);


        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0){    // [-1,0]
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(90*Math.abs(position));

        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(-90*Math.abs(position));

        }
        else{    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }



        if (Math.abs(position) <= 0.5){
            page.setScaleY(Math.max(.4f,1-Math.abs(position)));
        }
        else if (Math.abs(position) <= 1){
            page.setScaleY(Math.max(.4f,Math.abs(position)));

        }


    }
}

public static class CubeOutScalingTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        if (position < -1){    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(-90 * Math.abs(position));

        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(90 * Math.abs(position));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }



        if (Math.abs(position) <= 0.5){
            page.setScaleY(Math.max(0.4f,1-Math.abs(position)));
        }
        else if (Math.abs(position) <= 1){
            page.setScaleY(Math.max(0.4f,Math.abs(position)));
        }


    }
}

public static class CubeInRotationTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setCameraDistance(20000);


        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0){    // [-1,0]
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(90*Math.abs(position));

        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(-90*Math.abs(position));

        }
        else{    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class HingeTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());
        page.setPivotX(0);
        page.setPivotY(0);


        if (position < -1){    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0){    // [-1,0]
            page.setRotation(90*Math.abs(position));
            page.setAlpha(1-Math.abs(position));

        }
        else if (position <= 1){    // (0,1]
            page.setRotation(0);
            page.setAlpha(1);

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class GateTransformation implements ViewPager.PageTransformer{

    private String TAG  = "GateAnimationn";
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());



        if (position<-1){    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position<=0){    // [-1,0]
            page.setAlpha(1);
            page.setPivotX(0);
            page.setRotationY(90*Math.abs(position));

        }
        else if (position <=1){    // (0,1]
            page.setAlpha(1);
            page.setPivotX(page.getWidth());
            page.setRotationY(-90*Math.abs(position));

        }else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class TossTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());
        page.setCameraDistance(20000);


        if (position < 0.5 && position > -0.5) {
            page.setVisibility(View.VISIBLE);

        } else {
            page.setVisibility(View.INVISIBLE);

        }


        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setScaleX(Math.max(0.4f, (1 - Math.abs(position))));
            page.setScaleY(Math.max(0.4f, (1 - Math.abs(position))));
            page.setRotationX(1080 * (1 - Math.abs(position) + 1));
            page.setTranslationY(-1000*Math.abs(position));

        }
        else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setScaleX(Math.max(0.4f, (1-Math.abs(position))));
            page.setScaleY(Math.max(0.4f, (1-Math.abs(position))));
            page.setRotationX(-1080 * (1 - Math.abs(position) + 1));
            page.setTranslationY(-1000*Math.abs(position));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }
    }
}

public static class FanTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());
        page.setPivotX(0);
        page.setPivotY(page.getHeight()/2);
        page.setCameraDistance(20000);

        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0){    // [-1,0]
            page.setAlpha(1);
            page.setRotationY(-120*Math.abs(position));
        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setRotationY(120*Math.abs(position));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class SpinnerTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position * page.getWidth());
        page.setCameraDistance(12000);

        if (position < 0.5 && position > -0.5) {
            page.setVisibility(View.VISIBLE);
        } else {
            page.setVisibility(View.INVISIBLE);
        }



        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0) {    // [-1,0]
            page.setAlpha(1);
            page.setRotationY(900 *(1-Math.abs(position)+1));

        }
        else if (position <= 1) {    // (0,1]
            page.setAlpha(1);
            page.setRotationY(-900 *(1-Math.abs(position)+1));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}

public static class VerticalShutTransformation implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());
        page.setCameraDistance(999999999);

        if (position < 0.5 && position > -0.5){
            page.setVisibility(View.VISIBLE);
        }
        else {
            page.setVisibility(View.INVISIBLE);
        }



        if (position < -1){     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        }
        else if (position <= 0 ){    // [-1,0]
            page.setAlpha(1);
            page.setRotationX(180*(1-Math.abs(position)+1));

        }
        else if (position <= 1){    // (0,1]
            page.setAlpha(1);
            page.setRotationX(-180*(1-Math.abs(position)+1));

        }
        else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }


    }
}
}