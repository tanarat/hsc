package org.hsc.android.islamic;

//import android.R;
import org.hsc.android.MainActivity;
import org.hsc.android.R;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainMenuAdapter extends BaseAdapter {
	private Context mContext;
	private ImageButton buttons[];
    public MainMenuAdapter(Context c) {
        mContext = c;
        
        MainActivity a = (MainActivity)c;
        buttons = a.getButtons();
        
        

        
    }

    public int getCount() {
        return buttons.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }
    
    @Override
    public View getView(int position, View view, ViewGroup parent) {
    	// TODO Auto-generated method stub
    	ImageButton button;
    	if(view == null){
//    		button = new ImageButton(mContext);
//    		button.setImageResource(R.drawable.icon_eval_form_1);
    		button = buttons[position];
    	}else{
    		button = (ImageButton)view;
    	}

        return button;
    }

//    // create a new ImageView for each item referenced by the Adapter
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//        if (convertView == null) {  // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;
//    }

    // references to our images
    private Integer[] iconsImgs = {
            	R.drawable.menu_eval_form
            , R.drawable.menu_enumber,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7
    };




}
