-- Needs     	System.setProperty("hibernate.hbm2ddl.import_files_sql_extractor"
--    	  ,"org.hibernate.tool.hbm2ddl.MultipleLinesSqlCommandExtractor");

CREATE TABLE IF NOT EXISTS noun (
	id                     INTEGER PRIMARY KEY,
	english                VARCHAR(20),
	french                 VARCHAR(20),
	spanish                VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS verb (
	id                     INTEGER PRIMARY KEY,
	english                VARCHAR(20),
	french                 VARCHAR(20),
	spanish                VARCHAR(20),
	tense                  INTEGER
);

CREATE TABLE IF NOT EXISTS daily_accumulator_entity (
	id                     INTEGER PRIMARY KEY,
	bunny_id                VARCHAR(20),
	item_type                 VARCHAR(20),
	`value`                VARCHAR(20),
	`date`                  INTEGER
);