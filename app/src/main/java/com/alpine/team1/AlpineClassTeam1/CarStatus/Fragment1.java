package com.alpine.team1.AlpineClassTeam1.CarStatus;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alpine.team1.AlpineClassTeam1.R;

public class Fragment1 extends Fragment {
    private TextView textView_element;
    private IntentFilter intentFilter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        textView = getActivity().findViewById(R.id.textView);
//        button = getActivity().findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        intentFilter = new IntentFilter();
    }

//    public void receiverElementBroadcast(){
//        textView_element = getActivity().findViewById(R.id.tvElectricity);
//        BroadcastReceiver receiverElement = new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                if (Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())){
//                    //获取当前电量
//                    int current = intent.getExtras().getInt("level");
//                    //获得总电量
//                    int total = intent.getExtras().getInt("scale");
//                    //计算当前电量的比率
//                    double elementDump = (current * 100.0)/total;
//                    //显示剩余电量
//                    Fragment1.this.textView_element.setText(Math.round(elementDump) + "%");
//                }
//            }
//        };
//    }



}
