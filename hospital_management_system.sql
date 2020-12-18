-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 01:15 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_information`
--

CREATE TABLE `doctor_information` (
  `Doctor_ID` varchar(120) DEFAULT NULL,
  `Name` varchar(120) DEFAULT NULL,
  `Contact_Number` varchar(300) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` varchar(120) DEFAULT NULL,
  `Duration_Time` varchar(120) DEFAULT NULL,
  `Dr_Information` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_information`
--

INSERT INTO `doctor_information` (`Doctor_ID`, `Name`, `Contact_Number`, `Age`, `Gender`, `Duration_Time`, `Dr_Information`) VALUES
('1', 'Dr. Sanat', '1534534', 56, 'Male', '2.00-8.00 pm', 'Medicine Specialist'),
('2', 'Dr. Kazi Ali', '1885645', 45, 'Male', '6.00-10.00 pm', 'Cardiologist'),
('16', 'Dr.Uday', '16442', 44, 'Male', '12.00pm-8.00pm', 'Dentist'),
('10', 'Dr. Rohit', '578234', 50, 'Male', '7.00am-3.00pm', 'Skin'),
('6', 'Dr. Anik', '323542', 53, 'Male', '1.00-11.00 pm', ' Endocrinologist'),
('8', 'Dr. Anika', '013455', 34, 'Female', '8.00am-2.00pm', 'Gynecolgist'),
('5', 'Tasin', '1324234', 33, 'MAle', '4-6 pm', 'Family planing');

-- --------------------------------------------------------

--
-- Table structure for table `patient_information`
--

CREATE TABLE `patient_information` (
  `Patient_ID` varchar(120) DEFAULT NULL,
  `Name` varchar(120) DEFAULT NULL,
  `Contact_Number` varchar(120) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` varchar(120) DEFAULT NULL,
  `Blood_Group` varchar(120) DEFAULT NULL,
  `Address` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_information`
--

INSERT INTO `patient_information` (`Patient_ID`, `Name`, `Contact_Number`, `Age`, `Gender`, `Blood_Group`, `Address`) VALUES
('1', 'Shovon', '171007', 22, 'Male', 'B+', 'Kamarkhali,Faridpur'),
('2', 'Tanvir', '194586', 25, 'Male', 'A+', 'Mogbazar,Dhaka'),
('3', 'Jagat', '15354', 54, 'Male', 'AB-', 'Nator,Chapakhali'),
('4', 'Tasin Rohinga', '14788', 66, 'Others', 'O-', 'Ukhia,Cox-Bazar'),
('13', 'Monika', '34561', 54, 'Female', 'AB+', 'Razabag,Dhaka'),
('9', 'MS. Dhoni', '131467', 36, 'Male', 'AB+', 'Chennai,India'),
('17', 'Nishan', '12364246', 22, 'Male', 'O+', 'Mirpur,Dhaka'),
('5', 'Tasin Malek', '0122785', 54, 'Male', 'A+', 'Takpara,Cox-Bazar');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
