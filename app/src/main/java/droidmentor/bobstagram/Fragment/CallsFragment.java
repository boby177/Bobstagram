/*  Tanggal Pengerjaan : 19 Mei 2019
    NIM   : 10116334
    Nama  : Boby Maulana Subagja
    Kelas : IF-8
 */

package droidmentor.bobstagram.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import droidmentor.bobstagram.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

}
