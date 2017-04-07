package com.example.administrator.autoview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/4/7 08:58
 */

public class VeiwSet extends RelativeLayout{
    private Button btn;
    private ImageView img;
    private TextView tv;

    public VeiwSet(Context context) {
        super(context);
    }

    public VeiwSet(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.view, this, true);
        btn = (Button) view.findViewById(R.id.btn);
        tv = (TextView) view.findViewById(R.id.tv);
        img = (ImageView) view.findViewById(R.id.img);

        TypedArray typedArray = context.getResources().obtainAttributes(attrs, R.styleable.SytlsView);
        if(typedArray!=null)
        {
            int color = typedArray.getColor(R.styleable.SytlsView_btn, Color.RED);
            btn.setBackgroundColor(color);
            String  name= typedArray.getString(R.styleable.SytlsView_tv);
            tv.setText(name);
            Drawable drawable = typedArray.getDrawable(R.styleable.SytlsView_img);
            img.setImageDrawable(drawable);
        }
        typedArray.recycle();
    }
    public void setLeftBackOnClickListener(OnClickListener listener){
        btn.setOnClickListener(listener);
    }
    public void seRightBackOnClickListener(OnClickListener listener)
    {
        img.setOnClickListener(listener);
    }
    /*public void setContentBackOnClickListener(OnClickListener listener)
    {
        tv.setOnClickListener(listener);
    }*/
    public void setRight(boolean flag){
        if(flag){
            img.setVisibility(View.VISIBLE);
        }else {
            img.setVisibility(View.GONE);
        }
    }
}
