-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-12-2018 a las 02:28:30
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `institutoabierto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_Curso` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `descripcion` text NOT NULL,
  `cupo` int(11) NOT NULL,
  `costo` double NOT NULL,
  `id_Persona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id_Curso`, `nombre`, `descripcion`, `cupo`, `costo`, `id_Persona`) VALUES
(1, 'Matematicas', 'Sistema de ecuaciones', 40, 200, 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `id_Matricula` int(11) NOT NULL,
  `fechaInscripcion` date NOT NULL,
  `costo` double NOT NULL,
  `id_Persona` int(11) NOT NULL,
  `id_Curso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`id_Matricula`, `fechaInscripcion`, `costo`, `id_Persona`, `id_Curso`) VALUES
(1, '2018-12-01', 200, 28, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_Persona` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `celular` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_Persona`, `nombre`, `dni`, `celular`) VALUES
(6, 'Mirta Becker', 32693062, 4390907),
(7, 'Mirta Becker', 32693062, 4390907),
(8, 'Mirta Becker', 32693062, 4390907),
(9, 'Mirta Becker', 32693062, 4390907),
(10, 'Mirta Becker', 32693062, 4390907),
(11, 'Mirta Becker', 32693062, 4390907),
(12, 'Mirta Becker', 32693062, 4390907),
(13, 'Micaela Dure', 34921602, 154540633),
(14, 'Micaela Dure', 34921602, 154540633),
(15, 'Micaela Dure', 34921602, 154540633),
(16, 'Micaela Dure', 34921602, 154540633),
(17, 'Micaela Dure', 34921602, 154540633),
(18, 'Micaela Dure', 34921602, 154540633),
(19, 'Micaela Dure', 34921602, 154540633),
(20, 'Micaela Dure', 34921602, 154540633),
(21, 'Micaela Dure', 34921602, 154540633),
(22, 'Micaela Dure', 34921602, 154540633),
(23, 'Mirta Becker', 32693062, 4390907),
(24, 'Mirta Becker', 32693062, 4390907),
(25, 'Mirta Becker', 32693062, 4390907),
(26, 'Mirta Becker', 32693062, 4390907),
(27, 'Mirta Becker', 32693062, 4390907),
(28, 'Atenea Caselli', 33152586, 4365896);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_Curso`),
  ADD KEY `id_Persona` (`id_Persona`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`id_Matricula`),
  ADD KEY `id_Persona` (`id_Persona`,`id_Curso`),
  ADD KEY `id_Curso` (`id_Curso`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_Persona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `id_Curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `matricula`
--
ALTER TABLE `matricula`
  MODIFY `id_Matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_Persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`id_Persona`) REFERENCES `persona` (`id_Persona`);

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`id_Persona`) REFERENCES `persona` (`id_Persona`),
  ADD CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`id_Curso`) REFERENCES `curso` (`id_Curso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
