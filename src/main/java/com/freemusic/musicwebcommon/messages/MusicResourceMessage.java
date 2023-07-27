package com.freemusic.musicwebcommon.messages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MusicResourceMessage {
    private Integer musicResourceId;
    private Integer videoId;
    private Integer imageId;

    private String title;
    private String lyric;
    private double duration;
    private boolean isBanned;
    private int artistId;

    private int albumId;
    private List<Integer> genreIds;
}
