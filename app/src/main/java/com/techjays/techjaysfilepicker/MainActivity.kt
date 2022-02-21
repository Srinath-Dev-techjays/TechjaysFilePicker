package com.techjays.techjaysfilepicker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import com.techjays.filepicker.FilePickerBuilder
import com.techjays.filepicker.FilePickerConst
import com.techjays.filepicker.utils.ContentUriUtils


class MainActivity : AppCompatActivity() {
    var mResumePath = ""
    lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView)

        text.setOnClickListener {
            FilePickerBuilder.instance
                .setMaxCount(5) //optional
                .setActivityTheme(R.style.LibAppTheme) //optional
                .pickPhoto(this);
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == FilePickerConst.REQUEST_CODE_PHOTO) {
            if (resultCode == AppCompatActivity.RESULT_OK && data != null) {
                val uri =
                    data.getParcelableArrayListExtra<Uri>(FilePickerConst.KEY_SELECTED_MEDIA)!![0]
                mResumePath = ContentUriUtils.getFilePath(this, uri)!!
                Toast.makeText(this,mResumePath,Toast.LENGTH_SHORT).show()
            }
        }
    }
}