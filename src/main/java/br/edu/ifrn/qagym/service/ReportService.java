package br.edu.ifrn.qagym.service;

import br.edu.ifrn.qagym.model.Book;
import br.edu.ifrn.qagym.model.Loan;

import java.util.List;
import java.util.Map;

public class ReportService {

    public int total(List<Book> books) {
        return books.size();
    }

    public int countAvailableBooks(List<Book> books) {
        // TODO: implementar contagem de livros disponíveis
        return 0;
    }

    public int countUnavailableBooks(List<Book> books) {
        // TODO: implementar contagem de livros indisponíveis
        return 0;
    }

    public Map<String, Long> booksByAuthor(List<Book> books) {
        if (books == null || books.isEmpty()) {
            return Map.of();
        }

        return books.stream()
                .filter(book -> book.getAuthor() != null)
                .collect(java.util.stream.Collectors.groupingBy(
                        Book::getAuthor,
                        java.util.stream.Collectors.counting()
                ));
    }

    public int activeLoanCount(List<Loan> loans) {
        // TODO: contar empréstimos ativos (não devolvidos)
        return 0;
    }
}
