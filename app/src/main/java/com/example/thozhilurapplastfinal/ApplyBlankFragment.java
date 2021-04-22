package com.example.thozhilurapplastfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ApplyBlankFragment extends Fragment {

   /* private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public ApplyBlankFragment() {
        // Required empty public constructor
    }*/
    View view;
    EditText username,useraddress,useradhar,userbank;
    TextView userverify;
    Button userapply,userphoto,useradharpic,userbankpic;
    String username1,useraddress1,useradhar1,userbank1,userverify1;
   // DatabaseReference fb_to_read = FirebaseDatabase.getInstance().getReference("users"+"/"+"workers"+"/"+"mobworker"+"/"+"applieddetails");
    //fb_to_read.addValueEventListener(new ValueEventListener)
   /* public static ApplyBlankFragment newInstance(String param1, String param2) {
        ApplyBlankFragment fragment = new ApplyBlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_apply_blank, container, false);
        username=(EditText)view.findViewById(R.id.edit_name);
        useraddress=(EditText)view.findViewById(R.id.editTextTextPostalAddress);
        useradhar=(EditText)view.findViewById(R.id.edit_adhar);
        userverify=(TextView)view.findViewById(R.id.verifiedmsg_textView3);
        userbank=(EditText)view.findViewById(R.id.edit_bank);
        userapply=(Button)view.findViewById(R.id.apply);
          userphoto=(Button)view.findViewById(R.id.userpic);
        useradharpic=(Button)view.findViewById(R.id.adharpic);
        userbankpic=(Button)view.findViewById(R.id.bankpic);
       userapply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               username1 = username.getText().toString();
               useraddress1 = useraddress.getText().toString();
               useradhar1 = useradhar.getText().toString();
               userbank1=userbank.getText().toString();


               FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
               String user_id = "users"+"/"+"workers";

               if(useradhar1.length() == 12)
               {
              //     String details = user_id + "/" + mobworker + "/" + "applydetails";
                //   String workername = details + "/" + "name";
                  // String num = details + "/" + "mobile";
                   //String passwordpath = details + "/" + "password1";
               }
           }
       });


        return view;
    }
}