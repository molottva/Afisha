package ru.netology.domain.afisha;

public class MovieRepository {
    private MovieData[] movies = new MovieData[0];

    public MovieRepository() {
    }

    public MovieRepository(MovieData[] movies) {
        this.movies = movies;
    }

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    //возвращает массив всех хранящихся в массиве объектов
    public void findAll() {
        getMovies();
    }

    //добавляет объект в массив
    public void save(MovieData movieAdd) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movieAdd;
        movies = tmp;
    }

    //возвращает объект по идентификатору (либо null, если такого объекта нет)
    public MovieData findById(int id) {
        for (MovieData movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    //удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    public void removeById(int id) {
        MovieData[] tmp = new MovieData[movies.length - 1];
        for (int i = 0, j = 0; i < tmp.length - 1; i++, j++) {
            if (movies[j].getId() == id) {
                j++;
            }
            tmp[i] = movies[j];
        }
        movies = tmp;
    }

    //полностью вычищает репозиторий
    public void removeAll() {
        movies = new MovieData[0];
    }
}