package com.ufranco.springfeignexample.records;

import java.util.List;

public record Article(
    String id,
    String title,
    Double price,
    List<Author> authors
) {}