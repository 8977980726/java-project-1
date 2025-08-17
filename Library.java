package service;

import model.Book;
import model.Member;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && b.isAvailable()) {
                b.setAvailable(false);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && !b.isAvailable()) {
                b.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid book ID!");
    }
}
