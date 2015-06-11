package tv.rustychicken.presshere;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
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
        Vibrator myVib = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
        PageTwoFragment pageTwo = new PageTwoFragment();

        myVib.vibrate(50);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit);
        transaction.replace(R.id.fragment, pageTwo);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
