package com.github.fidelity.lio.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.fidelity.lio.R;
import com.github.fidelity.lio.ui.fragment.WelcomeWizardFragment;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnPageChange;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pager)
    ViewPager viewPager;

    @BindView(R.id.oval_1)
    ImageView ovalOne;

    @BindView(R.id.oval_2)
    ImageView ovalTwo;

    @BindView(R.id.oval_3)
    ImageView ovalThree;

    @BindDrawable(R.drawable.oval_button_white)
    Drawable whiteOvalButton;

    @BindDrawable(R.drawable.overlay_oval_button)
    Drawable overlayWhiteOvalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ScreenSlidePagerAdapter screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(screenSlidePagerAdapter);
    }

    @OnClick(R.id.registerButton)
    public void registerButtonOnClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.loginButton)
    public void loginButtonOnClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            System.gc();
            return WelcomeWizardFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 3;
        }

    }

    @OnPageChange(R.id.pager)
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                changeColorIndicator(true, false, false);
                break;
            case 1:
                changeColorIndicator(false, true, false);
                break;
            case 2:
                changeColorIndicator(false, false, true);
                break;
        }
    }

    private void changeColorIndicator(boolean one, boolean two, boolean three) {
        ovalOne.setBackgroundDrawable(overlayWhiteOvalButton);
        ovalTwo.setBackgroundDrawable(overlayWhiteOvalButton);
        ovalThree.setBackgroundDrawable(overlayWhiteOvalButton);
        if (one) {
            ovalOne.setBackgroundDrawable(whiteOvalButton);
        }

        if (two) {
            ovalTwo.setBackgroundDrawable(whiteOvalButton);
        }

        if (three) {
            ovalThree.setBackgroundDrawable(whiteOvalButton);
        }
    }
}
