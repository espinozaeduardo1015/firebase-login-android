package com.imei.infocel.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.imei.infocel.login.perfile.EditarPerfil;
import com.imei.infocel.login.perfile.SignOut;

public class PerfilFragment extends Fragment {
    private Button  signOut;
    Button logout;
    Button perfile;
    Button botoRegistrarImei;

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
//          inflater.inflate(R.layout.fragment_registrar, container, false);
        logout=(Button) v.findViewById(R.id.botoRegistrar);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(getActivity(),SignOut.class);
//                startActivity(new Intent(getActivity(), Registro_imei.class));
                startActivity(registrar);
            }
        });

        perfile=(Button) v.findViewById(R.id.editar);

        perfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(getActivity(),EditarPerfil.class);
//                startActivity(new Intent(getActivity(), Registro_imei.class));
                startActivity(registrar);
            }
        });



        return v;



    }




//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

}
