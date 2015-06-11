package tv.rustychicken.presshere;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PageThreeFragment extends Fragment {
    public PageThreeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page_three, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.pageThreeActionButton)
    public void pageFour(Button button) {
        PageTwoFragment pageFour = new PageTwoFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.abc_slide_in_top, R.anim.abc_slide_out_bottom);
        transaction.replace(R.id.fragment, pageFour);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    
}
