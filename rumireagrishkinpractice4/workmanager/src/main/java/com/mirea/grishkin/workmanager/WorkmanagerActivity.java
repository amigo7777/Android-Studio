package com.mirea.grishkin.workmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;

public class WorkmanagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workmanager);

        WorkRequest uploadWorkRequest = new OneTimeWorkRequest.Builder(UploadWorker.class).build();
        WorkManager.getInstance(this).enqueue(uploadWorkRequest);
    }
}