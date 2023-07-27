package com.freemusic.musicwebcommon.messages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class MusicMessage implements Serializable {
    private int mediaId;
    private byte[] fileContent; // store the content as byte array
    private String title;
    private String fileType;

    private String fileContentType;


    public MusicMessage(int mediaId, String title, String fileType, String fileContentType) {
        this.mediaId = mediaId;
        this.title = title;
        this.fileType = fileType;
        this.fileContentType = fileContentType;
    }

    public void setFile(MultipartFile file) throws IOException {
        this.fileContent = file.getBytes();
    }
}
