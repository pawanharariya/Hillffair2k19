package com.appteam.hillfair2k19;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.google.gson.JsonObject;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class FaceSmash extends Fragment {



    Animation outAnimation;
    Animation inAnimation;

    IResult mResultCallback;
    IResult mResultCallbackAndroidNeworking;

    ArrayList<String> urls;

//    ArrayList<User> users;

    VolleyService mVolleyService;






    public FaceSmash() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        urls=new ArrayList<>();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View inflateView= inflater.inflate(R.layout.fragment_face_smash, container, false);

        initVolleyCallback();

     mVolleyService = new VolleyService(mResultCallback,getContext());


       final VolleyService mVolleyService = new VolleyService(mResultCallback,getContext());

//        for (int i=0;i<5;++i)
//       mVolleyService.getJsonArrayDataVolley("GETJSONARRAYLIFESAVER","/facesmash");


        final String url1="https://cdn.pinkvilla.com/files/styles/contentpreview/public/Katrina-Kaif-6_1.jpg?itok=7sgdn0sS";
        final String url2="https://i2.wp.com/thefrontierpost.com/wp-content/uploads/2018/03/Jacqueline-Fernandez.jpg?fit=1024%2C636&ssl=1";

        urls.add(url1);
        urls.add(url2);
        urls.add(url2);
        urls.add(url1);
        urls.add(url1);
        urls.add(url2);
        urls.add(url2);
        urls.add(url1);
        urls.add(url1);
        urls.add(url2);


        outAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fadeout);
        inAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fadein);



        final ImageView firstPersonImage=inflateView.findViewById(R.id.firstPersonImage);
       final  ImageView secondPersonImage=inflateView.findViewById(R.id.secondPersonImage);


        if(urls.size()>1)
        {  Picasso.with(getContext()).load(urls.get(0)).into(firstPersonImage);
       Picasso.with(getContext()).load(urls.get(1)).into(secondPersonImage);}
else{
            handleNoIMages();
        }


       Picasso.with(getContext()).load(urls.get(0)).into(firstPersonImage);
       Picasso.with(getContext()).load(urls.get(1)).into(secondPersonImage);






        firstPersonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getContext(),"f",Toast.LENGTH_SHORT).show();

                final ImageView btn2=inflateView.findViewById(R.id.heartImageView2);
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        animateHeart(btn2);
                    }
                });
                animateHeart(btn2);


                // TODO: post url and user

//                postresult(urls.get(0),users.get(0));

                if (urls.size()<4) handleNoIMages();

                else{
                Picasso.with(getContext()).load(urls.get(2)).into(firstPersonImage);
                Picasso.with(getContext()).load(urls.get(3)).into(secondPersonImage);



                Picasso.with(getContext()).load(urls.get(2)).into(firstPersonImage);
                Picasso.with(getContext()).load(urls.get(3)).into(secondPersonImage);

                // TODO: post url and user


                urls.remove(0);
                urls.remove(1);

//                    users.remove(0);
//                    users.remove(1);
                }

               // mVolleyService.getJsonArrayDataVolley("GETJSONARRAYLIFESAVER",baseUrl+"/facesmash");



//                urls.add(url2);
//                urls.add(url1);

               // mVolleyService.getJsonArrayDataVolley("GETJSONARRAYLIFESAVER","/facesmash");

                urls.add(url2);
                urls.add(url1);




               //Toast.makeText(getContext(),urls.get(0),Toast.LENGTH_SHORT).show();
                //Toast.makeText(getContext(),urls.get(1),Toast.LENGTH_SHORT).show();




            }
        });






        secondPersonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"f",Toast.LENGTH_SHORT).show();

                final ImageView btn=inflateView.findViewById(R.id.heartImageView);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        animateHeart(btn);
                    }
                });
                animateHeart(btn);



                // TODO: post url and user


//                postresult(urls.get(1),users.get(1));

                if (urls.size()<4) handleNoIMages();

                else{
                    Picasso.with(getContext()).load(urls.get(2)).into(firstPersonImage);
                    Picasso.with(getContext()).load(urls.get(3)).into(secondPersonImage);


                    urls.remove(0);
                    urls.remove(1);

//                    users.remove(0);
//                    users.remove(1);
                    // mVolleyService.getJsonArrayDataVolley("GETJSONARRAYLIFESAVER",baseUrl+"/facesmash");
                    }



                Picasso.with(getContext()).load(urls.get(2)).into(firstPersonImage);
                Picasso.with(getContext()).load(urls.get(3)).into(secondPersonImage);

                // TODO: post url and user

                urls.remove(0);
                urls.remove(1);

                // mVolleyService.getJsonArrayDataVolley("GETJSONARRAYLIFESAVER","/facesmash");


                urls.add(url2);
                urls.add(url1);




            }
        });
//

        return inflateView;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }





    public void animateHeart(final ImageView view) {
        Log.i("S","ssf");
        view.setImageResource(R.drawable.orange_heart);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        prepareAnimation(scaleAnimation);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        prepareAnimation(alphaAnimation);

        AnimationSet animation = new AnimationSet(true);
        animation.addAnimation(alphaAnimation);
        animation.addAnimation(scaleAnimation);
        animation.setDuration(700);
        animation.setFillAfter(true);

        view.startAnimation(animation);

    }

    private Animation prepareAnimation(Animation animation){
        animation.setRepeatCount(1);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;
    }


    void initVolleyCallback(){
        mResultCallback = new IResult() {
            JSONObject obj1;
            JSONObject obj2;
            @Override
            public void notifySuccess(String requestType, JSONObject response , JSONArray jsonArray) {
                if (response != null)
                {
                    //JsonObject
                    Toast.makeText(getContext(), String.valueOf(response), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //JsonArray
                    Toast.makeText(getContext(), String.valueOf(jsonArray), Toast.LENGTH_SHORT).show();
                    try {
                       obj1=jsonArray.getJSONObject(0);
                    obj2=jsonArray.getJSONObject(1);
                    }catch (Exception e){
                        e.printStackTrace();
                    }


                    Iterator<String> it1=obj1.keys();
                    while(it1.hasNext()){
                        String url =it1.next();
                        urls.add(url);

                        // TODO: read user


//                        try {
//                            User user = obj1.get(url);
//                            users.add(user);
//                        } catch (JSONException e) {
//                            // Something went wrong!
//                            e.printStackTrace();
//                        }



                    }

                    Iterator<String> it2=obj2.keys();
                    while(it2.hasNext()){
                        String url =it2.next();
                        urls.add(url);

                        // TODO: read user


//                        try {
//                            User user = obj2.get(url);
//                            users.add(user);
//                        } catch (JSONException e) {
//                            // Something went wrong!
//                            e.printStackTrace();
//                        }

                    }



                }
            }

            @Override
            public void notifyError(String requestType, VolleyError error) {
            }
        };

    }


    void handleNoIMages(){
        new AlertDialog.Builder(getContext())
                .setTitle("No Entries")
                .setMessage("Sorry No Entries Left!")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation

                        //TODO: redirect to home page
                    }
                })

                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

//    void postresult(String imageUrl, User user){
//
//        JSONObject jsonObject = new JSONObject();
//        try {
//    jsonObject.put(imageUrl,user);
//
//} catch (JSONException e) {
//            e.printStackTrace();
//        }
//        mVolleyService.postJsonDataVolley("POSTJSONDATALIFESAVER",baseUrl+"/facesmash",jsonObject);
//    }


}
