package com.alpine.team1.AlpineClassTeam1.CarStatus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ElementReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        textView_element = findViewById(R.id.tvElectricity);
//        if (Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())){
//            int level = intent.getIntExtra("level",0);
//            int scale = intent.getIntExtra("scale",100);
//            double elementDump = (level * 100.0)/scale;
//
//
//            Fragment1.this.textView_element.setText(Math.round(elementDump) + "%");
//
//        }
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"接收到了广播信息",Toast.LENGTH_SHORT).show();
    }
}
