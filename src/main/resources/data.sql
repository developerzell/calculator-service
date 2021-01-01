DROP TABLE IF EXISTS calculation_history;

CREATE TABLE calculation_history (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  left_operand FLOAT(10),
  right_operand FLOAT(10),
  operand FLOAT(10)
);