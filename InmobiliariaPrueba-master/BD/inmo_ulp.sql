-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2019 a las 01:10:40
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmo_ulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `id_contrato` int(11) NOT NULL,
  `id_inmueble` int(11) NOT NULL,
  `dni_inquilino` int(11) NOT NULL,
  `estado_contrato` varchar(50) COLLATE utf8_bin NOT NULL,
  `monto` double NOT NULL,
  `fecha_ini` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`id_contrato`, `id_inmueble`, `dni_inquilino`, `estado_contrato`, `monto`, `fecha_ini`, `fecha_fin`) VALUES
(2, 52, 12345678, 'NO VIGENTE', 15000, '2019-11-01 00:00:00', '2020-12-01 00:00:00'),
(3, 48, 25999888, 'VIGENTE', 6000, '2019-11-02 00:00:00', '2021-11-02 00:00:00'),
(4, 42, 32777788, 'NO VIGENTE', 4565, '2019-11-01 00:00:00', '2019-11-07 00:00:00'),
(5, 51, 25999888, 'NO VIGENTE', 15500, '2019-11-01 00:00:00', '2021-12-18 00:00:00'),
(6, 50, 12345678, 'VIGENTE', 45555, '2020-11-13 00:00:00', '2021-11-13 00:00:00'),
(7, 54, 32777788, 'NO VIGENTE', 7000, '2019-11-14 00:00:00', '2021-11-26 00:00:00'),
(8, 42, 12345678, 'VIGENTE', 14000, '2018-11-15 00:00:00', '2019-11-30 00:00:00'),
(9, 52, 25999888, 'NO VIGENTE', 42343, '2019-11-09 00:00:00', '2020-11-19 00:00:00'),
(10, 54, 32, 'VIGENTE', 12000, '2019-11-29 00:00:00', '2018-11-23 00:00:00'),
(11, 52, 32777788, 'VIGENTE', 42343, '2019-11-08 00:00:00', '2021-11-19 00:00:00'),
(12, 55, 12445564, 'VIGENTE', 10000, '2019-11-08 00:00:00', '2020-11-20 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `id_inmueble` int(11) NOT NULL,
  `id_tipo_inmueble` int(11) NOT NULL,
  `dni_propietario` int(8) NOT NULL,
  `direccion_inmueble` varchar(100) COLLATE utf8_bin NOT NULL,
  `superficie` double NOT NULL,
  `precio_base` double NOT NULL,
  `estado_inmueble` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `inmueble`
--

INSERT INTO `inmueble` (`id_inmueble`, `id_tipo_inmueble`, `dni_propietario`, `direccion_inmueble`, `superficie`, `precio_base`, `estado_inmueble`) VALUES
(39, 4, 12370189, 'Por ahi 2000', 52147, 4000, 'No disponible'),
(40, 1, 12370189, 'Somewhere over the rainbow', 7562, 6000, 'No disponible'),
(42, 4, 12370189, 'Lejos', 5200, 14000, 'No disponible'),
(45, 4, 43620916, 'La quiaca', 65412, 1000, 'No disponible'),
(48, 11, 43620916, 'HOLLYWOOD LANE', 60, 10000, 'No disponible'),
(50, 1, 45548887, 'Rivadavia 589', 80, 12000, 'No disponible'),
(51, 1, 7565655, 'Estocolmo 435', 45, 12000, 'Disponible'),
(52, 20, 24255552, 'Viva 424', 134, 42343, 'No disponible'),
(54, 8, 43553222, 'Saen Peña 558, Lanus', 98, 12000, 'No disponible'),
(55, 12, 10234123, 'Siria 252,Bariloche', 120, 15000, 'No disponible'),
(56, 1, 12344444, 'Cespedes 525, Capital Federal', 40, 10000, 'Disponible'),
(57, 8, 29000122, 'Gaona 454, Cordoba', 120, 11000, 'Disponible'),
(59, 9, 24255552, 'Sartre 544', 80, 455, 'Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `dni_inquilino` int(11) NOT NULL,
  `nombre_inquilino` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido_inquilino` varchar(50) COLLATE utf8_bin NOT NULL,
  `cuit_inquilino` varchar(20) COLLATE utf8_bin NOT NULL,
  `lugar_trabajo_inquilino` varchar(150) COLLATE utf8_bin NOT NULL,
  `nom_garante_inquilino` varchar(150) COLLATE utf8_bin NOT NULL,
  `dni_garante_inquilino` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `inquilino`
--

INSERT INTO `inquilino` (`dni_inquilino`, `nombre_inquilino`, `apellido_inquilino`, `cuit_inquilino`, `lugar_trabajo_inquilino`, `nom_garante_inquilino`, `dni_garante_inquilino`) VALUES
(32, 'Adolfo', 'Garcia', '21-3245632|', 'Arcor', 'Pablo', 41),
(54, 'Jose', 'Perez', '20-32323232-4', 'oficina', 'Jorge', 3213455),
(12345678, 'Pepe', 'Sanchez', '20123456786', 'VEA', 'Michael Jacson', 12345679),
(12445564, 'Juan Domingo', 'Perdon', '10-12445564-6', 'Molinos sa', 'Lope Vega', 400031),
(25999888, 'Mirta Sofia', 'Tundi', '23-25999888-2', 'Wms', 'Claudia Mafe', 30215544),
(32777788, 'Susana', 'Carlto', '20-325455-55', 'San Luis', 'Roberto Sanchez', 20154454),
(35245444, 'Sara', 'Connor', '23-3424244-44', 'Arizona', 'Terminator', 800);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `dni_propietario` int(8) NOT NULL,
  `nombre_propietario` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido_propietario` varchar(50) COLLATE utf8_bin NOT NULL,
  `domicilio_propietario` varchar(100) COLLATE utf8_bin NOT NULL,
  `telefono_propietario` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`dni_propietario`, `nombre_propietario`, `apellido_propietario`, `domicilio_propietario`, `telefono_propietario`) VALUES
(242444, 'Saa', 'Alberto', 'Colon 544', '242424'),
(7565655, 'Salmon', 'Clame', 'Claut 44', '243255'),
(10234123, 'Pedro', 'Soriano', 'Lago Pue 544, Bariloche', '2564889977'),
(12344444, 'Mauricio', 'Garfield', 'Olivos 552, Vicente Lopez', '011455588888'),
(12370189, 'Estela', 'Artois', 'Belgica 54', '5624863'),
(23244444, 'Juan', 'Manzur', 'Salta 1234', '24562444422'),
(24255552, 'Patrica', 'Burlich', 'Bomba 35', '353'),
(29000122, 'Laura', 'Saeta', 'Girona 2333, Cordoba', '26579944400'),
(43553222, 'Ernestina', 'Paez', 'San luis', '3434333223'),
(43620916, 'Ariana', 'Grande', 'New York', '6579124'),
(45548887, 'Marcela', 'Morelo', 'Marte 325', '2664888999'),
(72647277, 'Pepita', 'Suarez', 'Mitre 435', '01145678987');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_inmueble`
--

CREATE TABLE `tipo_inmueble` (
  `id_tipo_inmueble` int(11) NOT NULL,
  `tipo_inmueble` varchar(50) NOT NULL,
  `zona_inmueble` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_inmueble`
--

INSERT INTO `tipo_inmueble` (`id_tipo_inmueble`, `tipo_inmueble`, `zona_inmueble`) VALUES
(1, 'Departamento', 'Centro'),
(2, 'Departamento', 'Zona Norte'),
(3, 'Departamento', 'Zona Sur'),
(4, 'Departamento', 'Zona Oeste'),
(5, 'Local', 'Centro'),
(6, 'Local', 'Zona Oeste'),
(7, 'Local', 'Zona Sur'),
(8, 'Local', 'Zona Norte'),
(9, 'Casa', 'Centro'),
(10, 'Casa', 'Zona Oeste'),
(11, 'Casa', 'Zona Norte'),
(12, 'Casa', 'Zona Sur'),
(13, 'Oficina', 'Centro'),
(14, 'Oficina', 'Zona Oeste'),
(15, 'Oficina', 'Zona Sur'),
(16, 'Oficina', 'Zona Norte'),
(17, 'Oficina', 'Zona Este'),
(18, 'Departamento', 'Zona Este'),
(19, 'Local', 'Zona Este'),
(20, 'Casa', 'Zona Este');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`id_contrato`),
  ADD KEY `id_inmueble` (`id_inmueble`),
  ADD KEY `id_inquilino` (`dni_inquilino`);

--
-- Indices de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`id_inmueble`),
  ADD KEY `dni_propietario` (`dni_propietario`),
  ADD KEY `id_tipo_inmueble` (`id_tipo_inmueble`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`dni_inquilino`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`dni_propietario`);

--
-- Indices de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
  ADD PRIMARY KEY (`id_tipo_inmueble`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contrato`
--
ALTER TABLE `contrato`
  MODIFY `id_contrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `id_inmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `dni_inquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35245445;

--
-- AUTO_INCREMENT de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
  MODIFY `id_tipo_inmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`id_inmueble`) REFERENCES `inmueble` (`id_inmueble`),
  ADD CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`dni_inquilino`) REFERENCES `inquilino` (`dni_inquilino`);

--
-- Filtros para la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD CONSTRAINT `inmueble_ibfk_1` FOREIGN KEY (`dni_propietario`) REFERENCES `propietario` (`dni_propietario`),
  ADD CONSTRAINT `inmueble_ibfk_2` FOREIGN KEY (`id_tipo_inmueble`) REFERENCES `tipo_inmueble` (`id_tipo_inmueble`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
