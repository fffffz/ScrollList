package org.icegeneral.scroll;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Apple on 2016/9/21.
 */

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView tv;

    public MyRecyclerViewHolder(TextView itemView) {
        super(itemView);
        tv = itemView;
    }

}
