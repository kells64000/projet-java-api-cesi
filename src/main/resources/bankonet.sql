SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de données :  bankonet
--

DROP DATABASE IF EXISTS `bankonet`;
CREATE DATABASE IF NOT EXISTS `bankonet`;

USE `bankonet`;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`) VALUES
(1, 'bousquet', 'kelian');

-- --------------------------------------------------------

--
-- Structure de la table compte
--

DROP TABLE IF EXISTS `compte`;
-- CREATE TABLE IF NOT EXISTS `compte` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `intitule` varchar(255) NOT NULL,
--   `solde` double(10,2) NOT NULL,
--   `id_client` int(11) NOT NULL,
--
--   PRIMARY KEY (`id`),
--   KEY `fk_id_client` (`id_client`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- ALTER TABLE `compte`
--   ADD CONSTRAINT `fk_id_client` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`);

-- --------------------------------------------------------

--
-- Structure de la table cc
--

DROP TABLE IF EXISTS `cc`;
CREATE TABLE IF NOT EXISTS `cc` (
  `id` int(11) NOT NULL,
  `decouvert` double(10,2) NOT NULL,
  `id_client` int(11) NOT NULL,
   PRIMARY KEY (`id_client`)
--   KEY `fk_id_compte_cc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- DROP TABLE IF EXISTS `cc`;
-- CREATE TABLE IF NOT EXISTS `cc` (
--   `id` int(11) NOT NULL,
--   `decouvert` double(10,2) NOT NULL,
--
--   PRIMARY KEY (`id`),
--   KEY `fk_id_compte_cc` (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- ALTER TABLE `cc`
--   ADD CONSTRAINT `fk_id_compte_cc` FOREIGN KEY (`id`) REFERENCES `compte` (`id`);

-- --------------------------------------------------------

--
-- Structure de la table ce
--

DROP TABLE IF EXISTS `ce`;
-- CREATE TABLE IF NOT EXISTS `ce` (
--   `id` int(11) NOT NULL,
--   `taux_interet` double(3,2) NOT NULL,
--   PRIMARY KEY (`id`),
--   KEY `fk_id_compte_ce` (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- ALTER TABLE `ce`
--   ADD CONSTRAINT `fk_id_compte_ce` FOREIGN KEY (`id`) REFERENCES `compte` (`id`);

-- --------------------------------------------------------

--
-- Structure de la table operation
--

DROP TABLE IF EXISTS `operation`;
-- CREATE TABLE IF NOT EXISTS `operation` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `id_compte_credite` int(11) NOT NULL,
--   `id_compte_debite` int(11) NOT NULL,
--   `montant` double(10,2) NOT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table hibernate_sequence
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table hibernate_sequence
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

COMMIT;
