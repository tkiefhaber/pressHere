package tv.rustychicken.presshere;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
    public void sayHi(Button button) {
        button.setText("Hello!");
        Toast.makeText(getActivity().getApplicationContext(), "boom", Toast.LENGTH_LONG).show();
    }
}
