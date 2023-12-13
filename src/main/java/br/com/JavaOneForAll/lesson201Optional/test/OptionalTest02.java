package br.com.JavaOneForAll.lesson201Optional.test;

import br.com.JavaOneForAll.lesson201Optional.domain.Manga;
import br.com.JavaOneForAll.lesson201Optional.repository.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) throws IllegalAccessException {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("One Piece");
        mangaByTitle.ifPresent(manga -> manga.setTitle("One piece"));
        System.out.println(mangaByTitle);
        MangaRepository.findById(2).orElseThrow(IllegalAccessException::new);

        MangaRepository.findByTitle("teste").orElse(new Manga(6, "Teste" , 200));


    }
}
