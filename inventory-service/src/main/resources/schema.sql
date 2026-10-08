CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    stock_quantity INTEGER NOT NULL
);

INSERT INTO products (name, stock_quantity)
SELECT 'Mechanical Keyboard', 25
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Mechanical Keyboard');
