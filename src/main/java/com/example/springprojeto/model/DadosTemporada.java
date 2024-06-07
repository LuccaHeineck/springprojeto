package com.example.springprojeto.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record DadosTemporada(@SerializedName("Season") Integer numero,
                             @SerializedName("Episodes") List<DadosEpisodio> episodios) {
}
