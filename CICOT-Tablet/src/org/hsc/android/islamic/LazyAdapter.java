package org.hsc.android.islamic;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.hsc.android.R;
import org.hsc.model.Form;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LazyAdapter extends BaseAdapter {
    
    private Activity activity;
//    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader; 
    
    List<Form> formList;
    
    public LazyAdapter(Activity a, List<Form> formList){
    	this.formList = formList;
    	activity = a;
    	inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    	imageLoader=new ImageLoader(activity.getApplicationContext());
    }
    
    
//    public LazyAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
//        activity = a;
//        data=d;
//        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        imageLoader=new ImageLoader(activity.getApplicationContext());
//    }

    public int getCount() {
//        return data.size();
    	return formList.size();
    }
    
    public Form getItem(int position) {
      return formList.get(position);
  }
    
//    public Object getItem(int position) {
//        return position;
//    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView formNameTV = (TextView)vi.findViewById(R.id.title); // title
        TextView bpNameTV= (TextView)vi.findViewById(R.id.artist); // artist name
        TextView refTV= (TextView)vi.findViewById(R.id.ref); // ref info
        TextView evalDateTV = (TextView)vi.findViewById(R.id.duration); // duration
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image
        
//        HashMap<String, String> song = new HashMap<String, String>();
//        song = data.get(position);
        
        // Setting all values in listview
        
//        title.setText(song.get(FormListActivity.KEY_TITLE));
//        artist.setText(song.get(FormListActivity.KEY_ARTIST));
//        duration.setText(song.get(FormListActivity.KEY_DURATION));
        
        Form form = formList.get(position);
        
        
        
        formNameTV.setText(form.getName());
        String bpName = form.getValue("field0"); 
        bpNameTV.setText((bpName == null)?"":bpName);
        long ref = form.getRef();
        if(ref != 0){
        	refTV.setText(String.valueOf(ref));
        	thumb_image.setImageResource(R.drawable.icon_form_send2server);
        }else{
        	refTV.setText("");
        	thumb_image.setImageResource(R.drawable.icon_eval_form_1);
        }
        
        String evalDateStr = form.getValue("field9");
        if(evalDateStr != null){
        	StringTokenizer evalDateToken = new StringTokenizer(evalDateStr,"-");
        	int year = Integer.parseInt(evalDateToken.nextToken()) + 1900;
        	int month = Integer.parseInt(evalDateToken.nextToken()) + 1;
        	int date = Integer.parseInt(evalDateToken.nextToken());
        	Formatter f = new Formatter();
        	f.format("%d-%02d-%02d", year,month,date);
        	evalDateTV.setText(f.toString());
        }else{
        	evalDateTV.setText("");
        }
//      imageLoader.DisplayImage(url, imageView);
        return vi;
    }


	public void add(Form form) {
		// TODO Auto-generated method stub
		formList.add(form);
	}
}