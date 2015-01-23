CREATE TABLE user(id INTEGER generated by default as identity PRIMARY KEY , login VARCHAR (40) NOT NULL UNIQUE ,email VARCHAR (40) NOT NULL UNIQUE ,  password INTEGER not NULL ,
  fullname VARCHAR (120) NOT NULL, phone VARCHAR (20) NOT NULL,
   info VARCHAR(2048), isActivated BOOLEAN DEFAULT FALSE, isAdmin BOOLEAN DEFAULT FALSE);
CREATE TABLE topic(id INTEGER generated by default as identity PRIMARY KEY , name VARCHAR (360) NOT NULL UNIQUE );
CREATE TABLE chat(id INTEGER generated by default as identity PRIMARY KEY , topicId INTEGER NOT NULL REFERENCES topic(id) ON DELETE CASCADE,name VARCHAR (360) NOT NULL UNIQUE );
CREATE TABLE message(id INTEGER generated by default as identity PRIMARY KEY , chatId INTEGER NOT NULL REFERENCES chat(id) ON DELETE CASCADE,
  userId INTEGER NOT NULL REFERENCES user(id) ON DELETE NO ACTION, text VARCHAR (2048) NOT NULL, sent DATE NOT NULL);
