package com.freemusic.musicwebcommon.clients;

import com.freemusic.musicwebcommon.pojos.ArtistDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ArtistClients {

    @GetMapping("/search")
    public ResponseEntity<ArtistDto> findById(@RequestParam("artistId") int artistId);


}
