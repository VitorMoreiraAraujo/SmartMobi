package com.example.smartmobi;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AlagamentoFragment extends Fragment {

    WebView myWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_alagamento_layout, container, false);

        myWebView = view.findViewById(R.id.idWebView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.google.com/maps/d/embed?mid=1pd-5IwhCQlzfPOqOc0ILsULCqhM&hl=pt_BR&ehbc=2E312F");
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        class mywebClient extends WebViewClient {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view,url,favicon);
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }


        }



        return view;
    }





}