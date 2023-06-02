import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    private BookService bookService;

    @Mock
    private User user;

    @Mock
    private Book book1;

    @Mock
    private Book book2;

    @Mock
    private Book book3;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService();
    }
    @DisplayName("Test searchBook() - Positive case")
    @Test
    public void testSearchBook_Positive() {
        when(book1.getTitle()).thenReturn("Title 1");
        when(book2.getTitle()).thenReturn("Title 2");
        when(book3.getTitle()).thenReturn("Title 3");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        List<Book> expectedBooks = Arrays.asList(book1, book2, book3);
        List<Book> foundBooks = bookService.searchBook("Title");

        assertEquals(expectedBooks, foundBooks);
    }
    @DisplayName("Test searchBook() - Negative case")
    @Test
    public void testSearchBook_Negative() {
        List<Book> foundBooks = bookService.searchBook("Invalid");

        assertTrue(foundBooks.isEmpty());
    }

    @DisplayName("Test searchBook() - Edge case: Empty keyword")
    @Test
    public void testSearchBook_EdgeCase() {
        when(book1.getTitle()).thenReturn("Title 1");
        when(book2.getTitle()).thenReturn("Title 2");
        when(book3.getTitle()).thenReturn("Title 3");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        List<Book> expectedBooks = Arrays.asList(book1, book2, book3);
        List<Book> foundBooks = bookService.searchBook("");

        assertEquals(expectedBooks, foundBooks);
    }

    @DisplayName("Test purchaseBook() - Positive case")
    @Test
    public void testPurchaseBook_Positive() {
        boolean purchaseResult = bookService.purchaseBook(user, book1);

        assertFalse(purchaseResult);
    }

    @DisplayName("Test purchaseBook() - Negative case")
    @Test
    public void testPurchaseBook_Negative() {
        Book newBook = new Book("Twilight", "Stephanie Meyer", "Fiction", 25.0);

        boolean purchaseResult = bookService.purchaseBook(user, newBook);

        assertFalse(purchaseResult);
    }

    @DisplayName("Test purchaseBook() - Edge case: Null user")
    @Test
    public void testPurchaseBook_NullUser_EdgeCase() {
        boolean purchaseResult = bookService.purchaseBook(null, book1);

        assertFalse(purchaseResult);
    }

    @DisplayName("Test purchaseBook() - Edge case: Null book")
    @Test
    public void testPurchaseBook_NullBook_EdgeCase() {
        boolean purchaseResult = bookService.purchaseBook(user, null);

        assertFalse(purchaseResult);
    }

    @DisplayName("Test addBook() - Positive case")
    @Test
    public void testAddBook_Positive() {
        Book newBook = new Book("New Moon", "Stephanie Meyer", "Fiction", 25.0);

        boolean addResult = bookService.addBook(newBook);

        assertTrue(addResult);
    }

    @DisplayName("Test addBook() - Negative case")
    @Test
    public void testAddBook_Negative() {
        boolean addResult = bookService.addBook(book1);

        assertTrue(addResult);
    }

    @DisplayName("Test addBook() - Edge case: Null book")
    @Test
    public void testAddBook_NullBook_EdgeCase() {
        boolean addResult = bookService.addBook(null);

        assertTrue(addResult);
    }

    @DisplayName("Test removeBook() - Positive case")
    @Test
    public void testRemoveBook_Positive() {
        boolean removeResult = bookService.removeBook(book1);
        Assertions.assertFalse(removeResult);
    }

    @DisplayName("Test removeBook() - Negative case")
    @Test
    public void testRemoveBook_Negative() {
        Book newBook = new Book("New Moon", "Stephanie Meyer", "Fiction", 25.0);
        boolean removeResult = bookService.removeBook(newBook);
        Assertions.assertFalse(removeResult);
    }

    @DisplayName("Test removeBook() - Edge case: Null book")
    @Test
    public void testRemoveBook_NullBook_EdgeCase() {
        boolean removeResult = bookService.removeBook(null);
        Assertions.assertFalse(removeResult);
    }

}

