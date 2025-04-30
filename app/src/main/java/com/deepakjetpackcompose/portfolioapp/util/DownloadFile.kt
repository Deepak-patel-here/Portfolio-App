package com.deepakjetpackcompose.portfolioapp.util

import android.app.Activity
import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker
import android.Manifest


fun downloadResume(context: Context, fileUrl: String) {
    // Check permission to write to storage
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        ) != PermissionChecker.PERMISSION_GRANTED
    ) {
        ActivityCompat.requestPermissions(
            context as Activity,
            arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
            1
        )
        return
    }


    val request = DownloadManager.Request(Uri.parse(fileUrl))
        .setTitle("Downloading Resume")
        .setDescription("Your resume is being downloaded")
        .setDestinationInExternalPublicDir(
            Environment.DIRECTORY_DOWNLOADS,
            "my_resume.pdf"
        )
        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED) // Show download notification

    val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
    downloadManager.enqueue(request) // Enqueue the download request

    Toast.makeText(context, "Resume download started!", Toast.LENGTH_SHORT).show()
}



//