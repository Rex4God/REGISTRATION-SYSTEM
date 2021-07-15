-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2020 at 07:21 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `nysc resgistration system`
--
CREATE DATABASE IF NOT EXISTS `nysc resgistration system` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `nysc resgistration system`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `password` int(11) NOT NULL,
  `e_mail` varchar(50) NOT NULL,
  `Sec_Q` varchar(50) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `admin`:
--

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`, `e_mail`, `Sec_Q`, `Answer`) VALUES
(1, 'rex', 9000, 'rex1@gmail.com', 'What is your school name?', 'estam'),
(2, 'precious', 0, 'rextech@gmail.com', 'What is your fathers name?', 'agamuyi');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `age` int(20) NOT NULL,
  `marital_status` varchar(50) NOT NULL,
  `nysc_call_up_no` varchar(50) NOT NULL,
  `state_origin` varchar(50) NOT NULL,
  `institution_graduation` varchar(200) NOT NULL,
  `qualification_discipline` varchar(200) NOT NULL,
  `place_primary_assignment` varchar(200) NOT NULL,
  `town` varchar(100) NOT NULL,
  `local_government` varchar(200) NOT NULL,
  `nature_primary_assignment` varchar(50) NOT NULL,
  `yr_round_comm_dev_project` varchar(200) NOT NULL,
  `state_original_deployment` varchar(200) NOT NULL,
  `date_first_registration` varchar(50) NOT NULL,
  `date_registration` varchar(50) NOT NULL,
  `certificate_no` varchar(50) NOT NULL,
  `state_code` varchar(50) NOT NULL,
  `award` varchar(20) NOT NULL,
  `post_service_contact_address` varchar(200) NOT NULL,
  `remark` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `registration`:
--

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `name`, `sex`, `age`, `marital_status`, `nysc_call_up_no`, `state_origin`, `institution_graduation`, `qualification_discipline`, `place_primary_assignment`, `town`, `local_government`, `nature_primary_assignment`, `yr_round_comm_dev_project`, `state_original_deployment`, `date_first_registration`, `date_registration`, `certificate_no`, `state_code`, `award`, `post_service_contact_address`, `remark`) VALUES
(1, 'Agamuyi Precious Edobor', 'Male', 26, 'single', 'Nysc/frn/2019/711782', 'Edo   State', 'Estam', 'Computer Science', 'Gdss Pilot', 'Gombe', 'Gome', 'Teaching', 'none', 'Gombe', 'None', '20/8/2019', '27283', 'Gm/19b/2565', 'none', 'Abudu Edo State', 'good');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `state_code` (`state_code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;