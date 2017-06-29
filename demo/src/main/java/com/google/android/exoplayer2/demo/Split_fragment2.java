package com.google.android.exoplayer2.demo;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;

import android.support.v7.app.AppCompatActivity;

import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

/**
 * Created by Priyanshi on 15-06-2017.
 */
public class Split_fragment2 extends Fragment {

    public static Split_fragment2 getInstance() {
        return new Split_fragment2();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.split_fragment2, container, false);

        return view;
    }
}

