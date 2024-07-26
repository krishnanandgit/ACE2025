create database legalcase;
use legalcase;

CREATE TABLE Clients (
    ClientID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Address TEXT,
    DateOfBirth DATE,
    DateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Notes TEXT
);
alter table Clients drop column Notes;

INSERT INTO Clients (ClientID, FirstName, LastName, DateOfBirth, Address, Phone, Email) VALUES
(1, 'John', 'Doe', '1980-01-01', '123 Main St, Springfield', '555-1234', 'john.doe@example.com'),
(2, 'Jane', 'Smith', '1975-05-15', '456 Elm St, Springfield', '555-5678', 'jane.smith@example.com'),
(3, 'Mike', 'Johnson', '1990-09-10', '789 Oak St, Springfield', '555-8765', 'mike.johnson@example.com'),
(4, 'Emily', 'Davis', '1985-07-20', '101 Pine St, Springfield', '555-4321', 'emily.davis@example.com'),
(5, 'Chris', 'Brown', '1978-11-30', '202 Birch St, Springfield', '555-6543', 'chris.brown@example.com'),
(6, 'Laura', 'Wilson', '1982-04-25', '303 Cedar St, Springfield', '555-3456', 'laura.wilson@example.com'),
(7, 'David', 'Martinez', '1979-08-15', '404 Spruce St, Springfield', '555-7890', 'david.martinez@example.com'),
(8, 'Sarah', 'Taylor', '1987-06-10', '505 Maple St, Springfield', '555-6789', 'sarah.taylor@example.com'),
(9, 'James', 'Anderson', '1981-03-05', '606 Oak St, Springfield', '555-5670', 'james.anderson@example.com'),
(10, 'Jessica', 'Thomas', '1992-12-25', '707 Pine St, Springfield', '555-4567', 'jessica.thomas@example.com');


CREATE TABLE Cases (
    CaseID INT PRIMARY KEY AUTO_INCREMENT,
    ClientID INT,
    CaseTitle VARCHAR(255),
    CaseDescription TEXT,
    CaseType VARCHAR(50),
    CaseStatus VARCHAR(50),
    DateOpened DATE,
    DateClosed DATE,
    Notes TEXT,
    FOREIGN KEY (ClientID) REFERENCES Clients(ClientID)
);

INSERT INTO Cases (CaseID, ClientID, CaseType, DateOpened, DateClosed, CaseStatus) VALUES
(1, 1, 'Divorce', '2023-01-01', '2023-05-01', 'Closed'),
(2, 2, 'Personal Injury', '2023-02-01', NULL, 'Open'),
(3, 3, 'Criminal Defense', '2023-03-01', NULL, 'Open'),
(4, 4, 'Contract Dispute', '2023-04-01', '2023-06-01', 'Closed'),
(5, 5, 'Real Estate', '2023-05-01', NULL, 'Open'),
(6, 6, 'Bankruptcy', '2023-06-01', NULL, 'Open'),
(7, 7, 'Employment', '2023-07-01', '2023-08-01', 'Closed'),
(8, 8, 'Intellectual Property', '2023-08-01', NULL, 'Open'),
(9, 9, 'Immigration', '2023-09-01', NULL, 'Open'),
(10, 10, 'Family Law', '2023-10-01', '2023-12-01', 'Closed');

CREATE TABLE Lawyers (
    LawyerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Specialization VARCHAR(100),
    BarNumber VARCHAR(50),
    DateHired DATE,
    Notes TEXT
);
Alter table Lawyers  add column DateOfBirth DATE;

INSERT INTO Lawyers (LawyerID, FirstName, LastName, DateOfBirth, DateHired, Specialization) VALUES
(1, 'Alice', 'Taylor', '1978-02-20', '2010-06-01', 'Family Law'),
(2, 'Bob', 'Williams', '1981-03-22', '2011-07-15', 'Personal Injury'),
(3, 'Charlie', 'Brown', '1985-04-25', '2012-08-30', 'Criminal Law'),
(4, 'David', 'Johnson', '1979-05-30', '2013-09-10', 'Corporate Law'),
(5, 'Emma', 'Davis', '1983-07-11', '2014-10-05', 'Employment Law'),
(6, 'Frank', 'Garcia', '1976-08-21', '2015-11-20', 'Real Estate Law'),
(7, 'Grace', 'Martinez', '1982-09-15', '2016-12-25', 'Intellectual Property Law'),
(8, 'Hank', 'Rodriguez', '1984-10-10', '2017-01-30', 'Tax Law'),
(9, 'Ivy', 'Wilson', '1986-11-05', '2018-03-10', 'Environmental Law'),
(10, 'Jack', 'Clark', '1987-12-22', '2019-04-15', 'Immigration Law');

CREATE TABLE CaseAssignments (
    AssignmentID INT PRIMARY KEY AUTO_INCREMENT,
    CaseID INT,
    LawyerID INT,
    AssignmentDate DATE,
    Role VARCHAR(50),
    Notes TEXT,
    FOREIGN KEY (CaseID) REFERENCES Cases(CaseID),
    FOREIGN KEY (LawyerID) REFERENCES Lawyers(LawyerID)
);
Alter table CaseAssignments add column status VARCHAR(50);
INSERT INTO CaseAssignments (AssignmentID, CaseID, LawyerID, AssignmentDate, status) VALUES
(1, 1, 1, '2023-01-01', 'Open'),
(2, 2, 2, '2023-01-02', 'Closed'),
(3, 3, 3, '2023-01-03', 'In Progress'),
(4, 4, 4, '2023-01-04', 'Open'),
(5, 5, 5, '2023-01-05', 'Closed'),
(6, 6, 6, '2023-01-06', 'Open'),
(7, 7, 7, '2023-01-07', 'In Progress'),
(8, 8, 8, '2023-01-08', 'Closed'),
(9, 9, 9, '2023-01-09', 'Open'),
(10, 10, 10, '2023-01-10', 'Closed');
CREATE TABLE Documents (
    DocumentID INT PRIMARY KEY AUTO_INCREMENT,
    CaseID INT,
    DocumentName VARCHAR(255),
    DocumentType VARCHAR(50),
    UploadDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FilePath VARCHAR(255), -- or use a BLOB for file storage
    Notes TEXT,
    FOREIGN KEY (CaseID) REFERENCES Cases(CaseID)
);

INSERT INTO Documents (DocumentID, CaseID, DocumentType, UploadDate, FilePath, Notes) VALUES
(1, 1, 'Pleading', '2023-01-01', '/documents/pleading_1.pdf', 'Initial Pleading Document'),
(2, 2, 'Evidence', '2023-01-02', '/documents/evidence_2.pdf', 'Photographic Evidence'),
(3, 3, 'Contract', '2023-01-03', '/documents/contract_3.pdf', 'Client Contract'),
(4, 4, 'Report', '2023-01-04', '/documents/report_4.pdf', 'Expert Witness Report'),
(5, 5, 'Affidavit', '2023-01-05', '/documents/affidavit_5.pdf', 'Sworn Affidavit'),
(6, 6, 'Pleading', '2023-01-06', '/documents/pleading_6.pdf', 'Amended Pleading'),
(7, 7, 'Evidence', '2023-01-07', '/documents/evidence_7.pdf', 'Video Evidence'),
(8, 8, 'Contract', '2023-01-08', '/documents/contract_8.pdf', 'Settlement Agreement'),
(9, 9, 'Report', '2023-01-09', '/documents/report_9.pdf', 'Medical Report'),
(10, 10, 'Affidavit', '2023-01-10', '/documents/affidavit_10.pdf', 'Witness Affidavit');



CREATE TABLE Billing (
    BillingID INT PRIMARY KEY AUTO_INCREMENT,
    CaseID INT,
    ClientID INT,
    LawyerID INT,
    DateBilled DATE,
    Amount DECIMAL(10, 2),
    BillingStatus VARCHAR(50),
    Notes TEXT,
    FOREIGN KEY (CaseID) REFERENCES Cases(CaseID),
    FOREIGN KEY (ClientID) REFERENCES Clients(ClientID),
    FOREIGN KEY (LawyerID) REFERENCES Lawyers(LawyerID)
);
Alter table Billing add column PaidDate DATE;


INSERT INTO Billing (BillingID, CaBseID, Amount, DateBilled, PaidDate , BillingStatus) VALUES
(1, 1, 500.00, '2023-01-01', '2023-01-10', 'Paid'),
(2, 2, 1000.00, '2023-01-02', '2023-01-15', 'Paid'),
(3, 3, 750.00, '2023-01-03', '2023-01-20', 'Paid'),
(4, 4, 200.00, '2023-01-04', '2023-01-25', 'Paid'),
(5, 5, 1500.00, '2023-01-05', '2023-01-30', 'Paid'),
(6, 6, 300.00, '2023-01-06', '2023-02-05', 'Unpaid'),
(7, 7, 400.00, '2023-01-07', '2023-02-10', 'Unpaid'),
(8, 8, 600.00, '2023-01-08', '2023-02-15', 'Unpaid'),
(9, 9, 700.00, '2023-01-09', '2023-02-20', 'Unpaid'),
(10, 10, 800.00, '2023-01-10', '2023-02-25', 'Unpaid');




