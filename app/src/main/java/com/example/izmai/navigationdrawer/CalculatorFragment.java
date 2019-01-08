package com.example.izmai.navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorFragment extends Fragment {

    Button but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,del,umn,ud,minus,plus,ravno,point;
    TextView vvod,vivod;
    String primer="";
    String cash="0";
    String result="";
    Float a,b;

    public String remove(String s){
        if(s.length()>0){return s.substring(0, s.length()-1);}else {return "";}
    }
    public String summ(String s){
        float result=0;
        char[] prm= s.toCharArray();
        String chslo1="",chslo2="";
        int control=0;
        char znak='0';
        for(int i = 0; i < prm.length; i++) {
            if (prm[i]=='-'||prm[i]=='/'||prm[i]=='+'||prm[i]=='*'){
                znak=prm[i];
                if(control==0){control=1;}
                chslo1=Float.toString(result);
                chslo2="";
            } else {
                if (control==0){
                    chslo1=chslo1+prm[i];}
                else {if (control==1){chslo2=chslo2+prm[i];}}
            }
            if (!chslo2.equals("")){
                switch (znak){
                    case '+':
                        result=(Float.parseFloat(chslo1)+Float.parseFloat(chslo2));
                        break;
                    case '*':
                        result=(Float.parseFloat(chslo1)*Float.parseFloat(chslo2));
                        break;
                    case '-':
                        result=(Float.parseFloat(chslo1)-Float.parseFloat(chslo2));
                        break;
                    case '/':
                        result=(Float.parseFloat(chslo1)/Float.parseFloat(chslo2));
                        break;
                }
            }else result=Float.parseFloat(chslo1);
        }
        chslo1=Float.toString(result);
        chslo2=chslo1.substring(chslo1.length()-2,chslo1.length());
        if (chslo2.equals(".0")){return chslo1.substring(0,chslo1.length()-2);}else {return chslo1;}
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CalculatorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculatorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculatorFragment newInstance(String param1, String param2) {
        CalculatorFragment fragment = new CalculatorFragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        but1=(Button) view.findViewById(R.id.but1);
        but2=(Button) view.findViewById(R.id.but2);
        but3=(Button) view.findViewById(R.id.but3);
        but4=(Button) view.findViewById(R.id.but4);
        but5=(Button) view.findViewById(R.id.but5);
        but6=(Button) view.findViewById(R.id.but6);
        but7=(Button) view.findViewById(R.id.but7);
        but8=(Button) view.findViewById(R.id.but8);
        but9=(Button) view.findViewById(R.id.but9);
        but0=(Button) view.findViewById(R.id.but0);
        del=(Button) view.findViewById(R.id.del);
        umn=(Button)view.findViewById(R.id.umn);
        ud=(Button)view.findViewById(R.id.ud);
        minus=(Button)view.findViewById(R.id.minus);
        plus=(Button)view.findViewById(R.id.plus);
        ravno=(Button)view.findViewById(R.id.ravno);
        point=(Button)view.findViewById(R.id.point);
        vvod=(TextView)view.findViewById(R.id.vvod);
        vivod=(TextView)view.findViewById(R.id.vivod);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"0";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"1";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"2";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"3";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"4";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"5";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"6";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"7";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"8";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer=primer+"9";
                cash="0";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        ud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primer= remove(primer);
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        umn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cash.equals("0")){primer= remove(primer);}
                primer=primer+"*";cash="*";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cash.equals("0")){primer= remove(primer);}
                primer=primer+"/";cash="/";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cash.equals("0")){primer= remove(primer);}
                primer=primer+"-";cash="-";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cash.equals("0")){primer= remove(primer);}
                primer=primer+"+";cash="+";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cash.equals("0")){primer= remove(primer);}
                primer=primer+".";cash=".";
                vvod.setText(primer);
                vivod.setText(summ(primer));
            }
        });
        ravno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cash="0";
                vvod.setText(summ(primer));
                vivod.setText("");
                primer=summ(primer);
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
