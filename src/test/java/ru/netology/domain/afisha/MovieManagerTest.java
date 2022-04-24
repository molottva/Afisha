package ru.netology.domain.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieData movieOne = new MovieData(1, "One");
    MovieData movieTwo = new MovieData(2, "Two");
    MovieData movieThree = new MovieData(3, "Three");
    MovieData movieFour = new MovieData(4, "Four");
    MovieData movieFive = new MovieData(5, "Five");
    MovieData movieSix = new MovieData(6, "Six");
    MovieData movieSeven = new MovieData(7, "Seven");
    MovieData movieEight = new MovieData(8, "Eight");
    MovieData movieNine = new MovieData(9, "Nine");
    MovieData movieTen = new MovieData(10, "Ten");
    MovieData movieEleven = new MovieData(11, "Eleven");
    MovieData movieTwelve = new MovieData(12, "Twelve");
    MovieData movieThirteen = new MovieData(13, "Thirteen");
    MovieData movieFourteen = new MovieData(14, "Fourteen");
    MovieData movieFifteen = new MovieData(15, "Fifteen");
    MovieData movieSixteen = new MovieData(16, "Sixteen");

    MovieData[] moviesTestList0 = new MovieData[0];
    MovieData[] moviesTestList1 = {
            movieOne};
    MovieData[] moviesTestList5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieData[] moviesTestList15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieData[] moviesExpectedAdd0 = {
            movieOne};
    MovieData[] moviesExpectedAdd1 = {
            movieOne,
            movieTwo};
    MovieData[] moviesExpectedAdd5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix};
    MovieData[] moviesExpectedAdd15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen,
            movieSixteen};

    MovieData[] moviesExpectedFindAll0 = new MovieData[0];
    MovieData[] moviesExpectedFindAll1 = {
            movieOne};
    MovieData[] moviesExpectedFindAll5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieData[] moviesExpectedFindAll15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieData[] moviesExpectedFindLast0DefaultCount = new MovieData[0];
    MovieData[] moviesExpectedFindLast1DefaultCount = {
            movieOne};
    MovieData[] moviesExpectedFindLast5DefaultCount = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieData[] moviesExpectedFindLast15DefaultCount = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine,
            movieEight,
            movieSeven,
            movieSix};

    MovieData[] moviesExpectedFindLast15Count0 = new MovieData[0];
    MovieData[] moviesExpectedFindLast5Count7 = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieData[] moviesExpectedFindLast15Count7 = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine};

    MovieManager manager = new MovieManager();
    MovieManager managerCountNull = new MovieManager(0);
    MovieManager managerCountSeven = new MovieManager(7);

    @Test
    void shouldAddNullMovies() {
        MovieData[] expected = moviesExpectedAdd0;
        manager.setMovies(moviesTestList0);
        manager.add(movieOne);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddOneMovies() {
        MovieData[] expected = moviesExpectedAdd1;
        manager.setMovies(moviesTestList1);
        manager.add(movieTwo);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFiveMovies() {
        MovieData[] expected = moviesExpectedAdd5;
        manager.setMovies(moviesTestList5);
        manager.add(movieSix);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFifteenMovies() {
        MovieData[] expected = moviesExpectedAdd15;
        manager.setMovies(moviesTestList15);
        manager.add(movieSixteen);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllNullMovies() {
        MovieData[] expected = moviesExpectedFindAll0;
        manager.setMovies(moviesTestList0);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllOneMovies() {
        MovieData[] expected = moviesExpectedFindAll1;
        manager.setMovies(moviesTestList1);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFiveMovies() {
        MovieData[] expected = moviesExpectedFindAll5;
        manager.setMovies(moviesTestList5);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFifteenMovies() {
        MovieData[] expected = moviesExpectedFindAll15;
        manager.setMovies(moviesTestList15);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindLastNullMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast0DefaultCount;
        manager.setMovies(moviesTestList0);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastOneMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast1DefaultCount;
        manager.setMovies(moviesTestList1);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast5DefaultCount;
        manager.setMovies(moviesTestList5);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast15DefaultCount;
        manager.setMovies(moviesTestList15);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountNull() {
        MovieData[] expected = moviesExpectedFindLast15Count0;
        managerCountNull.setMovies(moviesTestList15);
        managerCountNull.findLast();
        assertArrayEquals(expected, managerCountNull.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesCountSeven() {
        MovieData[] expected = moviesExpectedFindLast5Count7;
        managerCountSeven.setMovies(moviesTestList5);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountSeven() {
        MovieData[] expected = moviesExpectedFindLast15Count7;
        managerCountSeven.setMovies(moviesTestList15);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }
}