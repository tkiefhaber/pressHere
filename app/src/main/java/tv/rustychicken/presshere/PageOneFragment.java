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


public class PageOneFragment extends Fragment {

    public PageOneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page_one, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.pageOneButton)
    public void pageTwo(Button button) {
        PageTwoFragment pageTwo = new PageTwoFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, pageTwo);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
