package com.example.springprojeto.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
