package com.freemusic.musicwebcommon.clients;

import com.freemusic.musicwebcommon.pojos.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserClients {

    @GetMapping("/user/search/{user_id}")
    UserDto findById(@PathVariable("user_id") int user_id);

    @GetMapping("/user/search")
    UserDto findByUsername(@RequestParam("email") String username);
    @GetMapping("/user/seaarch")

    UserDto findByUsernaame(@RequestParam("email") String username);

   // @PostMapping("/user/search")
   // User signupArtist(@PathVariable("user_id") int user_id);
}
