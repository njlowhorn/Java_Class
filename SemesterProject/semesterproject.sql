-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2022 at 05:23 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `semesterproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `album`
--

CREATE TABLE `album` (
  `AlbumID` int(11) NOT NULL,
  `Title` text DEFAULT NULL,
  `Artist` text DEFAULT NULL,
  `ReleaseYear` int(11) DEFAULT NULL,
  `CoverArt` text DEFAULT NULL,
  `Songs` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `album`
--

INSERT INTO `album` (`AlbumID`, `Title`, `Artist`, `ReleaseYear`, `CoverArt`, `Songs`) VALUES
(6, 'Abby Road', 'The Beatles', 1969, 'AbbeyRoad.jpg', 'Come Together Something Maxwell\'s Silver Hammer Oh Darling Octopus\'s Garden I Want You(She\'s So Heavy) ');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `BookID` int(11) NOT NULL,
  `Title` text DEFAULT NULL,
  `Author` text DEFAULT NULL,
  `ReleaseYear` int(11) DEFAULT NULL,
  `CoverArt` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `FilmID` int(11) NOT NULL,
  `Title` text DEFAULT NULL,
  `Director` text DEFAULT NULL,
  `ReleaseYear` int(11) DEFAULT NULL,
  `CoverArt` text DEFAULT NULL,
  `Length` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`FilmID`, `Title`, `Director`, `ReleaseYear`, `CoverArt`, `Length`) VALUES
(1, 'Inception', 'Christopher Nolan', 2010, 'Inception.jpg', 148),
(2, 'The Dark Knight', 'Christopher Nolan', 2008, 'TheDarkKnight.jpg', 152),
(3, 'Hell or High Water', 'David Mackenzie', 2016, 'HellOrHighWater.jpg', 102),
(4, 'Ghostbusters', 'Ivan Reitman', 1984, 'Ghostbusters.png', 105),
(5, 'The Iron Giant', 'Brad Bird', 1999, 'TheIronGiant.jpg', 87),
(6, 'The Lion King', 'Roger Allers', 1994, 'TheLionKing.jpg', 88),
(7, 'Finding Nemo', 'Andrew Stanton', 2003, 'FindingNemo.jpg', 100),
(10, 'Come and See', 'Elem Klimov', 1985, 'ComeAndSee.jpg', 142),
(21, 'The Godfather', 'Francis Ford Coppola', 1972, 'TheGodfather.jpg', 175);

-- --------------------------------------------------------

--
-- Table structure for table `ratings`
--

CREATE TABLE `ratings` (
  `Username` text DEFAULT NULL,
  `Title` text DEFAULT NULL,
  `Type` text DEFAULT NULL,
  `Rating` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ratings`
--

INSERT INTO `ratings` (`Username`, `Title`, `Type`, `Rating`) VALUES
('user2', 'The Dark Knight', 'film', 4),
('user1', 'null', 'semesterproject.film', 4),
('user1', 'null', 'film', 3),
('user1', 'null', 'null', 5),
('user1', 'Abby Road', 'album', 5),
('user1', 'The Dark Knight', 'film', 5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `Username` text DEFAULT NULL,
  `Password` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Username`, `Password`) VALUES
(1, 'user1', 'password'),
(2, 'user2', 'password2'),
(3, 'user3', 'password3'),
(5, 'user4', 'password4'),
(6, 'user5', 'password5');

-- --------------------------------------------------------

--
-- Table structure for table `videogame`
--

CREATE TABLE `videogame` (
  `VideoGameID` int(11) NOT NULL,
  `Title` text DEFAULT NULL,
  `Developer` text DEFAULT NULL,
  `ReleaseYear` int(11) DEFAULT NULL,
  `CoverArt` text DEFAULT NULL,
  `Platform` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `videogame`
--

INSERT INTO `videogame` (`VideoGameID`, `Title`, `Developer`, `ReleaseYear`, `CoverArt`, `Platform`) VALUES
(6, 'Super Mario Bros.', 'Nintendo', 1985, 'SuperMarioBros.png', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`AlbumID`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`FilmID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `videogame`
--
ALTER TABLE `videogame`
  ADD PRIMARY KEY (`VideoGameID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `album`
--
ALTER TABLE `album`
  MODIFY `AlbumID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `BookID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `FilmID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `videogame`
--
ALTER TABLE `videogame`
  MODIFY `VideoGameID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
