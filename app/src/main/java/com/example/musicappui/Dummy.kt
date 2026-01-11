package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon:Int,val name:String)

val libraries=listOf<Lib>(
    Lib(R.drawable.ic_playlist_play_24,"Playlist") ,
    Lib(R.drawable.ic_microphone,"Artist"),
    Lib(R.drawable.ic_album_24,"Album"),
    Lib(R.drawable.ic_music_note_2_24,"Songs"),
    Lib(R.drawable.ic_genres_24,"Genre")
)
