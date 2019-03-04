package com.example.ayobisakok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Second extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.ActivitySecond.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__second);
        mReply =(EditText) findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView =(TextView) findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void retrunReply(View view) {
        String reply =mReply.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void launchSecondActivity(View view) {
    }
}
