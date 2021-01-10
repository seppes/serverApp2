insert into BOOK
(ID, TITLE, AUTHOR, PRICE)
values
(nextval('BOOK_SEQ'), 'Oryx and Crake', 'Margaret Atwood', 10);

insert into BOOK
(ID, TITLE, AUTHOR, PRICE)
values
(nextval('BOOK_SEQ'), 'The year of the flood', 'Margaret Atwood', 11);

insert into BOOK
(ID, TITLE, AUTHOR, PRICE)
values
(nextval('BOOK_SEQ'), 'MaddAddam', 'Margaret Atwood', 12);

insert into BOOK
(ID, TITLE, AUTHOR, PRICE)
values
(nextval('BOOK_SEQ'), '1Q84', 'Haruki Murakami', 13);

insert into BOOK
(ID, TITLE, AUTHOR, PRICE)
values
(nextval('BOOK_SEQ'), 'De opwindvogelkronieken', 'Haruki Murakami', 14);

insert into GENRE
(ID, NAME)
values
(nextval('GENRE_SEQ'), 'fantasy');

insert into GENRE
(ID, NAME)
values
(nextval('GENRE_SEQ'), 'fiction');

insert into GENRE
(ID, NAME)
values
(nextval('GENRE_SEQ'), 'non-fiction');

insert into GENRE
(ID, NAME)
values
(nextval('GENRE_SEQ'), 'thriller');