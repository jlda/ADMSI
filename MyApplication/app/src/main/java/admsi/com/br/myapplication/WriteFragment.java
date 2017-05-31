package admsi.com.br.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WriteFragment extends Fragment {


    public WriteFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_write, container, false);

        Button ID = (Button) rootView.findViewById(R.id.butao);

        ID.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Fragment fragment = new Op1Fragment();
               FragmentTransaction transaction = getFragmentManager().beginTransaction();
               transaction.replace(R.id.write_layout, fragment);
               transaction.commit();
           }
        });
        return rootView;
    }


}
