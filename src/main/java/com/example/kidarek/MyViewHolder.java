package com.example.kidarek;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yacineyakoubi on 4/20/17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTextView;
    public ImageView coverImageView;
   // public ImageView likeImageView;
   // public ImageView shareImageView;

    public MyViewHolder(View v) {
        super(v);
        titleTextView = (TextView) v.findViewById(R.id.prodTitle);
        coverImageView = (ImageView) v.findViewById(R.id.prodImage);
       // likeImageView = (ImageView) v.findViewById(R.id.likeImageView);
        //shareImageView = (ImageView) v.findViewById(R.id.shareImageView);
        /*likeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = (int)likeImageView.getTag();
                if( id == R.drawable.ic_like){

                    likeImageView.setTag(R.drawable.ic_liked);
                    likeImageView.setImageResource(R.drawable.ic_liked);

                    Toast.makeText(getActivity(),titleTextView.getText()+"
                            added to favourites",Toast.LENGTH_SHORT).show();

                }else{
                    likeImageView.setTag(R.drawable.ic_like);
                    likeImageView.setImageResource(R.drawable.ic_like);
                    Toast.makeText(getActivity(),titleTextView.getText()+"
                            removed from favourites",Toast.LENGTH_SHORT).show();
                }
            }
        });

        shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                        "://" + getResources().getResourcePackageName(coverImageView.getId())
                        + '/' + "drawable" + '/' +
                        getResources().getResourceEntryName((int)coverImageView.getTag()));
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM,imageUri);
                shareIntent.setType("image/jpeg");
                startActivity(Intent.createChooser
                        (shareIntent, getResources().getText(R.string.send_to)));
            }
        });
        */
    }
}
