-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2019 a las 04:13:11
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `callcenter`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agente`
--

CREATE TABLE `agente` (
  `DOCUMENTO_AGENT` char(15) NOT NULL,
  `NOMBRE_AGENT` char(255) NOT NULL,
  `EDAD_AGENT` int(11) NOT NULL,
  `GENERO_AGENT` char(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `agente`
--

INSERT INTO `agente` (`DOCUMENTO_AGENT`, `NOMBRE_AGENT`, `EDAD_AGENT`, `GENERO_AGENT`) VALUES
('1014288259', 'Diego Alejandro Fuentes Barreto', 21, 'Masculino'),
('1030588484', 'Miguel Angel Lozano Barrera', 28, 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `COD_ESTADO` char(15) NOT NULL,
  `NOMBRE_ESTADO` char(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`COD_ESTADO`, `NOMBRE_ESTADO`) VALUES
('ACTV01', 'ACTIVO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_agente`
--

CREATE TABLE `estado_agente` (
  `COD_ESTAGEN` int(11) NOT NULL,
  `FECHA_ESTAGEN` date NOT NULL,
  `HORA_ESTAGEN` time NOT NULL,
  `DOCUMENTO_AGENT` char(15) NOT NULL,
  `COD_ESTADO` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agente`
--
ALTER TABLE `agente`
  ADD PRIMARY KEY (`DOCUMENTO_AGENT`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`COD_ESTADO`);

--
-- Indices de la tabla `estado_agente`
--
ALTER TABLE `estado_agente`
  ADD PRIMARY KEY (`COD_ESTAGEN`),
  ADD KEY `DOCUMENTO_AGENT` (`DOCUMENTO_AGENT`),
  ADD KEY `COD_ESTADO` (`COD_ESTADO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estado_agente`
--
ALTER TABLE `estado_agente`
  MODIFY `COD_ESTAGEN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estado_agente`
--
ALTER TABLE `estado_agente`
  ADD CONSTRAINT `estado_agente_ibfk_1` FOREIGN KEY (`DOCUMENTO_AGENT`) REFERENCES `agente` (`DOCUMENTO_AGENT`),
  ADD CONSTRAINT `estado_agente_ibfk_2` FOREIGN KEY (`COD_ESTADO`) REFERENCES `estado` (`COD_ESTADO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
