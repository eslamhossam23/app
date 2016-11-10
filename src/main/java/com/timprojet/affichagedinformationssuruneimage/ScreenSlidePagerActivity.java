package com.timprojet.affichagedinformationssuruneimage;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ScreenSlidePagerActivity extends FragmentActivity {
    public static FragmentActivity fragmentActivity;

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 3;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private VerticalViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fragmentActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (VerticalViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }


    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private static class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            ScreenSlidePageFragment screenSlidePageFragment = new ScreenSlidePageFragment();
            Bundle args = new Bundle();
            screenSlidePageFragment.setArguments(args);
            switch (position){
                case 0:  args.putString("title", "Cheops Pyramid");
                    args.putString("content", "La pyramide de Khéops ou grande pyramide de Gizeh est un monument construit par les Égyptiens de l'Antiquité, formant une pyramide à base carrée. Tombeau présumé du pharaon Khéops, elle fut édifiée il y a plus de 4 500 ans, sous la IVe dynastie, au centre du complexe funéraire de Khéops se situant à Gizeh en Égypte. Elle est la plus grande des pyramides de Gizeh.");
                    args.putInt("position", position);
                    return screenSlidePageFragment;
                case 1: args.putString("title", "Informations utiles");
                    args.putString("content", "Commanditaire\tKhéops\n" +
                            "IVe dynastie\n" +
                            "Autre nom\tȝḫt ḫwfw\n" +
                            "L'horizon de Khéops\n" +
                            "Construction\tvers 2560 av. J.-C.\n" +
                            "Type\tPyramide à faces lisses\n" +
                            "Hauteur\tinitiale 146,58 mètres (~ 280 coudées) aujourd'hui 137 mètres\n" +
                            "Base\t~ 230,35 mètres (~ 440 coudées)\n" +
                            "Volume\t2 592 341 m³\n" +
                            "Inclinaison\t51°50'34\"\n" +
                            "Pente\t14/11\n");
                    args.putInt("position", position);
                    return screenSlidePageFragment;
                case 2: args.putString("title", "Description");
                    args.putString("content", "Ce monument forme une pyramide à base carrée de 440 coudées royales anciennes, soit environ 230,5 mètres. Les valeurs empiriques d'aujourd'hui sont au sud de 230,454 m ; au nord 230,253 m ; à l'ouest 230,357 m ; à l'est 230,394 m, soit une erreur pour obtenir un carré parfait de seulement 0,05 %.");
                    args.putInt("position", position);
                    return screenSlidePageFragment;

                default: return screenSlidePageFragment;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}