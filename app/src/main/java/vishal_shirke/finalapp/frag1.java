package vishal_shirke.finalapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class frag1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_frag1, container, false);

        WebView view = (WebView) root.findViewById(R.id.web1);
        view.getSettings() .setJavaScriptEnabled(true);
        view.loadUrl("http://hackathon.my-hub.in/ncpcr.html");

        return root;
    }


}
