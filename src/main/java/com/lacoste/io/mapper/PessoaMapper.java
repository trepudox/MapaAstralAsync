package com.lacoste.io.mapper;

import com.lacoste.io.model.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaMapper {

    private PessoaMapper() {}

    public static Pessoa fileStringToPessoa(String fileString) {
        String[] pessoaData = fileString.split(",");
        return new Pessoa(pessoaData[0], pessoaData[1], LocalDateTime.parse(pessoaData[2]));
    }

    public static List<Pessoa> fileStringListToPessoaList(List<String> fileStringList) {
        return fileStringList.stream()
                .map(PessoaMapper::fileStringToPessoa)
                .collect(Collectors.toList());
    }

}
