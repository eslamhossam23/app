package com.timprojet.affichagedinformationssuruneimage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Havoc on 0006-06-11-2016.
 */

public class ScreenSlidePageFragment extends Fragment {


    public ScreenSlidePageFragment(){
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        if(this.getArguments().get("title") != null){
            TextView title = (TextView)rootView.findViewById(R.id.title);
            SpannableString underlined = new SpannableString((this.getArguments().get("title")).toString());
            underlined.setSpan(new UnderlineSpan(), 0,  underlined.length(), 0);
            title.setText(underlined);
            TextView content = (TextView)rootView.findViewById(R.id.content);
            content.setText((this.getArguments().get("content")).toString());
        }

        return rootView;
    }


}
