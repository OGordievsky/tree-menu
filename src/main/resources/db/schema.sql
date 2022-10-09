DROP TABLE IF EXISTS test_categories;
CREATE TABLE test_categories (
                                 id INT PRIMARY KEY,
                                 name VARCHAR NOT NULL,
                                 parent_id INT
);