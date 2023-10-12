package com.dylanharper.spotifyAPI;

import se.michaelthelin.spotify.SpotifyApi;

public class Spotify {
    SpotifyApi spotify = new SpotifyApi.Builder()
            .setAccessToken("taHZ2SdB-bPA3FsK3D7ZN5npZS47cMy-IEySVEGttOhXmqaVAIo0ESvTCLjLBifhHOHOIuhFUKPW1WMDP7w6dj3MAZdWT8CLI2MkZaXbYLTeoDvXesf2eeiLYPBGdx8tIwQJKgV8XdnzH_DONk")
            .build();
}
