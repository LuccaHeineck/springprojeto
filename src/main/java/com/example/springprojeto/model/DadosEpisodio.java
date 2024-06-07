package com.example.springprojeto.model;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.annotations.SerializedName;

public record DadosEpisodio(@SerializedName("Title") String titulo,
                            @SerializedName("Episode") Integer numero,
                            @SerializedName("imdbRating") String avaliacao,
                            @SerializedName("Released") String dataLancamento) {
}
