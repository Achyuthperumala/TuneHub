package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;

@Service
public interface PlaylistService 
{

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
