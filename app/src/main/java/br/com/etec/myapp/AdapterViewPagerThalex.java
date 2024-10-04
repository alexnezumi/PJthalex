package br.com.etec.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterViewPagerThalex extends FragmentStateAdapter {
    public AdapterViewPagerThalex(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChaveirosFragment();
            case 1:
                return new PulseirasFragment();
            case 2:
                return new ColaresFragment();
            case 3:
                return new AdesivosFragment();
            default:
                return new ChaveirosFragment();
        }
    }


    @Override
    public int getItemCount() {
        return 4;
    }
}
