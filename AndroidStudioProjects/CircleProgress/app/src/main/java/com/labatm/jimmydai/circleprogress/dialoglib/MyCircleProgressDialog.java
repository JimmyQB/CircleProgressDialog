package com.labatm.jimmydai.circleprogress.dialoglib;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.widget.TextView;

import com.labatm.jimmydai.circleprogress.R;

/**
 * Created by jimmydai on 2015/4/18.
 */
public class MyCircleProgressDialog extends Dialog{

    private Context mContext;
    Dialog dialog;
    TextView textView;

    private Handler handler = new Handler();

    public MyCircleProgressDialog(Context context) {
        super(context);
        mContext = context;
        initDialog();
    }

    private void initDialog() {

        dialog = new Dialog(mContext, R.style.MyDialog);
        dialog.setContentView(R.layout.dialog_circle_progress);
        textView = (TextView) dialog.findViewById(R.id.textViewMessage);
    }

    public void showMyCircleProgress(String message, int sec) {

        if (dialog == null) {
            initDialog();
        }
        textView.setText(message);
        dialog.show();
        handler.postDelayed(runnable, sec*1000);
    }

    public void hideMyCircleProgress() {

        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            hideMyCircleProgress();
        }
    };
}
