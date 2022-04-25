package ru.netology.domain.afisha;

public class MovieManager {
    private MovieRepository repository;
    private MovieData[] movies = new MovieData[0];
//    private MovieData[] movies = new MovieData[0];
//    private MovieData[] moviesReverse = new MovieData[0];
//    private int countMovies = 10;//счетчик кол-ва выводимых фильмов для метода findLast

//    public MovieManager() {
//    }
//
//    public MovieManager(int countMovies) {
//        this.countMovies = countMovies;
//    }

    public MovieManager(MovieRepository repository) {
        this.repository = repository;
    }

    public MovieRepository getRepository() {
        return repository;
    }

    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    public void findAll() {
        repository.findAll();
    }

    public void save(MovieData movie) {
        repository.save(movie);
    }

    public MovieData findById(int id) {
        return repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public void revertMovies() {
        movies = repository.getMovies();
        MovieData[] tmp = new MovieData[movies.length];
        for (int i = 0, j = movies.length - 1; i < movies.length; i++, j--) {
            tmp[i] = movies[j];
        }
        movies = tmp;
    }

    public void addMovie(MovieData addMovie) {
        movies = repository.getMovies();
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = addMovie;
        movies = tmp;
    }

//    public MovieData[] getMovies() {
//        return movies;
//    }
//
//    public void setMovies(MovieData[] movies) {
//        this.movies = movies;
//    }
//
//    public MovieData[] getMoviesReverse() {
//        return moviesReverse;
//    }
//
//    public void setMoviesReverse(MovieData[] moviesReverse) {
//        this.moviesReverse = moviesReverse;
//    }
//
//    public int getCountMovies() {
//        return countMovies;
//    }
//
//    public void setCountMovies(int countMovies) {
//        this.countMovies = countMovies;
//    }
//
//    //добавление фильма в конец массива
//    public void add(MovieData movie) {
//        MovieData[] tmp = new MovieData[movies.length + 1];
//        for (int i = 0; i < movies.length; i++) {
//            tmp[i] = movies[i];
//        }
//        tmp[movies.length] = movie;
//        movies = tmp;
//    }
//
//    //вывод всех фильмов в порядке добавления
//    public void findAll() {
//        getMovies();
//    }
//
//    //вывод n фильмов в обратном порядке (по умолчанию n = 10)
//    public void findLast() {
//        if (countMovies > movies.length) { //проверка, что n не больше нашего массива с фильмами
//            countMovies = movies.length;
//        }
//        MovieData[] tmp = new MovieData[countMovies];
//        for (int i = 0, j = movies.length - 1; i < countMovies; i++, j--) {
//            tmp[i] = movies[j];
//        }
//        moviesReverse = tmp;
//    }
}