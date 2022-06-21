import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domen.FilmItem;
import ru.netology.repository.FilmRepository;

public class FilmRepositoryTest {

    FilmItem film1 = new FilmItem(111, "Номер один", "комедия");
    FilmItem film2 = new FilmItem(222, "Тролли. Мировой тур", "мультфильм");
    FilmItem film3 = new FilmItem(333, "Человек-Невидимка", "ужасы");
    FilmItem film4 = new FilmItem(444, "Джентельмены", "боевик");
    FilmItem film5 = new FilmItem(555, "Отель Белград", "комедия");
    FilmItem film6 = new FilmItem(666, "Вперед", "мультфильмы");
    FilmItem film7 = new FilmItem(777, "Бладшот", "боевик");

    @Test
    public void shouldAddFilm() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        repo.addFilm(film7);

        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAllFilms() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        repo.addFilm(film7);

        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmItem[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedFilm() {
        FilmRepository repo = new FilmRepository(5);
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        repo.addFilm(film7);


        FilmItem[] expected = {film7, film6, film5, film4, film3};
        FilmItem[] actual = repo.items();
        Assertions.assertArrayEquals(expected, actual);

    }

}
