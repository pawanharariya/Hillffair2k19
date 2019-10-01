package com.appteam.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.appteam.hillfair2k19.R;

import java.util.HashMap;
import java.util.Map;

import static com.appteam.hillfair2k19.R.id.fragment;

public class Coupons extends Fragment {

    RelativeLayout relativeLayout;
    String sub_candies;
    String firebase_id = "12345";
    ImageView coupon1, coupon2, coupon3, coupon4, coupon5, coupon6;
    Activity activity;

    public Coupons() {
        // Required empty public constructor
    }

    public Coupons(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void post() {
        RequestQueue queue = Volley.newRequestQueue(getActivity());

        StringRequest stringRequest = new StringRequest(Request.Method.POST, getString(R.string.baseUrl) + "/reward",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Toast.makeText(activity, response, Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //  Toast.makeText(activity, String.valueOf(error), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("firebase_id", firebase_id);
                params.put("sub_candies", sub_candies);
                return params;
            }
        };
        queue.add(stringRequest);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_coupons, container, false);
        relativeLayout = (RelativeLayout) view.findViewById(fragment);

        coupon1 = view.findViewById(R.id.coupon1);
        coupon2 = view.findViewById(R.id.coupon2);
        coupon3 = view.findViewById(R.id.coupon3);
        coupon4 = view.findViewById(R.id.coupon4);
        coupon5 = view.findViewById(R.id.coupon5);
        coupon6 = view.findViewById(R.id.coupon6);
        coupon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "njkldvn", Toast.LENGTH_SHORT).show();
                sub_candies = "100";
                post();
            }
        });
        coupon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub_candies = "200";
                post();
            }
        });
        coupon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub_candies = "300";
                post();
            }
        });
        coupon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub_candies = "400";
                post();
            }
        });
        coupon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub_candies = "500";
                post();
            }
        });
        coupon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub_candies = "600";
                post();
            }
        });
        return view;
    }

}
