package com.yoganavi.lecture.recorded_lecture.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChapterDto {

    private Long id;
    private String chapterTitle;
    private String chapterDescription;
    private String recordVideo;
    private Integer chapterNumber;
}