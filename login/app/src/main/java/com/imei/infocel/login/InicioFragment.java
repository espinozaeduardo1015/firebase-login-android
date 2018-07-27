package com.imei.infocel.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class InicioFragment extends Fragment{
    private SectionsPageAdapter mSectionsPageAdapter;

    private Button  signOut;
    Button logout;
    Button botoRegistrarImei;

    private ViewPager mViewPager;
    Button con;
    @Nullable
    @Override






    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_inicio,container,false);
        WebView webView = (WebView)v.findViewById(R.id.webWiewEncontrar);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://infoimei-32530.firebaseapp.com/");
        logout=(Button) v.findViewById(R.id.conatel);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(getActivity(),ConatelP.class);
//                startActivity(new Intent(getActivity(), Registro_imei.class));
                startActivity(registrar);
            }
        });


        return v;
        // Inflate the layout for this fragment


   }

}