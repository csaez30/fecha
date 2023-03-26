-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-05-2019 a las 04:51:21
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `taller`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aparato`
--

CREATE TABLE `aparato` (
  `IdAparato` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `NroSerie` varchar(100) NOT NULL,
  `TipoAparato` varchar(100) NOT NULL,
  `FIngreso` date NOT NULL,
  `FEgreso` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `aparato`
--

INSERT INTO `aparato` (`IdAparato`, `IdCliente`, `NroSerie`, `TipoAparato`, `FIngreso`, `FEgreso`) VALUES
(1, 1, 'ABC12345678', 'Teléfono', '2019-04-12', '2019-04-12'),
(2, 2, '123asd254', 'TV 32''', '2019-04-12', '2019-04-12'),
(3, 3, 'SN123654', 'PC AMD', '2019-04-11', '2019-04-11'),
(4, 5, 'Toshiba-ASD456', 'Netbook', '2019-05-07', '2019-05-07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCliente` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Dni` varchar(11) NOT NULL,
  `Domicilio` varchar(100) NOT NULL,
  `Telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`IdCliente`, `Nombre`, `Dni`, `Domicilio`, `Telefono`) VALUES
(1, 'Gerardo Fernandez', '30056787', 'Av. Universitaria S/N - Pilp III - 1er piso Of. 2', '2664212231'),
(2, 'Erica Nazabal', '28595638', 'Bº Eva Perón Tira Sur 615', '2665039357'),
(3, 'Ignacio Fernandez', '46728000', 'Casa nueva de Nacho 321', '2665030846'),
(4, 'Gerardo Fernandez', '30056787', 'Av. Universitaria S/N - Pilp III - 1er piso Of. 2', '2664212231'),
(5, 'Esteban Gabriel Fernandez', '42220578', 'B° UOCRA La Punta', '2664324252'),
(6, 'Nadine Michelle Nazabal', '42220888', 'B° Eva Perón Urbano Nuñez 615', '2665030303');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparacion`
--

CREATE TABLE `reparacion` (
  `IdReparacion` int(11) NOT NULL,
  `IdAparato` int(11) NOT NULL,
  `IdServicio` int(11) NOT NULL,
  `FechaReparacion` date NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reparacion`
--

INSERT INTO `reparacion` (`IdReparacion`, `IdAparato`, `IdServicio`, `FechaReparacion`, `Estado`) VALUES
(1, 1, 2, '2019-04-12', 0),
(2, 2, 3, '2019-04-12', 0),
(3, 1, 1, '2019-04-12', 1),
(4, 4, 1, '2019-04-12', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `IdServicio` int(11) NOT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Costo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`IdServicio`, `Codigo`, `Descripcion`, `Costo`) VALUES
(1, 'LIMP', 'Limpieza', 250),
(2, 'CPA', 'Cambio de Pantalla', 1000),
(3, 'ENC', 'Arreglo de Enchufe', 120.5),
(4, 'CFPC', 'Cambio de Fuente de PC', 123.45);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aparato`
--
ALTER TABLE `aparato`
  ADD PRIMARY KEY (`IdAparato`),
  ADD KEY `IdCliente` (`IdCliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCliente`);

--
-- Indices de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD PRIMARY KEY (`IdReparacion`),
  ADD KEY `IdAparato` (`IdAparato`),
  ADD KEY `IdServicio` (`IdServicio`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`IdServicio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aparato`
--
ALTER TABLE `aparato`
  MODIFY `IdAparato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IdCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  MODIFY `IdReparacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `IdServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aparato`
--
ALTER TABLE `aparato`
  ADD CONSTRAINT `aparato_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`);

--
-- Filtros para la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD CONSTRAINT `reparacion_ibfk_1` FOREIGN KEY (`IdServicio`) REFERENCES `servicio` (`IdServicio`),
  ADD CONSTRAINT `reparacion_ibfk_2` FOREIGN KEY (`IdAparato`) REFERENCES `aparato` (`IdAparato`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
