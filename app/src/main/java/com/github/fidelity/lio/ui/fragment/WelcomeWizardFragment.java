package com.github.fidelity.lio.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.fidelity.lio.R;


public class WelcomeWizardFragment extends Fragment {

    private View view;
    private int layout;

    public static WelcomeWizardFragment newInstance(int pageNumber) {
        Bundle args = new Bundle();
        args.putInt(WelcomeWizardFragment.class.getName(), pageNumber);
        WelcomeWizardFragment welcomeWizardFragment = new WelcomeWizardFragment();
        welcomeWizardFragment.setArguments(args);
        return welcomeWizardFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        int pageNumber = getArguments().getInt(WelcomeWizardFragment.class.getName());

        switch (pageNumber) {
            case 1:
                layout = R.layout.fragment_step_two_wizzard_how_to_use_welcome;
                view = inflater.inflate(layout, container, false);
                break;
            case 2:
                layout = R.layout.fragment_step_three_wizzard_how_to_use_welcome;
                break;
            default:
                layout = R.layout.fragment_step_one_wizzard_how_to_use_welcome;
                view = inflater.inflate(layout, container, false);
                break;
        }

        return view;
    }
}
