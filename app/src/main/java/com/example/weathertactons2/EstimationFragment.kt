package com.example.weathertactons2

import android.content.Context
import android.media.MediaPlayer
import android.media.audiofx.HapticGenerator
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import java.io.File

class EstimationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.estimation_fragment, container, false)
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        var mediaPlayer = MediaPlayer.create(context.applicationContext, R.raw.ffmpeg200hz100ms)
//        HapticGenerator.create(mediaPlayer.audioSessionId).enabled = true
//        mediaPlayer.start()
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val textView : TextView = view.findViewById<View>(R.id.text) as TextView
//        textView.text = downloadFolder?.path

        view.findViewById<View>(R.id.button1).setOnClickListener {
            var mediaPlayer = MediaPlayer.create(requireContext(), R.raw.ffmpeg200hz100ms)
            HapticGenerator.create(mediaPlayer.audioSessionId).enabled = true
            mediaPlayer.start()
        }

        view.findViewById<View>(R.id.button2).setOnClickListener {
            var mediaPlayer = MediaPlayer.create(requireContext(), R.raw.ffmpeg200hz500ms)
            HapticGenerator.create(mediaPlayer.audioSessionId).enabled = true
            mediaPlayer.start()
        }

        view.findViewById<View>(R.id.button3).setOnClickListener {
            var mediaPlayer = MediaPlayer.create(requireContext(), R.raw.ffmpeg200hz1000ms)
            HapticGenerator.create(mediaPlayer.audioSessionId).enabled = true
            mediaPlayer.start()
        }

        view.findViewById<View>(R.id.submit_button).setOnClickListener {
//            submitResult(it)
            val downloadFolder = requireContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)
            val editText = view.findViewById<EditText>(R.id.editTextNumber)
//        File(downloadFolder?.path + File.separator + "test.txt").createNewFile()
            File(downloadFolder?.path + File.separator + "test2.txt").appendText(
                editText.text.toString() + "\n"
            )
        }

        view.findViewById<View>(R.id.next_button).setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.end_dest, null)
        )

    }

//    fun submitResult(view: View) {
//
//    }
}