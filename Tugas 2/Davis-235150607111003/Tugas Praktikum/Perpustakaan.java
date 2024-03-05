import java.io.*;
import java.util.*;


class Buku {
    public String title;
    public List<String> authors;

    Buku(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}

class Category {
    private String name;
    private List<Buku> books;

    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Buku book) {
        books.add(book);
    }

    public List<Buku> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}

class Perpustakaan {
    private Map<String, Category> categories;

    public Perpustakaan() {
        this.categories = new HashMap<>();
    }

    public void addCategory(String name) {
        categories.put(name, new Category(name));
    }

    public void addBookToCategory(String categoryName, Buku book) {
        Category category = categories.get(categoryName);
        if (category != null) {
            category.addBook(book);
            // System.out.println("Buku berhasil ditambahkan ke dalam kategori " + categoryName);
        } else {
            System.out.println("Kategori '" + categoryName + "' tidak ditemukan. Menambahkan kategori baru...");
            addCategory(categoryName);
            addBookToCategory(categoryName, book);
        }
    }

    public void tambahBukuKategori(String categoryName, Buku book) {
        Category category = categories.get(categoryName);
        if (category != null) {
            category.addBook(book);
            System.out.println("Buku berhasil ditambahkan ke dalam kategori " + categoryName);
        } else {
            System.out.println("Kategori '" + categoryName + "' tidak ditemukan. Menambahkan kategori baru...");
            addCategory(categoryName);
            tambahBukuKategori(categoryName, book);
        }
    }

    public void displayBooksInCategory(String categoryName) {
        Category category = categories.get(categoryName);
        if (category != null) {
            System.out.println("Buku dalam kategori " + categoryName + ":");
            List<Buku> books = category.getBooks();
            if (!books.isEmpty()) {
                for (Buku book : books) {
                    System.out.println("Judul: " + book.getTitle());
                    System.out.println("Penulis: " + String.join(", ", book.getAuthors()));
                    System.out.println();
                }
            } else {
                System.out.println("Tidak ada buku dalam kategori ini.");
            }
        } else {
            System.out.println("Kategori '" + categoryName + "' tidak ditemukan.");
        }
    }

    public void writeToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Category category : categories.values()) {
                writer.println("Kategori: " + category.getName());
                for (Buku book : category.getBooks()) {
                    writer.println("Judul: " + book.getTitle());
                    writer.println("Penulis: " + String.join(", ", book.getAuthors()));
                    writer.println();
                }
            }
            System.out.println("Data telah ditulis ke " + filename);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }

    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Kategori: ")) {
                    String categoryName = line.substring("Kategori: ".length());
                    addCategory(categoryName);
                } else if (line.startsWith("Judul: ")) {
                    String title = line.substring("Judul: ".length());
                    String authorsLine = reader.readLine();
                    String[] authors = authorsLine.substring("Penulis: ".length()).split(", ");
                    addBookToCategory(categories.keySet().stream().findFirst().get(),
                            new Buku(title, Arrays.asList(authors)));
                }
            }
            System.out.println("Data telah dibaca dari " + filename);
        } catch (IOException e) {
            System.out.println("Kesalahan membaca dari file: " + e.getMessage());
        }
    }
}
