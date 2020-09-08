CREATE TABLE IF NOT EXISTS contact (
  id 		int(11) NOT NULL AUTO_INCREMENT,
  name 		varchar(45) NOT NULL,
  phone 	varchar(45) NOT NULL,
  address 	varchar(45) NOT NULL,
  country 	varchar(30) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
