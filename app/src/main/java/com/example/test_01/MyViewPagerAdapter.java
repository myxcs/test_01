package com.example.test_01;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test_01.fragment.DanhSachFragment;
import com.example.test_01.fragment.ThongTinFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DanhSachFragment();
            case 1:
                return new ThongTinFragment();
            default:
                return new DanhSachFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
