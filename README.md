# Baseball-Management-Program

마리아DB 테이블

CREATE TABLE stadium(
   id INT auto_increment primary key,
   stadiumName VARCHAR(100) unique not null,
   createAt TIMESTAMP
);

CREATE TABLE team(
   id int auto_increment primary key,
   teamName VARCHAR(50) unique not null,
   stadiumId INT unique NOT NULL,
   createAt TIMESTAMP
);

CREATE TABLE player(
   id int auto_increment primary key,
    playerName VARCHAR(20) not null,
    teamId INT,
    positions varchar(100) not null,
    createAt timestamp
);
ALTER TABLE player ADD UNIQUE (id, positions);

CREATE TABLE outplayer(
   id int auto_increment primary key,
   playerId INT UNIQUE NOT NULL,
   playerName VARCHAR(20) not null,
   reason longtext NOT NULL,
   createAt timestamp
);

데이터!

INSERT INTO stadium(stadiumName, createAt) VALUE ("코핀" ,now());
INSERT INTO stadium(stadiumName, createAt) VALUE ("알파트릭스" ,now());

INSERT INTO team(teamName, stadiumId, createAt) VALUE("펜릴", 1, now());
INSERT INTO team(teamName, stadiumId, createAt) VALUE("알파트릭스엔터테이먼트", 2, NOW());

INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("힐데", 1, "1루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("유미나", 1, "2루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("주시윤", 1, "3루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("이수연", 1, "포수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("김하나", 1, "좌익수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("레나", 1, "우익수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("클로에", 1, "유격수", NOW());


INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("신지아", 2, "1루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("이진", 2, "2루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("김초원", 2, "3루수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("오새롬", 2, "포수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("가브리엘", 2, "좌익수", NOW());
INSERT INTO player(playerName, teamId, positions, createAt)	VALUE ("라파엘라", 2, "우익수", NOW());
