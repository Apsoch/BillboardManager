package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviePoster {
  private int id;
  private int movieId;
  private String nameMovie;
  private String genre;
}